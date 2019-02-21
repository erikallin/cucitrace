package com.orsonpdf;

import com.orsonpdf.util.a;















































public abstract class g
  extends r
{
  private h R;
  private double[] S;
  protected b K;
  
  protected g(int paramInt, h paramh)
  {
    super(paramInt);
    a.a(paramh, "functionType");
    this.R = paramh;
    this.S = new double[] { 0.0D, 1.0D };
    this.K = new b();
    this.K.a("/Domain", t.b(this.S));
    this.K.a("/FunctionType", String.valueOf(
      paramh.S()));
  }
  




  public h Q()
  {
    return this.R;
  }
  




  public double[] R()
  {
    return (double[])this.S.clone();
  }
  




  public void a(double[] paramArrayOfDouble)
  {
    a.a(paramArrayOfDouble, "domain");
    this.S = ((double[])paramArrayOfDouble.clone());
    this.K.a("/Domain", t.b(this.S));
  }
  






  public byte[] K()
  {
    return this.K.I();
  }
}
