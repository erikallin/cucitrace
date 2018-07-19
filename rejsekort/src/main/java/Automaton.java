
public class Automaton {
	private boolean isInService;
	ResponseObject response;

	
	public Automaton(boolean isInService) {
		this.isInService = isInService;
	}


	public Automaton() {
		
	}


	public boolean isInService() {
		return isInService;
	}

	public void setInService(boolean isInService) {
		this.isInService = isInService;
	}

	public ResponseObject serviceStatus(){
		if(!isInService()) 
		return response = new ResponseObject(223, "Automaton Not In Service");
		
		return response = new ResponseObject(213, "Automaton  In Service");
	}
	

}
