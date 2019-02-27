package com.b.b.a;

import java.util.ArrayList;
import java.util.List;

import com.b.a.c;

public class b
{
  private static final String[] aF = { "Meyers", "ISS", "Shackenborg", "Eurest", "Europa 1989", "Green kitchen", 
    "DTU Student Canteen 101", "KU Student Canteen", "SDU Student Canteen", "DTU Student Canteen 341" };
  
  private static c ak()
  {
    c localc = new c((String)d.a(aF));
    localc.p(d.b(0, 10));
    localc.o(d.b(0, 10));
    return localc;
  }
  





  public List<c> u(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(ak());
    }
    
    return localArrayList;
  }
}
