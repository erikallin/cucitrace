package com.c.aa;

import java.util.logging.Logger;

public class a {
  private int cw = 0;
  

  private final int cx = 25;
  

  private f o;
  
  private String cy;
  

  public a(String paramString)
  {
    this.cy = paramString;
  }
  





  public f a(j paramj)
  {
    if (!paramj.bF())
    {
      if (b(paramj)) {
        paramj.e(true);
        this.o = new f(200, "the travel card is checked-in");
        
        d.cT.bC()
          .info("CHECKIN: Automaton at " + this.cy + " : " + "the travel card is checked-in");
        d.cT.bD();
        s(bj() + 1);
      }
      else
      {
        this.o = new f(220, "the travel card balance is too low");
      }
      

    }
    else {
      this.o = new f(210, "the travel card is already checked-in");
    }
    

    return this.o;
  }
  



  public void bh()
  {
    d.cT.H("the travel card is checked-in");
  }
  



  public String bi()
  {
    return this.cy;
  }
  



  public void B(String paramString)
  {
    this.cy = paramString;
  }
  



  private boolean b(j paramj)
  {
    return paramj.x() > 25;
  }
  



  public int bj()
  {
    return this.cw;
  }
  



  public void s(int paramInt)
  {
    this.cw = paramInt;
  }
}
