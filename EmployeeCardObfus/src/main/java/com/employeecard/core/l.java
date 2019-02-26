package com.employeecard.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;








public class l
{
  private static Logger ay;
  private FileHandler az;
  private SimpleFormatter aA;
  private String aB = "Logfile.txt";
  
  public l()
  {
    C("Logfile.txt");
    ay = Logger.getLogger("Canteen Example Logger");
    ay.setLevel(Level.ALL);
    a();
  }
  



  public l(String paramString)
  {
    C(paramString);
    ay = Logger.getLogger("Canteen Example Logger");
    ay.setLevel(Level.ALL);
  }
  




  public boolean z(String paramString)
  {
    File localFile = new File(paramString);
    
    if (localFile.exists())
    {
      return true;
    }
    return false;
  }
  



  public String ad()
  {
    return this.aB;
  }
  



  public Logger ae()
  {
    if (ay == null) {
      ay = Logger.getLogger("Canteen Example Logger");
      ay.setLevel(Level.ALL);
    }
    return ay;
  }
  



  public void A(String paramString)
  {
    B(paramString);
  }
  




  public void af()
  {
    try
    {
      if (this.az == null) {
        this.az = new FileHandler(this.aB);
      }
      else
      {
        this.aA = new SimpleFormatter();
        this.az.setFormatter(this.aA);
        ay.addHandler(this.az);
      }
    }
    catch (SecurityException localSecurityException)
    {
      localSecurityException.printStackTrace();
    } catch (IOException localIOException) {
      localIOException.printStackTrace();
    }
  }
  





  public boolean B(String paramString)
  {
    BufferedReader localBufferedReader = null;
    try {
      localBufferedReader = new BufferedReader(new FileReader(this.aB));
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
  



  public void C(String paramString)
  {
    this.aB = paramString;
  }
  



  public void a()
  {
    af();
  }
}
