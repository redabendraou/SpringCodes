package com;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ComApp {
	public ComApp(){
		Logger logger = LogManager.getLogger(ComApp.class);			
		logger.trace("COM :: LEVEL :: ComApp TRACE Message ::");
		}
}
