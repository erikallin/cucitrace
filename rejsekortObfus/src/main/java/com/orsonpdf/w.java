package com.orsonpdf;

import com.orsonpdf.shading.c;
import com.orsonpdf.util.a;
import java.awt.geom.AffineTransform;









































public abstract class w
  extends r
{
  protected b K;
  
  public static final class a
    extends w
  {
    private c bD;
    
    public a(int paramInt, c paramc, AffineTransform paramAffineTransform)
    {
      super();
      this.K.a("/PatternType", "2");
      this.K.a("/Matrix", t.e(paramAffineTransform));
      a(paramc);
    }
    




    public c aN()
    {
      return this.bD;
    }
    




    public void a(c paramc)
    {
      a.a(paramc, "shading");
      this.bD = paramc;
      this.K.a("/Shading", this.bD);
    }
  }
  






  protected w(int paramInt)
  {
    super(paramInt);
    this.K = new b("/Pattern");
  }
  






  public byte[] K()
  {
    return this.K.I();
  }
}
