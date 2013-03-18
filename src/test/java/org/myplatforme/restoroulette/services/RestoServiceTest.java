package org.myplatforme.restoroulette.services;

import static org.fest.assertions.Assertions.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myplatforme.restoroulette.config.AppConfig;
import org.myplatforme.restoroulette.domain.Resto;
import org.myplatforme.restoroulette.services.utils.RestosFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles("dev")
public class RestoServiceTest {

	final static Logger LOGGER = LoggerFactory.getLogger(RestoServiceTest.class);
	@Autowired
	private RestoService restoService;

	Resto resto1, resto2;

	@Before
	public void setUp() throws Exception {

		resto1 = RestosFactory.getResto("1");
		restoService.saveOrUpdate(resto1);
		resto2 = RestosFactory.getResto("2");
		restoService.saveOrUpdate(resto2);
	}

	@Test
	public void getRestoByIdTest() {

		Resto resto = restoService.getById(resto1.getId());
		LOGGER.info(resto.toString());
		assertThat(resto.getTitle()).isEqualTo("title1");
	}

	@Test
	public void findAllRestosTest() throws Exception {
		List<Resto> restos = restoService.getAll();
		assertThat(restos).hasSize(2);
	}

	@After
	public void tearDown() {
		restoService.dropCollection();
	}
}
