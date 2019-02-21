package a.b.a;

import java.util.logging.Logger;




public class a
{
  private int H;
  private int I;
  private int J = 0;
  

  private int K = 0;
  
  private j i;
  

  public a(int paramInt1, int paramInt2)
  {
    this.H = paramInt1;
    this.I = paramInt2;
  }
  




  public j a(g paramg)
  {
    if (!paramg.U())
    {
      if (paramg.S() >= this.H)
      {
        paramg.e(true);
        this.i = new j(200, "employee card account have access through this access control");
        
        i.aq.ae()
          .info("GETACCESS: Access Control at " + this.I + " : " + "employee card account have access through this access control");
        i.aq.af();
        m(F() + 1);
      }
      else
      {
        this.i = new j(210, "employee card account does not have access through this access control");
        l(E() + 1);
      }
      
    }
    else
    {
      this.i = new j(210, "employee card already in use");
      l(E() + 1);
    }
    

    paramg.e(false);
    return this.i;
  }
  



  public void C()
  {
    i.aq.A("employee card account have access through this access control");
  }
  



  public int D()
  {
    return this.I;
  }
  



  public int E()
  {
    return this.K;
  }
  



  public void l(int paramInt)
  {
    this.K = paramInt;
  }
  



  public int F()
  {
    return this.J;
  }
  



  public void m(int paramInt)
  {
    this.J = paramInt;
  }
  
  public void n(int paramInt)
  {
    this.I = paramInt;
  }
}
