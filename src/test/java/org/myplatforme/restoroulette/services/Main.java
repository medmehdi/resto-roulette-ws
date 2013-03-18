package org.myplatforme.restoroulette.services;

import java.net.UnknownHostException;

import org.jongo.MongoCollection;
import org.myplatforme.restoroulette.domain.DbCollection;
import org.myplatforme.restoroulette.mongodb.utils.JongoManager;
import org.myplatforme.restoroulette.services.utils.RestosFactory;

import com.mongodb.Mongo;

public class Main {

	public static void main(String[] args) {

		try {
			Mongo mongo = new Mongo("localhost", 27017);
			JongoManager jongoManager = new JongoManager(mongo, "resto-roulette");
			MongoCollection collection = jongoManager.getCollection(DbCollection.RESTOS);

			collection.save(RestosFactory.getResto("444"));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
