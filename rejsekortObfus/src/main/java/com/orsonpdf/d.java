package com.orsonpdf;












public final class d
  extends g
{
  double L;
  










  float[] M;
  










  float[] N;
  










  public d(int paramInt, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    super(paramInt, h.U);
    this.K.a("/N", "1");
    this.L = 1.0D;
    a(paramArrayOfFloat1);
    b(paramArrayOfFloat2);
  }
  




  public double L()
  {
    return this.L;
  }
  




  public void a(double paramDouble)
  {
    this.L = paramDouble;
    this.K.a("/N", String.valueOf(paramDouble));
  }
  





  public float[] M()
  {
    return (float[])this.M.clone();
  }
  





  public void a(float[] paramArrayOfFloat)
  {
    this.M = ((float[])paramArrayOfFloat.clone());
    this.K.a("/C0", t.c(paramArrayOfFloat));
  }
  





  public float[] N()
  {
    return (float[])this.N.clone();
  }
  





  public void b(float[] paramArrayOfFloat)
  {
    this.N = ((float[])paramArrayOfFloat.clone());
    this.K.a("/C1", t.c(paramArrayOfFloat));
  }
}
