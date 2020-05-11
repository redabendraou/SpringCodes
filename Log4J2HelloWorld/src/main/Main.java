package main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.ComApp;
import com.ib.ComIbApp;


public class Main {
	public static void main(String[] args) {

	System.setProperty("log4j.configurationFile", "resources/log4j2.xml");



	new ComApp();
	new ComIbApp();
	}

}
