package a.b.a;

import a.a.a.a;
import a.a.a.b;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;











public class k
{
  private static boolean x(String paramString)
  {
    int j = paramString.length();
    int k = j & 0x1;
    long l = 0L;
    for (int m = 0; m < j; m++) {
      int n = 0;
      try {
        n = Integer.parseInt(paramString.charAt(m));
      } catch (NumberFormatException localNumberFormatException) {
        return false;
      }
      
      if ((m & 0x1 ^ k) == 0) {
        n *= 2;
        if (n > 9) {
          n -= 9;
        }
      }
      l += n;
    }
    
    return l != 0L;
  }
  




  private final int au = 100;
  

  private a av;
  

  private j i;
  

  private String Q;
  

  private List<g> aw;
  
  private String ax;
  

  public k(String paramString)
  {
    u(paramString);
    this.aw = new ArrayList();
    h localh = new h();
    this.aw = localh.P();
  }
  




  public j b(g paramg, int paramInt)
  {
    if (b(this.av).W() == 530)
    {
      this.av.i(paramInt);
      
      if (this.av.y())
      {
        this.i = new j(300, "employee card account is successfully deposited");
        paramg.q(paramInt);
        i.aq.ae().info("CREDIT CARD :credit card is validemployee card account is successfully deposited");
        i.aq.af();
      }
      else
      {
        this.i = new j(320, "credit card declined to charge the amount");
      }
    }
    


    return this.i;
  }
  



  public void Z()
  {
    i.aq.A("credit card is validEmployee card was registered for purchases");
  }
  



  public a aa()
  {
    return this.av;
  }
  



  public String N()
  {
    return this.Q;
  }
  



  public List<g> ab()
  {
    return this.aw;
  }
  



  public String ac()
  {
    return this.ax;
  }
  




  public j c(g paramg)
  {
    if (!this.aw.contains(paramg))
    {
      this.av.i(100);
      
      if (this.av.y())
      {
        this.aw.add(paramg);
        this.i = new j(400, "Employee card was registered for purchases");
        i.aq.ae()
          .info("CREDIT CARD :credit card is validEmployee card was registered for purchases");
        i.aq.af();
      }
      else
      {
        this.i = new j(420, "credit card declined to charge the amount");
      }
      
    }
    else
    {
      this.i = new j(410, "Employee card was not registered for purchases because user already registered in the system");
    }
    

    return this.i;
  }
  




  public void a(a parama)
  {
    this.av = parama;
  }
  



  public void u(String paramString)
  {
    this.Q = paramString;
  }
  



  public void d(List<g> paramList)
  {
    this.aw = paramList;
  }
  



  public void y(String paramString)
  {
    this.ax = paramString;
  }
  




  public j b(a parama)
  {
    String str = parama.x().replaceAll("[^0-9]+", "");
    
    if ((str == null) || (str.length() < 13) || (str.length() > 19))
    {
      this.ax = "credit card is invalid because it has too few digits";
      
      return new j(500, "credit card is invalid because it has too few digits");
    }
    

    if (!x(str))
    {
      this.ax = "credit card is invalid because it contains characters";
      
      return new j(510, "credit card is invalid because it contains characters");
    }
    

    b localb = b.q(str);
    
    if (localb == null)
    {
      this.ax = "credit card is invalid it does not belong to a company provider";
      
      return new j(520, "credit card is invalid it does not belong to a company provider");
    }
    

    this.ax = "credit card is valid";
    a(parama);
    
    return new j(530, "credit card is valid");
  }
}
