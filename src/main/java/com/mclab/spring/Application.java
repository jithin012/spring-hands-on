package com.mclab.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.mclab.spring.basic.BinarySearchImpl;
import com.mclab.spring.externalservice.ServiceExternal;
import com.mclab.spring.scope.*;

@SpringBootApplication
@PropertySource("classpath:serverConfig.properties")
public class Application {

	private static Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
//		int result = binarySearch.binarySearch(new int[] {1, 2, 3, 4}, 3);
//		System.out.println(result);
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		
//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
//		int result = binarySearch.binarySearch(new int[] {1, 2, 3, 4}, 3);
//		System.out.println("Result :: "+ result);

//
//		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);		
//		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
//		
//		LOGGER.info("{}", personDao);
//		LOGGER.info("{}", personDao.getJdbcConnection());
		
//		LOGGER.info("{}", personDao2);
//		LOGGER.info("{}", personDao2.getJdbcConnection());
		
	
		ServiceExternal serviceExternal = applicationContext.getBean(ServiceExternal.class);
		System.out.println(serviceExternal.getUrl());
 	}

}
