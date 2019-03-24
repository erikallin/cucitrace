package com.employeecard;

public class DepositToEmployeeCard {
  private int P = 0;
  

  private ResponseObject j;
  
  private String Q;
  

  public DepositToEmployeeCard(String paramString)
  {
    this.Q = paramString;
  }
  





  public ResponseObject a(EmployeeCard paramg, int paramInt)
  {
    if (!paramg.U())
    {
      paramg.e(true);
      paramg.q(paramInt);
      j = new ResponseObject(200, Constants.U);
      
      InitSystem.aq.ae().info("DEPOSIT: Self-service machine at " + this.Q + " : "
    		  + Constants.U + paramInt + " DKK");
      InitSystem.aq.af();
      o(K() + 1);
    }
    else
    {
      j = new ResponseObject(210, Constants.S);
    }
    

    paramg.e(false);
    return j;
  }
  



  public void R()
  {
    InitSystem.aq.A(Constants.U);
  }
  



  public String N()
  {
    return this.Q;
  }
  



  public void u(String paramString)
  {
    this.Q = paramString;
  }
  


  public int K()
  {
    return this.P;
  }
  



  public void o(int paramInt)
  {
    this.P = paramInt;
  }
}
