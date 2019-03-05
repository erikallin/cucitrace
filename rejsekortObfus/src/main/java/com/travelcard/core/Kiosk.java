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
  




  private final int cU = 100;
  

  private CreditCard cV;
  

  private ResponseObject o;
  

  private String cy;
  

  private List<TravelCard> cW;
  
  private String cX;
  

  public Kiosk(String paramString)
  {
    B(paramString);
    this.cW = new ArrayList();
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
        this.o = new ResponseObject(300, "Travel card was reloaded successfully");
        paramj.w(paramInt);
        InitSystem.cT.bC().info("CREDIT CARD :credit card is validTravel card was reloaded successfully");
        InitSystem.cT.bD();
      }
      else
      {
        this.o = new ResponseObject(320, "credit card declined to charge the amount");
      }
    }
    


    return this.o;
  }
  



  public void bm()
  {
    InitSystem.cT.H("credit card is validTravel card was issued");
  }
  




  public void bn()
  {
    InitSystem.cT.H("credit card is validTravel card was reloaded successfully");
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
        this.o = new ResponseObject(400, "Travel card was issued");
        InitSystem.cT.bC()
          .info("CREDIT CARD :credit card is validTravel card was issued");
        InitSystem.cT.bD();
      }
      else
      {
        this.o = new ResponseObject(420, "credit card declined to charge the amount");
      }
      
    }
    else
    {
      this.o = new ResponseObject(410, "Travel card was not created because user already registered in the system");
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
      this.cX = "credit card is invalid because it has too few digits";
      
      return new ResponseObject(500, "credit card is invalid because it has too few digits");
    }
    

    if (!C(str))
    {
      this.cX = "credit card is invalid because it contains characters";
      
      return new ResponseObject(510, "credit card is invalid because it contains characters");
    }
    

    CreditCardCompany localb = CreditCardCompany.r(str);
    
    if (localb == null)
    {
      this.cX = "credit card is invalid it does not belong to a company provider";
      
      return new ResponseObject(520, "credit card is invalid it does not belong to a company provider");
    }
    

    this.cX = "credit card is valid";
    a(parama);
    
    return new ResponseObject(530, "credit card is valid");
  }
}
