package com.employeecard;

public class AccessControl
{
  private int H;
  
  
  private int I;
  
  
  private int J = 0;
  

  private int K = 0;
  
  
  private ResponseObject k;
  

  public AccessControl(int paramInt1, int paramInt2)
  {
    this.H = paramInt1;
    this.I = paramInt2;
  }
  




  public ResponseObject b(EmployeeCard paramg)
  {
    if (!paramg.U())
    {
      if (paramg.S() >= this.H)
      {
        paramg.e(true);
        k = new ResponseObject(200, Constants.V);
        
        InitSystem.aq.ae().info("GETACCESS: Access Control at " + this.I + " : " + Constants.V);
        InitSystem.aq.ae();
        m(F() + 1);
      }
      else
      {
        k = new ResponseObject(210, Constants.W);
        l(E() + 1);
      }
      
    }
    else
    {
      k = new ResponseObject(210, Constants.X);
      l(E() + 1);
    }
    

    paramg.e(false);
    return k;
  }
  



  public void C()
  {
    InitSystem.aq.A(Constants.V);
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
