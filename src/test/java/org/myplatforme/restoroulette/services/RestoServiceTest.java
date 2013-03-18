package org.myplatforme.restoroulette.services;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myplatforme.restoroulette.config.AppConfig;
import org.myplatforme.restoroulette.domain.Resto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles("mock")
public class RestoServiceTest {

	final static Logger LOGGER = LoggerFactory.getLogger(RestoServiceTest.class);
	@Autowired
	private RestoService restoService;

	@Test
	public void testRestoService() {

		Resto resto = restoService.getById("1");
		LOGGER.info(resto.toString());
		assertThat(resto.getTitle()).isEqualTo("title1");
	}
}
