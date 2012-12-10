package com.gowan.maven;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetUser {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(GreetUser.class);
		
		BasicConfigurator.configure();
		logger.info("before greet");
		
		System.out.println(Logic.greet());
		
		logger.info("after greet");
	}
}
