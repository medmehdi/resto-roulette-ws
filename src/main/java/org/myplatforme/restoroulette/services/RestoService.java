package org.myplatforme.restoroulette.services;

import java.util.List;

import org.myplatforme.restoroulette.domain.Resto;

public interface RestoService {

	void saveOrUpdate(Resto resto);

	Resto getById(String id);

	List<Resto> getAll();

	void delete(int id);

	List<Resto> findByCoordinates(double longitude, double latitude);

	void dropCollection();

}
