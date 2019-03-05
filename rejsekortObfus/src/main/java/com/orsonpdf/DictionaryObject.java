package com.orsonpdf;

import com.orsonpdf.util.Args;


public class DictionaryObject
  extends PDFObject
{
  protected Dictionary K;
  
  DictionaryObject(int paramInt, String paramString)
  {
    super(paramInt);
    this.K = new Dictionary(paramString);
  }
  


  public void a(String paramString, Object paramObject)
  {
    Args.aab(paramObject, "value");
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
