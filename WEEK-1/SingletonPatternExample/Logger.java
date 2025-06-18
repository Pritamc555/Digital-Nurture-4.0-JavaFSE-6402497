package com.singleton.example;


public class Logger {
	private static Logger instance;
	
	private Logger() {
		System.out.println("LOgger is now initialized");
				
	}
	
	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	public void log(String message) {
		System.out.println("LOG: " + message);
	}

}
