package com.travelcard.core;

public class Station {

	private CheckInAutomaton checkIn;
	private CheckOutAutomaton checkOut;
	private Kiosk kiosk;
	private String stationName;
	private int countCheckIn;

	private int countCheckOut;

	public Station(String stationName) {
		super();
		this.stationName = stationName;
	}

	public CheckInAutomaton getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(CheckInAutomaton checkIn) {
		this.checkIn = checkIn;
	}

	public CheckOutAutomaton getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(CheckOutAutomaton checkOut) {
		this.checkOut = checkOut;
	}

	public Kiosk getKiosk() {
		return kiosk;
	}

	public void setKiosk(Kiosk kiosk) {
		this.kiosk = kiosk;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}



	public int getCountCheckIn() {
		return countCheckIn;
	}

	public void setCountCheckIn(int countCheckIn) {
		this.countCheckIn = countCheckIn;
	}

	public int getCountCheckOut() {
		return countCheckOut;
	}

	public void setCountCheckOut(int countCheckOut) {
		this.countCheckOut = countCheckOut;
	}
}
