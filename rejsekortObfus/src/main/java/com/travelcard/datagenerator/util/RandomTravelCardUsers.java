package com.travelcard.datagenerator.util;

import java.util.ArrayList;
import java.util.List;

import com.travelcard.core.TravelCard;

public class RandomTravelCardUsers
{
  private static final String[] dn = { "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", 
    "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234" };
  
  private static int bI() {
    return RandomUtils.d(150, 312);
  }
  
  private static String bJ() {
    return (String)RandomUtils.a(dn);
  }
  





  public List<TravelCard> x(int paramInt)
  {
    ArrayList<TravelCard> localArrayList = new ArrayList<TravelCard>();
    
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(bK());
    }
    
    return localArrayList;
  }
  
  private TravelCard bK() {
    return new TravelCard(bJ(), bI(), false);
  }
}
