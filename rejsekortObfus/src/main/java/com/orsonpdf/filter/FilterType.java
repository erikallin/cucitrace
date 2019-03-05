package com.orsonpdf.filter;

import com.orsonpdf.util.Args;





public enum FilterType
{
  
  /** ASCII85 encoding. */
  ASCII85("/ASCII85Decode"),
    
  /** Flate encoding. */
  FLATE("/FlateDecode");
	
  private String bP;
  
  private FilterType(String paramString1)
  {
    Args.aab(paramString1, "decode");
    this.bP = paramString1;
  }
  





  public String aS()
  {
    return this.bP;
  }
}
