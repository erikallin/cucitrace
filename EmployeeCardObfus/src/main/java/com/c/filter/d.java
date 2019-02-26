package com.c.filter;

import com.c.util.a;





public enum d
{
  
  /** ASCII85 encoding. */
  ASCII85("/ASCII85Decode"),
    
  /** Flate encoding. */
  FLATE("/FlateDecode");
	
  private String bP;
  
  private d(String paramString1)
  {
    a.aab(paramString1, "decode");
    this.bP = paramString1;
  }
  





  public String aS()
  {
    return this.bP;
  }
}
