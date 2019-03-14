package com.employeecard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.employeecard.datagenerator.RandomEmployeeCard;



public class EmployeeCardList
{
  private List<EmployeeCard> ap;
  
  public EmployeeCardList()
  {
    this.ap = new ArrayList<EmployeeCard>();
    RandomEmployeeCard localc = new RandomEmployeeCard();
    this.ap = localc.u(10);
  }
  




  public void b(EmployeeCard paramg)
  {
    this.ap.add(paramg);
  }
  




  public void V()
  {
    PrintWriter localPrintWriter = null;
    try {
      localPrintWriter = new PrintWriter("repEmployeeList.txt", "UTF-8");
    } catch (FileNotFoundException localFileNotFoundException) {
      localFileNotFoundException.printStackTrace();
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      localUnsupportedEncodingException.printStackTrace();
    }
    
    for (EmployeeCard localg : this.ap) {
      localPrintWriter.println(localg.T());
    }
    
    localPrintWriter.close();
  }
  




  public List<EmployeeCard> P()
  {
    return this.ap;
  }
  



  public boolean t(String paramString)
  {
    File localFile = new File(paramString);
    return localFile.exists();
  }
  



  public void c(List<EmployeeCard> paramList)
  {
    this.ap = paramList;
  }
}
