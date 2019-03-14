package com.orsonpdf;



public final class StitchingFunction
  extends Function
{
  @SuppressWarnings("unused")
private Function[] bE;
  
  @SuppressWarnings("unused")
private float[] bF;
  
  @SuppressWarnings("unused")
private float[] bG;
  


  public StitchingFunction(int paramInt, Function[] paramArrayOfg, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    super(paramInt, FunctionType.STITCHING);
    this.bE = paramArrayOfg;
    this.K.a("/Functions", paramArrayOfg);
    this.bF = paramArrayOfFloat1;
    this.K.a("/Bounds", paramArrayOfFloat1);
    this.bG = paramArrayOfFloat2;
    this.K.a("/Encode", paramArrayOfFloat2);
  }
}
