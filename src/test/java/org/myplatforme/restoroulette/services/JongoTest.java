package org.myplatforme.restoroulette.services;

import static org.fest.assertions.Assertions.assertThat;

import org.jongo.MongoCollection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myplatforme.restoroulette.config.AppConfig;
import org.myplatforme.restoroulette.domain.DbCollection;
import org.myplatforme.restoroulette.domain.Resto;
import org.myplatforme.restoroulette.mongodb.utils.JongoManager;
import org.myplatforme.restoroulette.services.utils.RestosFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles("dev")
public class JongoTest {

	protected MongoCollection collection;

	@Autowired
	protected JongoManager mongoDbManager;

	@Before
	public void setUp() throws Exception {
		collection = mongoDbManager.getCollection(DbCollection.RESTOS);

		collection.save(RestosFactory.getResto("1"));
		collection.save(RestosFactory.getResto("1"));
	}

	@Test
	public void findAll() throws Exception {
		Iterable<Resto> restos = collection.find().as(Resto.class);
		assertThat(restos).hasSize(2);
	}

	@After
	public void tearDown() {
		collection.drop();
	}

}