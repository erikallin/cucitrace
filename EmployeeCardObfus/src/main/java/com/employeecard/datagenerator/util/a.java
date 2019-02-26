package com.employeecard.datagenerator.util;

import com.employeecard.core.b;
import java.util.ArrayList;
import java.util.List;

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
  






  public List<com.employeecard.core.a> u(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(aj());
    }
    
    return localArrayList;
  }
  
  private com.employeecard.core.a aj() {
    return new com.employeecard.core.a(ah(), ai());
  }
}
