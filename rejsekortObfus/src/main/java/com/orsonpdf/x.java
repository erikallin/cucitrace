package com.orsonpdf;



public final class x
  extends g
{
  private g[] bE;
  
  private float[] bF;
  
  private float[] bG;
  


  public x(int paramInt, g[] paramArrayOfg, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    super(paramInt, h.STITCHING);
    this.bE = paramArrayOfg;
    this.K.a("/Functions", paramArrayOfg);
    this.bF = paramArrayOfFloat1;
    this.K.a("/Bounds", paramArrayOfFloat1);
    this.bG = paramArrayOfFloat2;
    this.K.a("/Encode", paramArrayOfFloat2);
  }
}
