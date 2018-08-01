package com.travelcard.core;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TravelCardLoggerReader {

	private FileHandler fileTxt;
	private SimpleFormatter formatterTxt;
	private FileInputStream fstream = null;

	private static Logger log;

	public TravelCardLoggerReader() {
		log = Logger.getLogger("Travel Card Example Logger");
		log.setLevel(Level.ALL);

	}

	public Logger getLogger() {
		if (log == null) {
			log = Logger.getLogger("Travel Card Example Logger");
			log.setLevel(Level.ALL);
		}
		return log;
	}

	public void printLog() {
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

	public void readlog() {
		System.out.println("readfile");

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("Logging.txt"));
			if (br!=null){
				System.out.print("is br ");
			}
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String strLine;
		
		/* read log line by line */
		try {
			while ((strLine = br.readLine()) != null) {
				
				/* parse strLine to obtain what you want */
				System.out.println(strLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
