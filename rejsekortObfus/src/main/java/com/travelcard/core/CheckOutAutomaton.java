package com.travelcard.core;

public class CheckOutAutomaton {
  private int cz = 0;
  

  @SuppressWarnings("unused")
private final int cA = 25;
  

  private ResponseObject o;
  
  private String cy;
  

  public CheckOutAutomaton(String paramString)
  {
    B(paramString);
  }
  




  public ResponseObject c(TravelCard paramj)
  {
    if (paramj.bF()) {
      d(paramj);
      paramj.e(false);
      this.o = new ResponseObject(230, Constants.cF);
      
      InitSystem.cT.bC()
        .info("CHECKOUT: Automaton at " + this.cy + " : " + Constants.cF);
      InitSystem.cT.bD();
      t(bl() + 1);
    }
    else
    {
      this.o = new ResponseObject(240, Constants.cE);
    }
    

    return this.o;
  }
  




  public void bk()
  {
    InitSystem.cT.H(Constants.cF);
  }
  




  public String bi()
  {
    return this.cy;
  }
  



  public void B(String paramString)
  {
    this.cy = paramString;
  }
  




  private void d(TravelCard paramj)
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
