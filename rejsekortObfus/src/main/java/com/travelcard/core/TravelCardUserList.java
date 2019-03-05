package com.travelcard.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.travelcard.datagenerator.util.RandomTravelCardUsers;



public class TravelCardUserList
{
  private List<TravelCard> dl;
  
  public TravelCardUserList()
  {
    this.dl = new ArrayList();
    RandomTravelCardUsers localb = new RandomTravelCardUsers();
    this.dl = localb.x(10);
  }
  




  public void f(TravelCard paramj)
  {
    this.dl.add(paramj);
  }
  




  public void bG()
  {
    PrintWriter localPrintWriter = null;
    try {
      localPrintWriter = new PrintWriter("repNameList.txt", "UTF-8");
    } catch (FileNotFoundException localFileNotFoundException) {
      localFileNotFoundException.printStackTrace();
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      localUnsupportedEncodingException.printStackTrace();
    }
    
    for (TravelCard localj : this.dl) {
      localPrintWriter.println(localj.bE());
    }
    
    localPrintWriter.close();
  }
  




  public List<TravelCard> bz()
  {
    return this.dl;
  }
  



  public boolean F(String paramString)
  {
    File localFile = new File(paramString);
    return localFile.exists();
  }
  



  public void c(List<TravelCard> paramList)
  {
    this.dl = paramList;
  }
}
