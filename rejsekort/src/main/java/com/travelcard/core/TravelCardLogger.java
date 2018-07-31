package com.travelcard.core;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TravelCardLogger {

	public static Logger log;

	
	
	public static Logger getLogger(){
		if (log == null){
			log = Logger.getLogger("Travel Card Example Logger");
			log.setLevel(Level.ALL);
		}
		return log;
	}
}
