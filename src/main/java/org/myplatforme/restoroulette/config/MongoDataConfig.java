package org.myplatforme.restoroulette.config;

import java.net.UnknownHostException;

import org.myplatforme.restoroulette.mongodb.utils.JongoManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

import com.mongodb.Mongo;

@Configuration
@Profile("mongo")
@ImportResource("classpath:/properties-config.xml")
public class MongoDataConfig {
	private @Value("${mongo.host}")
	String host;
	private @Value("${mongo.port}")
	int port;
	private @Value("${mongo.dbname}")
	String dbName;
	private @Value("${mongo.username}")
	String username;
	private @Value("${mongo.password}")
	char[] password;

	@Bean
	public JongoManager jongoManager() throws UnknownHostException {
		return new JongoManager(mongo(), dbName, username, password);
	}

	@Bean
	public Mongo mongo() throws UnknownHostException {
		return new Mongo(host, port);
	}
}
