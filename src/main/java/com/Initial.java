package com;

import java.lang.System.Logger;

public class Initial {

	public static void main(String[] args) {
		Logger logger = System.getLogger(Initial.class.getName());	
		logger.log(System.Logger.Level.INFO, "Amongas");
	}
}
