package com.b;

import java.awt.geom.AffineTransform;

import com.b.shading.c;
import com.b.util.a;




public abstract class w extends r
{
  
  
  public static final class an extends w
  {
    private c bD;
    
    public an(int paramInt, c paramc, AffineTransform paramAffineTransform)
    {
      super(paramInt);
      this.K.a("/PatternType", "2");
      this.K.a("/Matrix", t.e(paramAffineTransform));
      aa(paramc);
    }
    


    public c aN()
    {
      return this.bD;
    }
    


    public void aa(c paramc)
    {
      a.aab(paramc, "shading");
      this.bD = paramc;
      this.K.a("/Shading", this.bD);
    }
  }
  

  protected b K;




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
