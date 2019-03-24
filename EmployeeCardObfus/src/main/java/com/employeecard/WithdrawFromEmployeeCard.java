package com.employeecard;

public class WithdrawFromEmployeeCard {
  
	
  private int O = 0;
  

  private final int aC = 1;
  
  
  private final double aD = 0.15;
  

  private final int aE = 50;
  

  private ResponseObject j;
  
  
  private String Q;
  

  public WithdrawFromEmployeeCard(String paramString)
  {
    u(paramString);
  }
  



  public ResponseObject c(EmployeeCard paramg, int paramInt)
  {
    if (!paramg.U())
    {
      if (e(paramg))
      {
        paramg.e(true);
        d(paramg);
        
        paramg.r(paramInt * (1 - (int) q()));
        j = new ResponseObject(230, Constants.Z);
        
        InitSystem.aq.ae().info("WITHDRAWAL: Self-service machine at " + this.Q + " : " + 
        		Constants.Z + paramInt + " DKK");
        InitSystem.aq.af();
        p(L() + 1);
      }
      else
      {
        j = new ResponseObject(220, Constants.T);
      }
      

    }
    else {
      j = new ResponseObject(240, Constants.Y);
    }
    

    paramg.e(false);
    return j;
  }
  




  public void ag()
  {
    InitSystem.aq.A(Constants.Z);
  }
  




  public String N()
  {
    return this.Q;
  }
  



  public void u(String paramString)
  {
    this.Q = paramString;
  }
  




  private void d(EmployeeCard paramg)
  {
    paramg.j(paramg.u() - aC);
  }
  




  private boolean e(EmployeeCard paramg)
  {
    return paramg.u() > aE;
  }
  



  public int L()
  {
    return this.O;
  }
  



  public void p(int paramInt)
  {
    this.O = paramInt;
  }




  public double q() 
  {
	return aD;
  }
}
