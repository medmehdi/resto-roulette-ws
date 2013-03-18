package org.myplatforme.restoroulette.services.impl;

import static org.jongo.Oid.withOid;

import java.util.List;

import org.myplatforme.restoroulette.domain.DbCollection;
import org.myplatforme.restoroulette.domain.Resto;
import org.myplatforme.restoroulette.mongodb.utils.JongoManager;
import org.myplatforme.restoroulette.services.RestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

@Component
@Profile("dev")
public class RestoServiceImpl implements RestoService {

	@Autowired
	JongoManager jongoManager;

	@Override
	public void saveOrUpdate(Resto resto) {
		jongoManager.getCollection(DbCollection.RESTOS).save(resto);

	}

	@Override
	public Resto getById(String id) {
		return jongoManager.getCollection(DbCollection.RESTOS).findOne(withOid(id)).as(Resto.class);
	}

	@Override
	public List<Resto> getAll() {
		return Lists.newArrayList(jongoManager.getCollection(DbCollection.RESTOS).find().as(Resto.class));
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
