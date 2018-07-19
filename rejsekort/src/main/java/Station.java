
public class Station {


	private final int FARE = 25;

	String name;
	ResponseObject response;
	
	public Station(String name) {
		this.name=name;
	}
	
	
	protected boolean hasEnoughBalance(TravelCard card){
		return card.getBalance()>=80;
	}
	
	protected void charge(TravelCard card) {
		card.setBalance(card.getBalance() - FARE);
	}
}
