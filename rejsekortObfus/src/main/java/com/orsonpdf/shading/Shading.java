package com.orsonpdf.shading;

import com.orsonpdf.Dictionary;
import com.orsonpdf.PDFObject;
import com.orsonpdf.util.Args;


public abstract class Shading
  extends PDFObject
{
  private ShadingType bU;
  protected Dictionary K;
  
  protected Shading(int paramInt, ShadingType paramd)
  {
    super(paramInt);
    Args.aab(paramd, "shadingType");
    this.bU = paramd;
    this.K = new Dictionary();
    this.K.a("/ShadingType", String.valueOf(
      paramd.S()));
  }
  




  public ShadingType aW()
  {
    return this.bU;
  }
  






  public byte[] K()
  {
    return this.K.I();
  }
}
