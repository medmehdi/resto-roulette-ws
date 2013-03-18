package org.myplatforme.restoroulette.mongodb.utils;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.myplatforme.restoroulette.domain.DbCollection;

import com.mongodb.DB;
import com.mongodb.Mongo;

public class JongoManager {

	private final Jongo jongo;

	public JongoManager(Mongo mongo, String databaseName, String login, char[] password) {
		this(mongo, databaseName);
		jongo.getDatabase().authenticate(login, password);
	}

	public JongoManager(Mongo mongo, String databaseName) {
		DB db = mongo.getDB(databaseName);
		jongo = new Jongo(db);
	}

	public MongoCollection getCollection(DbCollection collection) {

		return jongo.getCollection(collection.getCollectionName());

	}

}
