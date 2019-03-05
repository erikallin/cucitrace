package com.employeecard;



public class ResponseObject
{
  private int ar;
  
  private String as;
  
  private String at;
  

  public ResponseObject(int paramInt, String paramString)
  {
    this.ar = paramInt;
    this.at = paramString;
  }
  



  public int W()
  {
    return this.ar;
  }
  



  public String X()
  {
    return this.as;
  }
  



  public String Y()
  {
    return this.at;
  }
  



  public void t(int paramInt)
  {
    this.ar = paramInt;
  }
  



  public void w(String paramString)
  {
    this.at = paramString;
  }
}
