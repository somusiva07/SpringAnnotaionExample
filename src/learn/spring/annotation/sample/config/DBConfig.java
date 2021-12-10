package learn.spring.annotation.sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import learn.spring.annotation.sample.drivers.DatabaseDriver;
import learn.spring.annotation.sample.drivers.OracleDriver;
import learn.spring.annotation.sample.drivers.PostgreDriver;

@Configuration
@ComponentScan("learn.spring.annotation.sample")
@PropertySource("classpath:/learn/spring/annotation/sample/oracledb.properties")
public class DBConfig {

	@Autowired
    Environment environment;

	@Bean
	DatabaseDriver oracleDriver() {
		
		OracleDriver oracleDriver = new OracleDriver();
		oracleDriver.setConnectionName(environment.getProperty("db.connectionName"));
	    oracleDriver.setHostName(environment.getProperty("db.host"));
        oracleDriver.setPort(Integer.parseInt(environment.getProperty("db.port")));
        oracleDriver.setUserName(environment.getProperty("db.user"));
        oracleDriver.setPassword(environment.getProperty("db.password"));
        oracleDriver.setServiceNameOrSID(environment.getProperty("db.service"));
        return oracleDriver;

	}

	@Bean
	DatabaseDriver postgreDriver() {
		return new PostgreDriver();
	}
}
