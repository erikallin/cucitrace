package com.creditcard;





public enum b
{
 
	AMEX("^3[47][0-9]{13}$", "AMEX"), DINERS("^3(?:0[0-5]|[68][0-9])[0-9]{11}$", "Diners"), DISCOVER(
			"^6(?:011|5[0-9]{2})[0-9]{12}$", "DISCOVER"), JCB("^(?:2131|1800|35\\d{3})\\d{11}$",
					"JCB"), MASTERCARD("^5[1-5][0-9]{14}$", "MASTER"), VISA("^4[0-9]{12}(?:[0-9]{3})?$", "VISA");
	
  private String E;
  


  private String F;
  



  public static b q(String paramString)
  {
    b[] arrayOfb;
    


    int j = (arrayOfb = values()).length; for (int i = 0; i < j; i++) { b localb = arrayOfb[i];
      if (localb.s(paramString)) {
        return localb;
      }
    }
    return null;
  }
  






  public static b r(String paramString)
  {
    b[] arrayOfb;
    





    int j = (arrayOfb = values()).length; for (int i = 0; i < j; i++) { b localb = arrayOfb[i];
      if (localb.B().equals(paramString)) {
        return localb;
      }
    }
    return null;
  }
  









  private b(String paramString2, String paramString3)
  {
    this.F = paramString2;
    this.E = paramString3;
  }
  



  public String B()
  {
    return this.E;
  }
  



  public boolean s(String paramString)
  {
    return paramString.matches(this.F);
  }
}
