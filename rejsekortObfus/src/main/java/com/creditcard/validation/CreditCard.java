package com.creditcard.validation;



public class CreditCard
{
  private int t;
  

  private CreditCardCompany u;
  

  private int v;
  

  private String w;
  
  private boolean x;
  
  private boolean y;
  

  public CreditCard(String paramString)
  {
    this.w = paramString;
  }
  



  public void j(int paramInt)
  {
    l(paramInt);
    if (D() - paramInt >= 0) {
      b(true);
    } else {
      b(false);
    }
  }
  


  public int x()
  {
    return this.t;
  }
  




  public CreditCardCompany y()
  {
    return this.u;
  }
  



  public int z()
  {
    return this.v;
  }
  



  public String A()
  {
    return this.w;
  }
  



  public boolean B()
  {
    return this.x;
  }
  



  public boolean C()
  {
    return this.y;
  }
  



  public void k(int paramInt)
  {
    this.t = paramInt;
  }
  




  public void a(CreditCardCompany paramb)
  {
    this.u = paramb;
  }
  



  public void l(int paramInt)
  {
    this.v = paramInt;
  }
  



  public void q(String paramString)
  {
    this.w = paramString;
  }
  



  public void b(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }
  



  public void c(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }
  




  private int D()
  {
    return this.t;
  }
}
