package com.travelcard.core;

import java.util.ArrayList;
import java.util.List;

import com.creditcard.validation.CreditCard;
import com.creditcard.validation.CreditCardCompany;


public class Kiosk
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
  




  @SuppressWarnings("unused")
private final int cU = 100;
  

  private CreditCard cV;
  

  private ResponseObject o;
  

  private String cy;
  

  private List<TravelCard> cW;
  
  private String cX;
  

  public Kiosk(String paramString)
  {
    B(paramString);
    this.cW = new ArrayList<TravelCard>();
    TravelCardUserList localk = new TravelCardUserList();
    this.cW = localk.bz();
  }
  




  public ResponseObject a(TravelCard paramj, int paramInt)
  {
    if (b(this.cV).br() == 530)
    {
      this.cV.j(paramInt);
      
      if (this.cV.B())
      {
        this.o = new ResponseObject(300, Constants.cM);
        paramj.w(paramInt);
        InitSystem.cT.bC().info("CREDIT CARD :" + Constants.cR + Constants.cM);
        InitSystem.cT.bD();
      }
      else
      {
        this.o = new ResponseObject(320, Constants.cJ);
      }
    }
    


    return this.o;
  }
  



  public void bm()
  {
    InitSystem.cT.H(Constants.cR + Constants.cQ);
  }
  




  public void bn()
  {
    InitSystem.cT.H(Constants.cR + Constants.cM);
  }
  




  public CreditCard bo()
  {
    return this.cV;
  }
  



  public String bi()
  {
    return this.cy;
  }
  



  public List<TravelCard> bp()
  {
    return this.cW;
  }
  



  public String bq()
  {
    return this.cX;
  }
  




  public ResponseObject e(TravelCard paramj)
  {
    if (!this.cW.contains(paramj))
    {
      this.cV.j(100);
      
      if (this.cV.B())
      {
        this.cW.add(paramj);
        this.o = new ResponseObject(400, Constants.cQ);
        InitSystem.cT.bC()
          .info("CREDIT CARD :" + Constants.cR + Constants.cQ);
        InitSystem.cT.bD();
      }
      else
      {
        this.o = new ResponseObject(420, Constants.cJ);
      }
      
    }
    else
    {
      this.o = new ResponseObject(410, Constants.cP);
    }
    

    return this.o;
  }
  




  public void a(CreditCard parama)
  {
    this.cV = parama;
  }
  



  public void B(String paramString)
  {
    this.cy = paramString;
  }
  



  public void a(List<TravelCard> paramList)
  {
    this.cW = paramList;
  }
  



  public void D(String paramString)
  {
    this.cX = paramString;
  }
  




  public ResponseObject b(CreditCard parama)
  {
    String str = parama.A().replaceAll("[^0-9]+", "");
    
    if ((str == null) || (str.length() < 13) || (str.length() > 19))
    {
      this.cX = Constants.cH;
      
      return new ResponseObject(500, Constants.cH);
    }
    

    if (!C(str))
    {
      this.cX = Constants.cI;
      
      return new ResponseObject(510, Constants.cI);
    }
    

    CreditCardCompany localb = CreditCardCompany.r(str);
    
    if (localb == null)
    {
      this.cX = Constants.cG;
      
      return new ResponseObject(520, Constants.cG);
    }
    

    this.cX = Constants.cR;
    a(parama);
    
    return new ResponseObject(530, Constants.cR);
  }
}
