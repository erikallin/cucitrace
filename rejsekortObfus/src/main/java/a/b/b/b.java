package a.b.b;

import a.b.c.a;
import a.b.g;
import a.b.t;

















































public final class b
  extends c
{
  private double[] bR;
  private g bS;
  private double[] S;
  private boolean[] bT;
  
  public b(int paramInt, double[] paramArrayOfDouble, g paramg)
  {
    super(paramInt, d.bX);
    a.a(6, paramArrayOfDouble, "coords");
    a.a(paramg, "function");
    this.K.a("/ColorSpace", "/DeviceRGB");
    c(paramArrayOfDouble);
    aa(paramg);
    b(new boolean[] { true, true });
    this.S = new double[] { 0.0D, 1.0D };
  }
  




  public double[] aT()
  {
    return (double[])this.bR.clone();
  }
  





  public void c(double[] paramArrayOfDouble)
  {
    a.a(6, paramArrayOfDouble, "coords");
    this.bR = ((double[])paramArrayOfDouble.clone());
    this.K.a("/Coords", t.b(this.bR));
  }
  




  public g aU()
  {
    return this.bS;
  }
  




  public void aa(g paramg)
  {
    a.a(paramg, "function");
    this.bS = paramg;
    this.K.a("/Function", this.bS);
  }
  




  public double[] R()
  {
    return (double[])this.S.clone();
  }
  




  public void aa(double[] paramArrayOfDouble)
  {
    a.a(2, paramArrayOfDouble, "domain");
    this.S = ((double[])paramArrayOfDouble.clone());
    this.K.a("/Domain", t.b(this.S));
  }
  




  public boolean[] aV()
  {
    return (boolean[])this.bT.clone();
  }
  




  public void b(boolean[] paramArrayOfBoolean)
  {
    a.a(2, paramArrayOfBoolean, "extend");
    this.bT = ((boolean[])paramArrayOfBoolean.clone());
    this.K.a("/Extend", t.aa(this.bT));
  }
}
