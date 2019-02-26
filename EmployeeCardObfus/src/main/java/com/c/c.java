package com.c;

import com.c.util.a;


public class c
  extends r
{
  protected b K;
  
  c(int paramInt, String paramString)
  {
    super(paramInt);
    this.K = new b(paramString);
  }
  


  public void a(String paramString, Object paramObject)
  {
    a.aab(paramObject, "value");
    this.K.a("/" + paramString, paramObject);
  }
  


  public Object v(String paramString)
  {
    return this.K.v("/" + paramString);
  }
  


  public byte[] K()
  {
    return this.K.I();
  }
}
