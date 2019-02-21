package com.orsonpdf;












public final class d
  extends g
{
  double aL;
  










  float[] aM;
  










  float[] aN;
  










  public d(int paramInt, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    super(paramInt, h.aU);
    this.aK.a("/N", "1");
    this.aL = 1.0D;
    a(paramArrayOfFloat1);
    b(paramArrayOfFloat2);
  }
  




  public double av()
  {
    return this.aL;
  }
  




  public void a(double paramDouble)
  {
    this.aL = paramDouble;
    this.aK.a("/N", String.valueOf(paramDouble));
  }
  





  public float[] aw()
  {
    return (float[])this.aM.clone();
  }
  





  public void a(float[] paramArrayOfFloat)
  {
    this.aM = ((float[])paramArrayOfFloat.clone());
    this.aK.a("/C0", t.c(paramArrayOfFloat));
  }
  





  public float[] ax()
  {
    return (float[])this.aN.clone();
  }
  





  public void b(float[] paramArrayOfFloat)
  {
    this.aN = ((float[])paramArrayOfFloat.clone());
    this.aK.a("/C1", t.c(paramArrayOfFloat));
  }
}
