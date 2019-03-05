package com.employeecard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;




public class AccessControlList
{
  private List<AccessControl> L;
  
  public AccessControlList()
  {
    L = new ArrayList<AccessControl>();
    com.employeecard.datagenerator.RandomAccessControl locala = new com.employeecard.datagenerator.RandomAccessControl();
    L = locala.u(10);
  }
  




  public void a(AccessControl parama)
  {
    this.L.add(parama);
  }
  




  public void G()
  {
    PrintWriter localPrintWriter = null;
    try {
      localPrintWriter = new PrintWriter("repAccessControlList.txt", "UTF-8");
    } catch (FileNotFoundException localFileNotFoundException) {
      localFileNotFoundException.printStackTrace();
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      localUnsupportedEncodingException.printStackTrace();
    }
    
    for (AccessControl locala : this.L) {
      localPrintWriter.println(locala.D());
    }
    
    localPrintWriter.close();
  }
  




  public List<AccessControl> H()
  {
    return this.L;
  }
  



  public boolean t(String paramString)
  {
    File localFile = new File(paramString);
    return localFile.exists();
  }
  



  public void a(List<AccessControl> paramList)
  {
    this.L = paramList;
  }
}
