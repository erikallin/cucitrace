package com.travelcard.core;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.orsonpdf.PDFDocument;
import com.orsonpdf.Page;

public class CheckInAutomaton {

	
	private final int MINIMUM_CHECKIN_BALANCE = 25;

	private ResponseObject response;

	private String stationName;
	
	public CheckInAutomaton(String stationName) {
		this.stationName = stationName;
		TravelCardLogger.getLogger().info("CHECKIN: Automaton initialized");
		TravelCardLogger.printLog();
	}

	public ResponseObject checkIn(TravelCard card) {
		if (!card.isCheckedInStatus()) {
			if (hasEnoughBalance(card)) {
				card.setCheckedInStatus(true);
				response = new ResponseObject(200, Constants.CHECKED_IN_SUCCESS);

				//TravelCardLogger.getLogger().info("CHECKIN: Automaton at " + stationName + " registers Travel Card " + card.getTcName() + " is checked in");
			} else {
				response = new ResponseObject(220, Constants.CHECKED_IN_FAILURE_LOW_BALANCE);
			}
		} else {
			response = new ResponseObject(210, Constants.CHECKED_IN_FAILURE_ALREADY);
		}
		return response;
	}

	private boolean hasEnoughBalance(TravelCard card) {
		// TODO Auto-generated method stub
		return card.getBalance() > MINIMUM_CHECKIN_BALANCE;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

}
