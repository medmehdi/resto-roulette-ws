package org.myplatforme.restoroulette.services;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myplatforme.restoroulette.config.AppConfig;
import org.myplatforme.restoroulette.domain.Address;
import org.myplatforme.restoroulette.domain.Coordinates;
import org.myplatforme.restoroulette.domain.DbCollection;
import org.myplatforme.restoroulette.domain.Resto;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles({ "dev", "mongo" })
public class JongoTest extends AbstractServiceTest {

	public void init() throws Exception {

		collection = mongoDbManager.getCollection(DbCollection.RESTOS);

		int id = 0;
		Coordinates coordinates = new Coordinates(12345.34, 54319.45);
		Address address = new Address(2, "toto" + id, "toto" + id, "toto" + id, "toto" + id, coordinates);
		Resto resto = new Resto("title" + id, "imageUrl" + id, "description" + id, address, "accessUrl" + id);
		id++;
		collection.save(resto);
		address = new Address(2, "toto" + id, "toto" + id, "toto" + id, "toto" + id, coordinates);
		resto = new Resto("title" + id, "imageUrl" + id, "description" + id, address, "accessUrl" + id);
		collection.save(resto);
	}

	@Test
	public void findAll() throws Exception {
		Iterable<Resto> restos = collection.find().as(Resto.class);
		assertThat(restos).hasSize(2);
	}

}