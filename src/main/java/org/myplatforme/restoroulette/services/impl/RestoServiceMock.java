package org.myplatforme.restoroulette.services.impl;

import java.util.List;

import org.myplatforme.restoroulette.domain.Resto;
import org.myplatforme.restoroulette.services.RestoService;
import org.myplatforme.restoroulette.services.utils.RestosFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("mock")
public class RestoServiceMock implements RestoService {

	@Override
	public void saveOrUpdate(Resto resto) {

	}

	@Override
	public Resto getById(String id) {
		return RestosFactory.getResto(id);
	}

	@Override
	public List<Resto> getAll() {
		return RestosFactory.getAllRestos(4);
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

	@Override
	public void dropCollection() {
		// TODO Auto-generated method stub

	}

}
