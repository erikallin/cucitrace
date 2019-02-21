package com.orsonpdf;

import com.orsonpdf.util.a;















































public abstract class g
  extends r
{
  private h aR;
  private double[] aS;
  protected b aK;
  
  protected g(int paramInt, h paramh)
  {
    super(paramInt);
    a.a(paramh, "functionType");
    this.aR = paramh;
    this.aS = new double[] { 0.0D, 1.0D };
    this.aK = new b();
    this.aK.a("/Domain", t.b(this.aS));
    this.aK.a("/FunctionType", String.valueOf(
      paramh.aC()));
  }
  




  public h aA()
  {
    return this.aR;
  }
  




  public double[] aB()
  {
    return (double[])this.aS.clone();
  }
  




  public void a(double[] paramArrayOfDouble)
  {
    a.a(paramArrayOfDouble, "domain");
    this.aS = ((double[])paramArrayOfDouble.clone());
    this.aK.a("/Domain", t.b(this.aS));
  }
  






  public byte[] au()
  {
    return this.aK.as();
  }
}
