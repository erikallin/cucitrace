
public class CheckOutStation extends Station {
	
	

	public CheckOutStation(String name) {
		super(name);
	}

	String name;
	ResponseObject response;

	public ResponseObject checkOut(TravelCard card) {

		if (card.isCheckedIn()) {
			charge(card);
			card.setCheckedIn(false);
			response = new ResponseObject(780, "checked-out");
		} else {

			response = new ResponseObject(330, "Not checked-in");
		}
		return response;

	}


}
