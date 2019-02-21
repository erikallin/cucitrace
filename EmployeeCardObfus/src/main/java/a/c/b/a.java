package a.c.b;

import a.c.b;
import a.c.g;
import a.c.t;

















































public final class a
  extends c
{
  private double[] cR;
  private g cS;
  private double[] aS;
  private boolean[] cT;
  
  public a(int paramInt, double[] paramArrayOfDouble, g paramg)
  {
    super(paramInt, d.cW);
    a.c.c.a.a(4, paramArrayOfDouble, "coords");
    a.c.c.a.a(paramg, "function");
    this.aK.a("/ColorSpace", "/DeviceRGB");
    c(paramArrayOfDouble);
    a(paramg);
    b(new boolean[] { true, true });
    this.aS = new double[] { 0.0D, 1.0D };
  }
  




  public double[] bD()
  {
    return (double[])this.cR.clone();
  }
  




  public void c(double[] paramArrayOfDouble)
  {
    a.c.c.a.a(4, paramArrayOfDouble, "coords");
    this.cR = ((double[])paramArrayOfDouble.clone());
    this.aK.a("/Coords", t.b(this.cR));
  }
  




  public g bE()
  {
    return this.cS;
  }
  




  public void a(g paramg)
  {
    a.c.c.a.a(paramg, "function");
    this.cS = paramg;
    this.aK.a("/Function", this.cS);
  }
  




  public double[] aB()
  {
    return (double[])this.aS.clone();
  }
  




  public void a(double[] paramArrayOfDouble)
  {
    a.c.c.a.a(2, paramArrayOfDouble, "domain");
    this.aS = ((double[])paramArrayOfDouble.clone());
    this.aK.a("/Domain", t.b(this.aS));
  }
  




  public boolean[] bF()
  {
    return (boolean[])this.cT.clone();
  }
  




  public void b(boolean[] paramArrayOfBoolean)
  {
    a.c.c.a.a(2, paramArrayOfBoolean, "extend");
    this.cT = ((boolean[])paramArrayOfBoolean.clone());
    this.aK.a("/Extend", t.a(this.cT));
  }
}
