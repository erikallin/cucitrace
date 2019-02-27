package com.c.aa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.c.bb.aaa.b;



public class k
{
  private List<j> dl;
  
  public k()
  {
    this.dl = new ArrayList();
    b localb = new b();
    this.dl = localb.x(10);
  }
  




  public void f(j paramj)
  {
    this.dl.add(paramj);
  }
  




  public void bG()
  {
    PrintWriter localPrintWriter = null;
    try {
      localPrintWriter = new PrintWriter("repNameList.txt", "UTF-8");
    } catch (FileNotFoundException localFileNotFoundException) {
      localFileNotFoundException.printStackTrace();
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      localUnsupportedEncodingException.printStackTrace();
    }
    
    for (j localj : this.dl) {
      localPrintWriter.println(localj.bE());
    }
    
    localPrintWriter.close();
  }
  




  public List<j> bz()
  {
    return this.dl;
  }
  



  public boolean F(String paramString)
  {
    File localFile = new File(paramString);
    return localFile.exists();
  }
  



  public void c(List<j> paramList)
  {
    this.dl = paramList;
  }
}
