package com.cacheProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CacheProjectApplication {

	public static void main(String[] args) {
		ApplicationContext  applicationContext = SpringApplication.run(CacheProjectApplication.class, args);
		MainClass mainclass = applicationContext.getBean(MainClass.class);
		try {
			mainclass.startMethod();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
