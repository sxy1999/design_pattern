package com.donbest.behavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {

	private static final Logger logger = Logger.getLogger(LoggerDemo.class.getName());
	public static void main(String[] args) {
		logger.setLevel(Level.FINER);
		
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINER);		
		logger.addHandler(handler);
		
		logger.finest("Finest level of logger");
		logger.finer("Finer level of logger");
		logger.fine("Fine level of logger");
	}

}
