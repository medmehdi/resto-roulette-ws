package org.myplatforme.restoroulette.services.impl;

import java.util.List;

import org.myplatforme.restoroulette.domain.Address;
import org.myplatforme.restoroulette.domain.Coordinates;
import org.myplatforme.restoroulette.domain.Resto;
import org.myplatforme.restoroulette.services.RestoService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

@Component
@Profile("mock")
public class RestoServiceMock implements RestoService {

	@Override
	public void saveOrUpdate(Resto resto) {
		// TODO Auto-generated method stub

	}

	@Override
	public Resto getById(String id) {
		Coordinates coordinates = new Coordinates(12345.34, 54319.45);
		Address address = new Address(2, "toto" + id, "toto" + id, "toto" + id, "toto" + id, coordinates);
		Resto resto = new Resto("title" + id, "imageUrl" + id, "description" + id, address, "accessUrl" + id);
		return resto;
	}

	@Override
	public List<Resto> getAll() {
		int id = 0;
		List<Resto> restos = Lists.newArrayList();
		Coordinates coordinates = new Coordinates(12345.34, 54319.45);
		Address address = new Address(2, "toto" + id++, "toto" + id, "toto" + id, "toto" + id, coordinates);
		Resto resto = new Resto("title" + id, "imageUrl" + id, "description" + id, address, "accessUrl" + id);
		restos.add(resto);
		restos.add(resto);
		restos.add(resto);
		restos.add(resto);
		return restos;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Resto> findByCoordinates(double longitude, double latitude) {
		// TODO Auto-generated method stub
		return null;
	}

}
