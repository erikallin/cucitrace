package com.travelcard.core;

public class CheckOutAutomaton {

	private String stationName;
	private ResponseObject response;

	private final int FARE = 25;

	public CheckOutAutomaton(String stationName) {
		this.setStationName(stationName);
	}

	public ResponseObject checkOut(TravelCard card) {
		if (card.isCheckedInStatus()) {
			charge(card);
			card.setCheckedInStatus(false);
			response = new ResponseObject(230, Constants.CHECKED_OUT_SUCCESS);

			InitSystem.isl.getLogger()
					.info("CHECKOUT: Automaton at " + stationName + " : " + Constants.CHECKED_OUT_SUCCESS);
			InitSystem.isl.printLog();

		} else {

			response = new ResponseObject(240, Constants.CHECKED_OUT_FAILURE);
		}
		return response;
	}

	private void charge(TravelCard card) {

		card.setBalance(card.getBalance() - FARE);

	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public void checkOutLog() {

		InitSystem.isl.logContains(Constants.CHECKED_OUT_SUCCESS);

	}

}
