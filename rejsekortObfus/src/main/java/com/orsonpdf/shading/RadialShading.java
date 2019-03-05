package com.orsonpdf.shading;

import com.orsonpdf.Function;
import com.orsonpdf.PDFUtils;
import com.orsonpdf.util.Args;


public final class RadialShading
  extends Shading
{
  private double[] bR;
  private Function bS;
  private double[] S;
  private boolean[] bT;
  
  public RadialShading(int paramInt, double[] paramArrayOfDouble, Function paramg)
  {
    super(paramInt, ShadingType.RADIAL);
    Args.aad(6, paramArrayOfDouble, "coords");
    Args.aab(paramg, "function");
    this.K.a("/ColorSpace", "/DeviceRGB");
    c(paramArrayOfDouble);
    a(paramg);
    b(new boolean[] { true, true });
    this.S = new double[] { 0.0D, 1.0D };
  }
  




  public double[] aT()
  {
    return (double[])this.bR.clone();
  }
  





  public void c(double[] paramArrayOfDouble)
  {
    Args.aad(6, paramArrayOfDouble, "coords");
    this.bR = ((double[])paramArrayOfDouble.clone());
    this.K.a("/Coords", PDFUtils.b(this.bR));
  }
  




  public Function aU()
  {
    return this.bS;
  }
  




  public void a(Function paramg)
  {
    Args.aab(paramg, "function");
    this.bS = paramg;
    this.K.a("/Function", this.bS);
  }
  




  public double[] R()
  {
    return (double[])this.S.clone();
  }
  




  public void a(double[] paramArrayOfDouble)
  {
    Args.aad(2, paramArrayOfDouble, "domain");
    this.S = ((double[])paramArrayOfDouble.clone());
    this.K.a("/Domain", PDFUtils.b(this.S));
  }
  




  public boolean[] aV()
  {
    return (boolean[])this.bT.clone();
  }
  




  public void b(boolean[] paramArrayOfBoolean)
  {
    Args.aac(2, paramArrayOfBoolean, "extend");
    this.bT = ((boolean[])paramArrayOfBoolean.clone());
    this.K.a("/Extend", PDFUtils.a(this.bT));
  }
}
