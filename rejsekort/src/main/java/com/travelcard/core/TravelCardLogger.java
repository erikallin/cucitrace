package com.travelcard.core;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TravelCardLogger {

	public static Logger log;

	private static FileHandler fileTxt;
	private static SimpleFormatter formatterTxt;

	private static FileInputStream fstream;
	private static BufferedReader br;

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
			if (log == null) {
				getLogger();

				if (fileTxt == null) {
					fileTxt = new FileHandler("Logging.txt");
				} else {

					// create a TXT formatter
					formatterTxt = new SimpleFormatter();
					fileTxt.setFormatter(formatterTxt);
					log.addHandler(fileTxt);
				}
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readLog() {
		System.out.println("readfile");
		if (log == null) {
			getLogger();

			if (fileTxt == null) {
				printLog();

				try {
					fstream = new FileInputStream("Logging.txt");
					br = new BufferedReader(new InputStreamReader(fstream));
					String strLine;
					/* read log line by line */
					while ((strLine = br.readLine()) != null) {
						/* parse strLine to obtain what you want */
						System.out.println(strLine);
					}
					fstream.close();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
			}
		}
	}
}
