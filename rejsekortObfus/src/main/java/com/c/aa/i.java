package com.c.aa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;








public class i
{
  private static Logger df;
  private FileHandler dg;
  private SimpleFormatter dh;
  private String di = "Logfile.txt";
  
  public i()
  {
    J("Logfile.txt");
    df = Logger.getLogger("Travel Card Example Logger");
    df.setLevel(Level.ALL);
    a();
  }
  



  public i(String paramString)
  {
    J(paramString);
    df = Logger.getLogger("Travel Card Example Logger");
    df.setLevel(Level.ALL);
  }
  




  public boolean G(String paramString)
  {
    File localFile = new File(paramString);
    
    if (localFile.exists())
    {
      return true;
    }
    return false;
  }
  



  public String bB()
  {
    return this.di;
  }
  



  public Logger bC()
  {
    if (df == null) {
      df = Logger.getLogger("Travel Card Example Logger");
      df.setLevel(Level.ALL);
    }
    return df;
  }
  



  public void H(String paramString)
  {
    I(paramString);
  }
  




  public void bD()
  {
    try
    {
      if (this.dg == null) {
        this.dg = new FileHandler(this.di);
      }
      else
      {
        this.dh = new SimpleFormatter();
        this.dg.setFormatter(this.dh);
        df.addHandler(this.dg);
      }
    }
    catch (SecurityException localSecurityException)
    {
      localSecurityException.printStackTrace();
    } catch (IOException localIOException) {
      localIOException.printStackTrace();
    }
  }
  





  public boolean I(String paramString)
  {
    BufferedReader localBufferedReader = null;
    try {
      localBufferedReader = new BufferedReader(new FileReader(this.di));
    } catch (FileNotFoundException localFileNotFoundException) {
      localFileNotFoundException.printStackTrace();
    }
    
    try
    {
      String str;
      while ((str = localBufferedReader.readLine()) != null) {
        if (str.equals(paramString)) {
          return true;
        }
      }
    } catch (IOException localIOException1) {
      localIOException1.printStackTrace();
    }
    try
    {
      localBufferedReader.close();
    } catch (IOException localIOException2) {
      localIOException2.printStackTrace();
    }
    return false;
  }
  



  public void J(String paramString)
  {
    this.di = paramString;
  }
  



  public void a()
  {
    bD();
  }
}
