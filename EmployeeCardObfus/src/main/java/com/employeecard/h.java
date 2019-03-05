package com.employeecard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.employeecard.datagenerator.c;



public class h
{
  private List<g> ap;
  
  public h()
  {
    this.ap = new ArrayList();
    c localc = new c();
    this.ap = localc.u(10);
  }
  




  public void b(g paramg)
  {
    this.ap.add(paramg);
  }
  




  public void V()
  {
    PrintWriter localPrintWriter = null;
    try {
      localPrintWriter = new PrintWriter("repNameList.txt", "UTF-8");
    } catch (FileNotFoundException localFileNotFoundException) {
      localFileNotFoundException.printStackTrace();
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      localUnsupportedEncodingException.printStackTrace();
    }
    
    for (g localg : this.ap) {
      localPrintWriter.println(localg.T());
    }
    
    localPrintWriter.close();
  }
  




  public List<g> P()
  {
    return this.ap;
  }
  



  public boolean t(String paramString)
  {
    File localFile = new File(paramString);
    return localFile.exists();
  }
  



  public void c(List<g> paramList)
  {
    this.ap = paramList;
  }
}
