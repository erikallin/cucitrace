package com.travelcard.core;

import java.util.logging.Logger;

public class b {
  private int cz = 0;
  

  private final int cA = 25;
  

  private f o;
  
  private String cy;
  

  public b(String paramString)
  {
    B(paramString);
  }
  




  public f c(j paramj)
  {
    if (paramj.bF()) {
      d(paramj);
      paramj.e(false);
      this.o = new f(230, "the travel card is successfully checked-out");
      
      d.cT.bC()
        .info("CHECKOUT: Automaton at " + this.cy + " : " + "the travel card is successfully checked-out");
      d.cT.bD();
      t(bl() + 1);
    }
    else
    {
      this.o = new f(240, "the travel card is not checked-in");
    }
    

    return this.o;
  }
  




  public void bk()
  {
    d.cT.H("the travel card is successfully checked-out");
  }
  




  public String bi()
  {
    return this.cy;
  }
  



  public void B(String paramString)
  {
    this.cy = paramString;
  }
  




  private void d(j paramj)
  {
    paramj.k(paramj.x() - 25);
  }
  




  public int bl()
  {
    return this.cz;
  }
  



  public void t(int paramInt)
  {
    this.cz = paramInt;
  }
}
