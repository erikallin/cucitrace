package com.travelcard.core;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TravelCardLogger {

	public static Logger log;

	private static FileHandler fileTxt;
	private static SimpleFormatter formatterTxt;

	public static Logger getLogger() {
		if (log == null) {
			log = Logger.getLogger("Travel Card Example Logger");
			log.setLevel(Level.ALL);
		}
		return log;
	}

	public static void printLog() {
		System.out.print("print");
		try {
			if (fileTxt == null) {
				fileTxt = new FileHandler("Logging.txt");
			} else {

				// create a TXT formatter
				formatterTxt = new SimpleFormatter();
				fileTxt.setFormatter(formatterTxt);
				log.addHandler(fileTxt);
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
