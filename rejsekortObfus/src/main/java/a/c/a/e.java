package a.c.a;

import a.a.a.a;
import a.a.a.b;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;










public class e
{
  private static boolean C(String paramString)
  {
    int i = paramString.length();
    int j = i & 0x1;
    long l = 0L;
    for (int k = 0; k < i; k++) {
      int m = 0;
      try {
        m = Integer.parseInt(paramString.charAt(k) + "");
      } catch (NumberFormatException localNumberFormatException) {
        return false;
      }
      
      if ((k & 0x1 ^ j) == 0) {
        m *= 2;
        if (m > 9) {
          m -= 9;
        }
      }
      l += m;
    }
    
    return l != 0L;
  }
  




  private final int cU = 100;
  

  private a cV;
  

  private f o;
  

  private String cy;
  

  private List<j> cW;
  
  private String cX;
  

  public e(String paramString)
  {
    B(paramString);
    this.cW = new ArrayList();
    k localk = new k();
    this.cW = localk.bz();
  }
  




  public f a(j paramj, int paramInt)
  {
    if (b(this.cV).br() == 530)
    {
      this.cV.j(paramInt);
      
      if (this.cV.B())
      {
        this.o = new f(300, "Travel card was reloaded successfully");
        paramj.w(paramInt);
        d.cT.bC().info("CREDIT CARD :credit card is validTravel card was reloaded successfully");
        d.cT.bD();
      }
      else
      {
        this.o = new f(320, "credit card declined to charge the amount");
      }
    }
    


    return this.o;
  }
  



  public void bm()
  {
    d.cT.H("credit card is validTravel card was issued");
  }
  




  public void bn()
  {
    d.cT.H("credit card is validTravel card was reloaded successfully");
  }
  




  public a bo()
  {
    return this.cV;
  }
  



  public String bi()
  {
    return this.cy;
  }
  



  public List<j> bp()
  {
    return this.cW;
  }
  



  public String bq()
  {
    return this.cX;
  }
  




  public f e(j paramj)
  {
    if (!this.cW.contains(paramj))
    {
      this.cV.j(100);
      
      if (this.cV.B())
      {
        this.cW.add(paramj);
        this.o = new f(400, "Travel card was issued");
        d.cT.bC()
          .info("CREDIT CARD :credit card is validTravel card was issued");
        d.cT.bD();
      }
      else
      {
        this.o = new f(420, "credit card declined to charge the amount");
      }
      
    }
    else
    {
      this.o = new f(410, "Travel card was not created because user already registered in the system");
    }
    

    return this.o;
  }
  




  public void a(a parama)
  {
    this.cV = parama;
  }
  



  public void B(String paramString)
  {
    this.cy = paramString;
  }
  



  public void a(List<j> paramList)
  {
    this.cW = paramList;
  }
  



  public void D(String paramString)
  {
    this.cX = paramString;
  }
  




  public f b(a parama)
  {
    String str = parama.A().replaceAll("[^0-9]+", "");
    
    if ((str == null) || (str.length() < 13) || (str.length() > 19))
    {
      this.cX = "credit card is invalid because it has too few digits";
      
      return new f(500, "credit card is invalid because it has too few digits");
    }
    

    if (!C(str))
    {
      this.cX = "credit card is invalid because it contains characters";
      
      return new f(510, "credit card is invalid because it contains characters");
    }
    

    b localb = b.r(str);
    
    if (localb == null)
    {
      this.cX = "credit card is invalid it does not belong to a company provider";
      
      return new f(520, "credit card is invalid it does not belong to a company provider");
    }
    

    this.cX = "credit card is valid";
    a(parama);
    
    return new f(530, "credit card is valid");
  }
}
