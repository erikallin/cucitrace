package com.employeecard.core;

public class AccessControl {


    private int accessLevelRequired;


    private int accessControlID;
    
    
    private int countAccessesGranted = 0;
    
    
    private int countAccessesDenied = 0;


    private ResponseObject response;

    
	public AccessControl(int accessLevelRequired, int accessControlID) {
		this.accessLevelRequired = accessLevelRequired;
		this.accessControlID = accessControlID;
	}

	public ResponseObject getAccess(EmployeeCard account) {
		
		if (!account.isInUseStatus()) {
			
			if (account.getAccessLevel() >= accessLevelRequired) {
		
			account.setInUseStatus(true);
			response = new ResponseObject(200, Constants.ACCESS_SUCCESS);

			InitSystem.isl.getLogger()
					.info("GETACCESS: Access Control at " + accessControlID + " : " + Constants.ACCESS_SUCCESS);
			InitSystem.isl.printLog();
			countAccessesGranted++;
			
			} else {
				
				response = new ResponseObject(210, Constants.ACCESS_FAILURE);
				countAccessesDenied++;
				
			}
			
		} else {
			
			response = new ResponseObject(210, Constants.ACCESS_FAILURE_ALREADY);
			countAccessesDenied++;
		
		}
		
		account.setInUseStatus(false);
		return response;
	}





	public void accessControlLog() {
		InitSystem.isl.logContains(Constants.ACCESS_SUCCESS);
	}





    public int getaccessControlID() {
		return accessControlID;
	}

	
	
	
	
	public void setaccessControlID(int accessControlID) {
		this.accessControlID = accessControlID;
	}

}
