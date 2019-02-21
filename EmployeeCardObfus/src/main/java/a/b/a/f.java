package a.b.a;

import java.util.logging.Logger;

public class f {
  private int P = 0;
  

  private j i;
  
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
      this.i = new j(200, "employee card account is successfully deposited");
      
      i.aq.ae().info("DEPOSIT: Self-service machine at " + this.Q + " : " + 
        "employee card account is successfully deposited" + paramInt + " DKK");
      i.aq.af();
      o(K() + 1);
    }
    else
    {
      this.i = new j(210, "employee card already in use");
    }
    

    paramg.e(false);
    return this.i;
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
