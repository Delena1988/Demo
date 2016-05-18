package com.linjian;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LoggerDemo {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(LoggerDemo.class);
		logger.setLevel(Level.ALL);
		logger.log(Level.WARN, "warning logger");
	}
}
