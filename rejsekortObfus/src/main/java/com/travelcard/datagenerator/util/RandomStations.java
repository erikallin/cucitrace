package com.travelcard.datagenerator.util;

import java.util.ArrayList;
import java.util.List;

import com.travelcard.core.Station;

public class RandomStations
{
  private static final String[] dm = { "Lyngby", "Virum", "Valby", "Vanlose", "amager", "oresund", 
    "Gentofte", "Buddinge", "Vangede", "Hellerup" };
  
  private static Station bH()
  {
    Station localg = new Station((String)RandomUtils.a(dm));
    localg.s(RandomUtils.d(0, 10));
    localg.v(RandomUtils.d(0, 10));
    return localg;
  }
  





  public List<Station> x(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(bH());
    }
    
    return localArrayList;
  }
}
