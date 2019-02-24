package com.orsonpdf.util;


public enum f
{
  
  /** Top/left. */
  TOP_LEFT("TextAnchor.TOP_LEFT"),

  /** Top/center. */
  TOP_CENTER("TextAnchor.TOP_CENTER"),

  /** Top/right. */
  TOP_RIGHT("TextAnchor.TOP_RIGHT"),

  /** Half-ascent/left. */
  HALF_ASCENT_LEFT("TextAnchor.HALF_ASCENT_LEFT"),

  /** Half-ascent/center. */
  HALF_ASCENT_CENTER("TextAnchor.HALF_ASCENT_CENTER"),

  /** Half-ascent/right. */
  HALF_ASCENT_RIGHT("TextAnchor.HALF_ASCENT_RIGHT"),

  /** Middle/left. */
  CENTER_LEFT("TextAnchor.CENTER_LEFT"),

  /** Middle/center. */
  CENTER("TextAnchor.CENTER"),

  /** Middle/right. */
  CENTER_RIGHT("TextAnchor.CENTER_RIGHT"),

  /** Baseline/left. */
  BASELINE_LEFT("TextAnchor.BASELINE_LEFT"),

  /** Baseline/center. */
  BASELINE_CENTER("TextAnchor.BASELINE_CENTER"),

  /** Baseline/right. */
    BASELINE_RIGHT("TextAnchor.BASELINE_RIGHT"),

  /** Bottom/left. */
  BOTTOM_LEFT("TextAnchor.BOTTOM_LEFT"),

  /** Bottom/center. */
  BOTTOM_CENTER("TextAnchor.BOTTOM_CENTER"),

  /** Bottom/right. */
  BOTTOM_RIGHT("TextAnchor.BOTTOM_RIGHT");
	
  private String O;
  

  private f(String paramString1)
  {
    this.O = paramString1;
  }
  


  public boolean aZ()
  {
    return (this == TOP_LEFT) || (this == CENTER_LEFT ) || 
      (this == HALF_ASCENT_LEFT) || (this == BASELINE_LEFT) || 
      (this == BOTTOM_LEFT);
  }
  


  public boolean ba()
  {
    return (this == TOP_CENTER) || (this == CENTER) || 
      (this == HALF_ASCENT_CENTER) || (this == BASELINE_CENTER) || 
      (this == BOTTOM_CENTER);
  }
  





  public boolean bb()
  {
    return (this == TOP_RIGHT) || (this == CENTER_RIGHT) || 
      (this == HALF_ASCENT_RIGHT) || (this == BASELINE_RIGHT) || 
      (this == BOTTOM_RIGHT);
  }
  





  public boolean bc()
  {
    return (this == TOP_LEFT) || (this == TOP_CENTER) || (this == TOP_RIGHT);
  }
  





  public boolean bd()
  {
    return (this == HALF_ASCENT_LEFT) || (this == HALF_ASCENT_CENTER) || 
      (this == HALF_ASCENT_RIGHT);
  }
  





  public boolean be()
  {
    return (this == CENTER_LEFT ) || (this == CENTER) || (this == CENTER_RIGHT);
  }
  





  public boolean bf()
  {
    return (this == BASELINE_LEFT) || (this == BASELINE_CENTER) || 
      (this == BASELINE_RIGHT);
  }
  





  public boolean bg()
  {
    return (this == BOTTOM_LEFT) || (this == BOTTOM_CENTER) || 
      (this == BOTTOM_RIGHT);
  }
  





  public String P()
  {
    return this.O;
  }
}
