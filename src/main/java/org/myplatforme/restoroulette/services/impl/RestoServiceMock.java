package org.myplatforme.restoroulette.services.impl;

import java.util.List;

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
		Resto resto = new Resto("title" + id, "imageUrl" + id, "description" + id, "address" + id, 1111.23, 1111.23, "accessUrl" + id);
		return resto;
	}

	@Override
	public List<Resto> getAll() {
		int id = 0;
		List<Resto> restos = Lists.newArrayList();
		restos.add(new Resto("title" + id, "imageUrl" + id, "description" + id, "address" + id, 1111.23, 1111.23, "accessUrl" + id));
		restos.add(new Resto("title" + id, "imageUrl" + id, "description" + id, "address" + id, 1111.23, 1111.23, "accessUrl" + id));
		restos.add(new Resto("title" + id, "imageUrl" + id, "description" + id, "address" + id, 1111.23, 1111.23, "accessUrl" + id));
		restos.add(new Resto("title" + id, "imageUrl" + id, "description" + id, "address" + id, 1111.23, 1111.23, "accessUrl" + id));

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
