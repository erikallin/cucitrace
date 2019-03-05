package com.orsonpdf;

import com.orsonpdf.util.Args;


public abstract class Function
  extends PDFObject
{
  private FunctionType R;
  private double[] S;
  protected Dictionary K;
  
  protected Function(int paramInt, FunctionType paramh)
  {
    super(paramInt);
    Args.aab(paramh, "functionType");
    this.R = paramh;
    this.S = new double[] { 0.0D, 1.0D };
    this.K = new Dictionary();
    this.K.a("/Domain", PDFUtils.b(this.S));
    this.K.a("/FunctionType", String.valueOf(
      paramh.S()));
  }


  public FunctionType Q()
  {
    return this.R;
  }
  

  public double[] R()
  {
    return (double[])this.S.clone();
  }
  

  public void a(double[] paramArrayOfDouble)
  {
    Args.aab(paramArrayOfDouble, "domain");
    this.S = ((double[])paramArrayOfDouble.clone());
    this.K.a("/Domain", PDFUtils.b(this.S));
  }
  






  public byte[] K()
  {
    return this.K.I();
  }
}
