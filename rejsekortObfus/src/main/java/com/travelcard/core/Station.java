package com.travelcard.core;



public class Station
{
  private CheckInAutomaton db;
  

  private CheckOutAutomaton dc;
  

  private int cw;
  

  private int dd;
  

  private Kiosk q;
  
  private String cy;
  

  public Station(String paramString)
  {
    this.cy = paramString;
  }
  



  public CheckInAutomaton bu()
  {
    return this.db;
  }
  



  public CheckOutAutomaton bv()
  {
    return this.dc;
  }
  



  public int bj()
  {
    return this.cw;
  }
  



  public int bw()
  {
    return this.dd;
  }
  



  public Kiosk bx()
  {
    return this.q;
  }
  



  public String bi()
  {
    return this.cy;
  }
  



  public void a(CheckInAutomaton parama)
  {
    this.db = parama;
  }
  



  public void a(CheckOutAutomaton paramb)
  {
    this.dc = paramb;
  }
  



  public void s(int paramInt)
  {
    this.cw = paramInt;
  }
  



  public void v(int paramInt)
  {
    this.dd = paramInt;
  }
  



  public void a(Kiosk parame)
  {
    this.q = parame;
  }
  



  public void B(String paramString)
  {
    this.cy = paramString;
  }
}
