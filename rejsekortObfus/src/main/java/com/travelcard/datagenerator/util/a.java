package com.travelcard.datagenerator.util;

import com.travelcard.core.g;
import java.util.ArrayList;
import java.util.List;

public class a
{
  private static final String[] dm = { "Lyngby", "Virum", "Valby", "Vanlose", "amager", "oresund", 
    "Gentofte", "Buddinge", "Vangede", "Hellerup" };
  
  private static g bH()
  {
    g localg = new g((String)c.a(dm));
    localg.s(c.d(0, 10));
    localg.v(c.d(0, 10));
    return localg;
  }
  





  public List<g> x(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(bH());
    }
    
    return localArrayList;
  }
}
