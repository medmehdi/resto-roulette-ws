package org.myplatforme.restoroulette.services;

import org.jongo.MongoCollection;
import org.junit.After;
import org.junit.Before;
import org.myplatforme.restoroulette.mongodb.utils.JongoManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.MongodConfig;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;

public abstract class AbstractServiceTest {
	protected static final Logger logger = LoggerFactory.getLogger(JongoTest.class);
	private MongodExecutable _mongodExe;
	private MongodProcess _mongod;

	protected MongoCollection collection;

	@Autowired
	protected JongoManager mongoDbManager;

	protected abstract void init() throws Exception;

	@Before
	public void setUp() throws Exception {
		MongodStarter runtime = MongodStarter.getDefaultInstance();

		_mongodExe = runtime.prepare(new MongodConfig(Version.Main.V2_2, 12345, Network.localhostIsIPv6()));
		_mongod = _mongodExe.start();

		init();
	}

	@After
	public void tearDown() {
		collection.drop();
		_mongod.stop();
		_mongodExe.stop();

	}

}
