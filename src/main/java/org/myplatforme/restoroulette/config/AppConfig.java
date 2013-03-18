package org.myplatforme.restoroulette.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("org.myplatforme.restoroulette")
@Import({ MongoDataConfig.class, EmbeddedMongoDataConfig.class })
public class AppConfig {
}
