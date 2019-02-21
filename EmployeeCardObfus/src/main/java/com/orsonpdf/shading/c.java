package com.orsonpdf.shading;

import com.orsonpdf.b;
import com.orsonpdf.r;
import com.orsonpdf.util.a;












































public abstract class c
  extends r
{
  private d cU;
  protected b aK;
  
  protected c(int paramInt, d paramd)
  {
    super(paramInt);
    a.a(paramd, "shadingType");
    this.cU = paramd;
    this.aK = new b();
    this.aK.a("/ShadingType", String.valueOf(
      paramd.aC()));
  }
  




  public d bG()
  {
    return this.cU;
  }
  






  public byte[] au()
  {
    return this.aK.as();
  }
}
