package com.employeecard;

public class WithdrawFromEmployeeCard {
  
	
  private int O = 0;
  

  private final int aC = 1;
  

  private final int aD = 50;
  

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
        
        paramg.r(paramInt);
        j = new ResponseObject(230, "employee card account is successfully withdrawn from");
        
        InitSystem.aq.ae().info("WITHDRAWAL: Self-service machine at " + this.Q + " : " + 
          "employee card account is successfully withdrawn from" + paramInt + " DKK");
        InitSystem.aq.af();
        p(L() + 1);
      }
      else
      {
        j = new ResponseObject(220, "employee card account balance is too low to be withdrawn from");
      }
      

    }
    else {
      j = new ResponseObject(240, "employee card account is not withdrawn from");
    }
    

    paramg.e(false);
    return j;
  }
  




  public void ag()
  {
    InitSystem.aq.A("employee card account is successfully withdrawn from");
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
    return paramg.u() > aD;
  }
  



  public int L()
  {
    return this.O;
  }
  



  public void p(int paramInt)
  {
    this.O = paramInt;
  }
}
