package com.travelcard.core;

public class CheckInAutomaton {
  private int cw = 0;
  

  @SuppressWarnings("unused")
private final int cx = 25;
  

  private ResponseObject o;
  
  private String cy;
  

  public CheckInAutomaton(String paramString)
  {
    this.cy = paramString;
  }
  





  public ResponseObject a(TravelCard paramj)
  {
    if (!paramj.bF())
    {
      if (b(paramj)) {
        paramj.e(true);
        this.o = new ResponseObject(200, Constants.cD);
        
        InitSystem.cT.bC()
          .info("CHECKIN: Automaton at " + this.cy + " : " + Constants.cD);
        InitSystem.cT.bD();
        s(bj() + 1);
      }
      else
      {
        this.o = new ResponseObject(220, Constants.cC);
      }
      

    }
    else {
      this.o = new ResponseObject(210, Constants.cB);
    }
    

    return this.o;
  }
  



  public void bh()
  {
    InitSystem.cT.H(Constants.cD);
  }
  



  public String bi()
  {
    return this.cy;
  }
  



  public void B(String paramString)
  {
    this.cy = paramString;
  }
  



  private boolean b(TravelCard paramj)
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
