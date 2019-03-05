package com.employeecard;



public class EmployeeCard
{
  private int s;
  

  private int am;
  

  private boolean an;
  

  private String ao;
  


  public EmployeeCard() {}
  


  public EmployeeCard(int paramInt)
  {
    this.s = paramInt;
  }
  



  public EmployeeCard(String paramString)
  {
    this.ao = paramString;
  }
  



  public EmployeeCard(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.ao = paramString;
    this.s = paramInt1;
    this.am = paramInt2;
    this.an = paramBoolean;
  }
  



  public void q(int paramInt)
  {
    this.s += paramInt;
  }
  


  public void r(int paramInt)
  {
    this.s -= paramInt;
  }
  


  public int u()
  {
    return this.s;
  }
  



  public int S()
  {
    return this.am;
  }
  



  public String T()
  {
    return this.ao;
  }
  



  public boolean U()
  {
    return this.an;
  }
  



  public void j(int paramInt)
  {
    this.s = paramInt;
  }
  



  public void s(int paramInt)
  {
    this.am = paramInt;
  }
  



  public void e(boolean paramBoolean)
  {
    this.an = paramBoolean;
  }
  



  public void v(String paramString)
  {
    this.ao = paramString;
  }
}
