
public class CheckInStation extends Station{


	public CheckInStation(String name) {
		super(name);
		this.name = name;
	}

	public ResponseObject checkIn(TravelCard card, boolean bus) {
		
		if(!card.isCheckedIn()) {
			if (hasEnoughBalance(card)){
				if (bus){
					charge(card,bus);
				}
				card.setCheckedIn(true);
				response = new ResponseObject(200, "Checked In");
			}else{
				response = new ResponseObject(320,"Balance too low");
			}
	
		
		} else {
		
			 response = new ResponseObject(300, "Already Checked In");
		}
			return response;
		
	}
	

	
	
}
