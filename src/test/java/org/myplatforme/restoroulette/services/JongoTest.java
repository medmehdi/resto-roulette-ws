package org.myplatforme.restoroulette.services;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myplatforme.restoroulette.config.AppConfig;
import org.myplatforme.restoroulette.domain.DbCollection;
import org.myplatforme.restoroulette.domain.Resto;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles({ "dev", "embMongo" })
public class JongoTest extends AbstractServiceTest {

	public void init() throws Exception {

		collection = mongoDbManager.getCollection(DbCollection.RESTOS);

		int id = 0;
		Resto resto = new Resto("title" + id, "imageUrl" + id, "description" + id, "address" + id, 1111.23, 1111.23, "accessUrl" + id);
		collection.save(resto);
		resto = new Resto("title" + id, "imageUrl" + id, "description" + id, "address" + id, 1111.23, 1111.23, "accessUrl" + id);
		collection.save(resto);
	}

	@Test
	public void findAll() throws Exception {
		Iterable<Resto> restos = collection.find().as(Resto.class);
		assertThat(restos).hasSize(2);
	}

}