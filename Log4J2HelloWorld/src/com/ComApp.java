package com;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ComApp {
	public ComApp(){
		Logger logger = LogManager.getLogger(ComApp.class);	
		logger.trace("COM :: LEVEL :: ComApp TRACE Message ::");
		
//		Pour tester le RollingOver
//		int i=0;
//		while ( i<200000) {
//			logger.trace("COM :: LEVEL :: ComApp TRACE Message ::");
//			i++;
//		}
		
		}
}
