package com.employeecard.datagenerator;

import java.util.ArrayList;
import java.util.List;

import com.employeecard.AccessControl;
import com.employeecard.AccessControlList;

public class RandomAccessControl
{
  private AccessControlList aE;
  
  private int ah()
  {
    return this.aE.H().size() + 1;
  }
  
  private static int ai() {
    return RandomUtils.b(0, 3);
  }
  






  public List<com.employeecard.AccessControl> u(int paramInt)
  {
    ArrayList<AccessControl> localArrayList = new ArrayList<AccessControl>();
    
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(aj());
    }
    
    return localArrayList;
  }
  
  private com.employeecard.AccessControl aj() {
    return new com.employeecard.AccessControl(ah(), ai());
  }
}
