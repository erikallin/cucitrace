package com.creditcard;



public class CreditCard
{
  private int s;
  

  private CreditCardCompany t;
  

  private int u;
  

  private String v;
  
  private boolean w;
  
  private boolean x;
  

  public CreditCard(String paramString)
  {
    this.v = paramString;
  }
  



  public void i(int paramInt)
  {
    k(paramInt);
    if (A() - paramInt >= 0) {
      c(true);
    } else {
      c(false);
    }
  }
  


  public int u()
  {
    return this.s;
  }
  




  public CreditCardCompany v()
  {
    return this.t;
  }
  



  public int w()
  {
    return this.u;
  }
  



  public String x()
  {
    return this.v;
  }
  



  public boolean y()
  {
    return this.w;
  }
  



  public boolean z()
  {
    return this.x;
  }
  



  public void j(int paramInt)
  {
    this.s = paramInt;
  }
  




  public void a(CreditCardCompany paramb)
  {
    this.t = paramb;
  }
  



  public void k(int paramInt)
  {
    this.u = paramInt;
  }
  



  public void p(String paramString)
  {
    this.v = paramString;
  }
  



  public void c(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  



  public void d(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }
  




  private int A()
  {
    return this.s;
  }
}
