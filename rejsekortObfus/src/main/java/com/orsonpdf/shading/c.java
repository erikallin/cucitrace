package com.orsonpdf.shading;

import com.orsonpdf.b;
import com.orsonpdf.r;
import com.orsonpdf.util.a;


public abstract class c
  extends r
{
  private d bU;
  protected b K;
  
  protected c(int paramInt, d paramd)
  {
    super(paramInt);
    a.aab(paramd, "shadingType");
    this.bU = paramd;
    this.K = new b();
    this.K.a("/ShadingType", String.valueOf(
      paramd.S()));
  }
  




  public d aW()
  {
    return this.bU;
  }
  






  public byte[] K()
  {
    return this.K.I();
  }
}
