package com.employeecard.datagenerator;

import java.util.ArrayList;
import java.util.List;

import com.employeecard.Canteen;

public class RandomCanteen
{
  private static final String[] aF = { "Meyers", "ISS", "Shackenborg", "Eurest", "Europa 1989", "Green kitchen", 
    "DTU Student Canteen 101", "KU Student Canteen", "SDU Student Canteen", "DTU Student Canteen 341" };
  
  private static Canteen ak()
  {
    Canteen localc = new Canteen((String)RandomUtils.a(aF));
    localc.p(RandomUtils.b(0, 10));
    localc.o(RandomUtils.b(0, 10));
    return localc;
  }
  





  public List<Canteen> u(int paramInt)
  {
    ArrayList<Canteen> localArrayList = new ArrayList<Canteen>();
    
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(ak());
    }
    
    return localArrayList;
  }
}
