package com.employeecard.core;

public class f {
  private int P = 0;
  

  private j j;
  
  private String Q;
  

  public f(String paramString)
  {
    this.Q = paramString;
  }
  





  public j a(g paramg, int paramInt)
  {
    if (!paramg.U())
    {
      paramg.e(true);
      paramg.q(paramInt);
      j = new j(200, "employee card account is successfully deposited");
      
      i.aq.ae().info("DEPOSIT: Self-service machine at " + this.Q + " : " + 
        "employee card account is successfully deposited" + paramInt + " DKK");
      i.aq.af();
      o(K() + 1);
    }
    else
    {
      j = new j(210, "employee card already in use");
    }
    

    paramg.e(false);
    return j;
  }
  



  public void R()
  {
    i.aq.A("employee card account is successfully deposited");
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
