//
//public class Station {
//
//	private final int FARE_NORMAL = 25;
//
//	private final int FARE_BUS = 50;
//
//	String name;
//	ResponseObject response;
//	
//	public Station(String name) {
//		this.name=name;
//	}
//	
//	
//	protected boolean hasEnoughBalance(TravelCard card){
//		return card.getBalance()>=80;
//	}
//	
//	protected void charge(TravelCard card, boolean bus) {
//		if(bus)
//		card.setBalance(card.getBalance() - FARE_BUS);
//		
//		card.setBalance(card.getBalance() - FARE_NORMAL);
//	}
//}
