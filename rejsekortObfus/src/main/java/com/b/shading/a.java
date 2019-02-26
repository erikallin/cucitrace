package com.b.shading;

import com.b.b;
import com.b.g;
import com.b.t;


public final class a
  extends c
{
  private double[] bR;
  private g bS;
  private double[] S;
  private boolean[] bT;
  
  public a(int paramInt, double[] paramArrayOfDouble, g paramg)
  {
    super(paramInt, d.AXIAL);
    com.b.util.a.aad(4, paramArrayOfDouble, "coords");
    com.b.util.a.aab(paramg, "function");
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
    com.b.util.a.aad(4, paramArrayOfDouble, "coords");
    this.bR = ((double[])paramArrayOfDouble.clone());
    this.K.a("/Coords", t.b(this.bR));
  }
  

  public g aU()
  {
    return this.bS;
  }
  




  public void a(g paramg)
  {
    com.b.util.a.aab(paramg, "function");
    this.bS = paramg;
    this.K.a("/Function", this.bS);
  }
  




  public double[] R()
  {
    return (double[])this.S.clone();
  }
  




  public void a(double[] paramArrayOfDouble)
  {
    com.b.util.a.aad(2, paramArrayOfDouble, "domain");
    this.S = ((double[])paramArrayOfDouble.clone());
    this.K.a("/Domain", t.b(this.S));
  }
  




  public boolean[] aV()
  {
    return (boolean[])this.bT.clone();
  }
  




  public void b(boolean[] paramArrayOfBoolean)
  {
    com.b.util.a.aac(2, paramArrayOfBoolean, "extend");
    this.bT = ((boolean[])paramArrayOfBoolean.clone());
    this.K.a("/Extend", t.a(this.bT));
  }
}
