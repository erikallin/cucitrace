package com.b.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;




public class b
{
  private List<a> L;
  
  public b()
  {
    this.L = new ArrayList();
    com.b.b.a locala = new com.b.b.a();
    this.L = locala.u(10);
  }
  




  public void a(a parama)
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
    
    for (a locala : this.L) {
      localPrintWriter.println(locala.D());
    }
    
    localPrintWriter.close();
  }
  




  public List<a> H()
  {
    return this.L;
  }
  



  public boolean t(String paramString)
  {
    File localFile = new File(paramString);
    return localFile.exists();
  }
  



  public void a(List<a> paramList)
  {
    this.L = paramList;
  }
}
