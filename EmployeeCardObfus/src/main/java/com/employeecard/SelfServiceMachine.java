package com.employeecard;

import java.util.ArrayList;
import java.util.List;
import com.creditcard.CreditCard;
import com.creditcard.CreditCardCompany;


public class SelfServiceMachine
{
  private static boolean x(String paramString)
  {
    int j = paramString.length();
    int k = j & 0x1;
    long l = 0L;
    for (int m = 0; m < j; m++) {
      int n = 0;
      try {
        n = Integer.parseInt(paramString.charAt(m) + "");
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
  




  @SuppressWarnings("unused")
private final int au = 100;
  

  private CreditCard av;
  

  private ResponseObject j;
  

  private String Q;
  

  private List<EmployeeCard> aw;
  
  private String ax;
  

  public SelfServiceMachine(String paramString)
  {
    u(paramString);
    aw = new ArrayList<EmployeeCard>();
    EmployeeCardList localh = new EmployeeCardList();
    aw = localh.P();
  }
  




  public ResponseObject b(EmployeeCard paramg, int paramInt)
  {
    if (b(this.av).W() == 530)
    {
      this.av.i(paramInt);
      
      if (this.av.y())
      {
        j = new ResponseObject(300, "employee card account is successfully deposited");
        paramg.q(paramInt);
        InitSystem.aq.ae().info("CREDIT CARD :credit card is validemployee card account is successfully deposited");
        InitSystem.aq.af();
      }
      else
      {
        j = new ResponseObject(320, "credit card declined to charge the amount");
      }
    }
    


    return j;
  }
  



  public void Z()
  {
    InitSystem.aq.A("credit card is validEmployee card was registered for purchases");
  }
  



  public CreditCard aa()
  {
    return this.av;
  }
  



  public String N()
  {
    return this.Q;
  }
  



  public List<EmployeeCard> ab()
  {
    return this.aw;
  }
  



  public String ac()
  {
    return this.ax;
  }
  




  public ResponseObject c(EmployeeCard paramg)
  {
    if (!this.aw.contains(paramg))
    {
      this.av.i(100);
      
      if (this.av.y())
      {
        this.aw.add(paramg);
        j = new ResponseObject(400, "Employee card was registered for purchases");
        InitSystem.aq.ae()
          .info("CREDIT CARD :credit card is validEmployee card was registered for purchases");
        InitSystem.aq.af();
      }
      else
      {
        j = new ResponseObject(420, "credit card declined to charge the amount");
      }
      
    }
    else
    {
      j = new ResponseObject(410, "Employee card was not registered for purchases because user already registered in the system");
    }
    

    return j;
  }
  




  public void a(CreditCard parama)
  {
    this.av = parama;
  }
  



  public void u(String paramString)
  {
    this.Q = paramString;
  }
  



  public void d(List<EmployeeCard> paramList)
  {
    this.aw = paramList;
  }
  



  public void y(String paramString)
  {
    this.ax = paramString;
  }
  




  public ResponseObject b(CreditCard parama)
  {
    String str = parama.x().replaceAll("[^0-9]+", "");
    
    if ((str == null) || (str.length() < 13) || (str.length() > 19))
    {
      this.ax = "credit card is invalid because it has too few digits";
      
      return new ResponseObject(500, "credit card is invalid because it has too few digits");
    }
    

    if (!x(str))
    {
      this.ax = "credit card is invalid because it contains characters";
      
      return new ResponseObject(510, "credit card is invalid because it contains characters");
    }
    

    CreditCardCompany localb = CreditCardCompany.q(str);
    
    if (localb == null)
    {
      this.ax = "credit card is invalid it does not belong to a company provider";
      
      return new ResponseObject(520, "credit card is invalid it does not belong to a company provider");
    }
    

    this.ax = "credit card is valid";
    a(parama);
    
    return new ResponseObject(530, "credit card is valid");
  }
}
