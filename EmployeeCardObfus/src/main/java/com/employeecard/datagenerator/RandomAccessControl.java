package com.employeecard.datagenerator;

import java.util.ArrayList;
import java.util.List;

import com.employeecard.b;

public class a
{
  private b aE;
  
  private int ah()
  {
    return this.aE.H().size() + 1;
  }
  
  private static int ai() {
    return d.b(0, 3);
  }
  






  public List<com.employeecard.a> u(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(aj());
    }
    
    return localArrayList;
  }
  
  private com.employeecard.a aj() {
    return new com.employeecard.a(ah(), ai());
  }
}
