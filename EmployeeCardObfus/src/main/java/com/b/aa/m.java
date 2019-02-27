package com.b.aa;

import java.util.logging.Logger;

public class m {
  private int O = 0;
  

  private final int aC = 1;
  

  private final int aD = 50;
  

  private j j;
  
  private String Q;
  

  public m(String paramString)
  {
    u(paramString);
  }
  



  public j c(g paramg, int paramInt)
  {
    if (!paramg.U())
    {
      if (e(paramg))
      {
        paramg.e(true);
        d(paramg);
        
        paramg.r(paramInt);
        j = new j(230, "employee card account is successfully withdrawn from");
        
        i.aq.ae().info("WITHDRAWAL: Self-service machine at " + this.Q + " : " + 
          "employee card account is successfully withdrawn from" + paramInt + " DKK");
        i.aq.af();
        p(L() + 1);
      }
      else
      {
        j = new j(220, "employee card account balance is too low to be withdrawn from");
      }
      

    }
    else {
      j = new j(240, "employee card account is not withdrawn from");
    }
    

    paramg.e(false);
    return j;
  }
  




  public void ag()
  {
    i.aq.A("employee card account is successfully withdrawn from");
  }
  




  public String N()
  {
    return this.Q;
  }
  



  public void u(String paramString)
  {
    this.Q = paramString;
  }
  




  private void d(g paramg)
  {
    paramg.j(paramg.u() - 1);
  }
  




  private boolean e(g paramg)
  {
    return paramg.u() > 50;
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
