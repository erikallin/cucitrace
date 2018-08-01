package com.travelcard.core;

public class CheckInAutomaton {

	private final int MINIMUM_CHECKIN_BALANCE = 25;

	private ResponseObject response;

	private String stationName;

	public CheckInAutomaton(String stationName) {
		this.stationName = stationName;
		
	}

	public ResponseObject checkIn(TravelCard card) {
		if (!card.isCheckedInStatus()) {
			if (hasEnoughBalance(card)) {
				card.setCheckedInStatus(true);
				response = new ResponseObject(200, Constants.CHECKED_IN_SUCCESS);
				
				InitSystem.isl.getLogger().info("CHECKIN: Automaton at " + stationName + " : " + Constants.CHECKED_IN_SUCCESS);
				InitSystem.isl.printLog();
			//	InitSystem.isl.readlog();
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

	public void checkInLog() {
		//InitSystem.isl.readlog();
		InitSystem.isl.logContains(Constants.CHECKED_IN_SUCCESS);
	}

}
