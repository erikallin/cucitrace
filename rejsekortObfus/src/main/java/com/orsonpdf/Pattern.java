package com.orsonpdf;

import java.awt.geom.AffineTransform;

import com.orsonpdf.shading.Shading;
import com.orsonpdf.util.Args;




public abstract class Pattern extends PDFObject
{
  
  
  public static final class an extends Pattern
  {
    private Shading bD;
    
    public an(int paramInt, Shading paramc, AffineTransform paramAffineTransform)
    {
      super(paramInt);
      this.K.a("/PatternType", "2");
      this.K.a("/Matrix", PDFUtils.e(paramAffineTransform));
      aa(paramc);
    }
    


    public Shading aN()
    {
      return this.bD;
    }
    


    public void aa(Shading paramc)
    {
      Args.aab(paramc, "shading");
      this.bD = paramc;
      this.K.a("/Shading", this.bD);
    }
  }
  

  protected Dictionary K;




  protected Pattern(int paramInt)
  {
    super(paramInt);
    this.K = new Dictionary("/Pattern");
  }
  



  public byte[] K()
  {
    return this.K.I();
  }
}
