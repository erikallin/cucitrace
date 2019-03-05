package com.orsonpdf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;



public abstract class PDFObject
{
  private int X;
  private int bk;
  
  protected PDFObject(int paramInt)
  {
    this(paramInt, 0);
  }
  

  protected PDFObject(int paramInt1, int paramInt2)
  {
    this.X = paramInt1;
    this.bk = paramInt2;
  }
  

  public int S()
  {
    return this.X;
  }
  


  public int aD()
  {
    return this.bk;
  }
  


  public String aE()
  {
    return this.X + " " + this.bk + " R";
  }
  


  public byte[] I()
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    localByteArrayOutputStream.write(PDFUtils.z(aF()));
    localByteArrayOutputStream.write(K());
    localByteArrayOutputStream.write(PDFUtils.z("endobj\n"));
    return localByteArrayOutputStream.toByteArray();
  }
  

  public abstract byte[] K()
    throws IOException;
  


  private String aF()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.X).append(" ").append(this.bk).append(" ");
    localStringBuilder.append("obj\n");
    return localStringBuilder.toString();
  }
}
