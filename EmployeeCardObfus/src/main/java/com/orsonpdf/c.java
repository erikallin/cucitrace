package com.orsonpdf;

import com.orsonpdf.util.a;











































public class c
  extends r
{
  protected b aK;
  
  c(int paramInt, String paramString)
  {
    super(paramInt);
    this.aK = new b(paramString);
  }
  






  public void a(String paramString, Object paramObject)
  {
    a.a(paramObject, "value");
    this.aK.a("/" + paramString, paramObject);
  }
  






  public Object E(String paramString)
  {
    return this.aK.E("/" + paramString);
  }
  






  public byte[] au()
  {
    return this.aK.as();
  }
}
