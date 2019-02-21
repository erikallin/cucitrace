package com.orsonpdf;














public class i
  extends c
{
  private float Z;
  












  private float aa;
  













  public i(int paramInt)
  {
    super(paramInt, "/ExtGState");
  }
  




  public float T()
  {
    return this.Z;
  }
  




  public void a(float paramFloat)
  {
    this.Z = paramFloat;
    this.K.a("/CA", Float.valueOf(paramFloat));
  }
  





  public float U()
  {
    return this.aa;
  }
  





  public void b(float paramFloat)
  {
    this.aa = paramFloat;
    this.K.a("/ca", Float.valueOf(paramFloat));
  }
}
