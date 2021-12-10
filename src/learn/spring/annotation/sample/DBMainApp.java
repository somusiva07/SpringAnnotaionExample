package learn.spring.annotation.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import learn.spring.annotation.sample.config.DBConfig;
import learn.spring.annotation.sample.drivers.DatabaseDriver;
import learn.spring.annotation.sample.service.DBService;

public class DBMainApp {

	public static void main(String args[])
	{
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(DBConfig.class);
		
		DatabaseDriver oracle =  applicationContext.getBean("oracleDriver", DatabaseDriver.class);
		System.out.println("Oracle DB Details");
		System.out.println(oracle.getDriverInfo());
		
		
		  DatabaseDriver postgre =
		  applicationContext.getBean("postgreDriver",DatabaseDriver.class);
		  System.out.println("Postgre DB Details");
		  System.out.println(postgre.getDriverInfo());
		 
		
		//Fetch details by Service
		
		DBService dbService = applicationContext.getBean(DBService.class);
		System.out.println("DB Details fetched by Service");
		System.out.println(dbService.getDriverInfo());
		
		applicationContext.close();
		
		
		
		
	}
}
