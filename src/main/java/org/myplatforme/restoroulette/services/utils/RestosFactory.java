package org.myplatforme.restoroulette.services.utils;

import java.util.List;

import org.myplatforme.restoroulette.domain.Address;
import org.myplatforme.restoroulette.domain.Coordinates;
import org.myplatforme.restoroulette.domain.Resto;

import com.google.common.collect.Lists;

public class RestosFactory {

	public static Resto getResto(String id) {
		Coordinates coordinates = new Coordinates(12345.34, 54319.45);
		Address address = new Address(2, "toto" + id, "toto" + id, "toto" + id, "toto" + id, coordinates);
		Resto resto = new Resto("title" + id, "imageUrl" + id, "description" + id, address, "accessUrl" + id);
		return resto;
	}

	public static List<Resto> getAllRestos(int limit) {
		List<Resto> result = Lists.newArrayList();
		for (int i = 0; i > limit; i++) {
			result.add(getResto("" + i));
		}
		return result;
	}
}
