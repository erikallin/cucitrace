package com.travelcard.core;



public class TravelCard
{
  private int t;
  

  private boolean dj;
  

  private String dk;
  


  public TravelCard() {}
  


  public TravelCard(int paramInt)
  {
    this.t = paramInt;
  }
  



  public TravelCard(String paramString)
  {
    this.dk = paramString;
  }
  



  public TravelCard(String paramString, int paramInt, boolean paramBoolean)
  {
    this.dk = paramString;
    this.t = paramInt;
    this.dj = paramBoolean;
  }
  



  public void w(int paramInt)
  {
    this.t += paramInt;
  }
  




  public int x()
  {
    return this.t;
  }
  



  public String bE()
  {
    return this.dk;
  }
  



  public boolean bF()
  {
    return this.dj;
  }
  



  public void k(int paramInt)
  {
    this.t = paramInt;
  }
  



  public void e(boolean paramBoolean)
  {
    this.dj = paramBoolean;
  }
  



  public void K(String paramString)
  {
    this.dk = paramString;
  }
}
