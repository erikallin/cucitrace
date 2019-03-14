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
        this.o = new ResponseObject(200, "the travel card is checked-in");
        
        InitSystem.cT.bC()
          .info("CHECKIN: Automaton at " + this.cy + " : " + "the travel card is checked-in");
        InitSystem.cT.bD();
        s(bj() + 1);
      }
      else
      {
        this.o = new ResponseObject(220, "the travel card balance is too low");
      }
      

    }
    else {
      this.o = new ResponseObject(210, "the travel card is already checked-in");
    }
    

    return this.o;
  }
  



  public void bh()
  {
    InitSystem.cT.H("the travel card is checked-in");
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
