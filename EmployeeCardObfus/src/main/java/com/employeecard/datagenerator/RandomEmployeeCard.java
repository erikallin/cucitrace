package com.employeecard.datagenerator;

import java.util.ArrayList;
import java.util.List;

import com.employeecard.EmployeeCard;

public class RandomEmployeeCard
{
  private static final String[] aG = { "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", 
    "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234" };
  
  private static int al() {
    return RandomUtils.b(150, 312);
  }
  
  private static int am() {
    return RandomUtils.b(0, 2);
  }
  
  private static String an() {
    return (String)RandomUtils.a(aG);
  }
  





  public List<EmployeeCard> u(int paramInt)
  {
    ArrayList<EmployeeCard> localArrayList = new ArrayList<EmployeeCard>();
    
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(ao());
    }
    
    return localArrayList;
  }
  
  private EmployeeCard ao() {
    return new EmployeeCard(an(), al(), am(), false);
  }
}
