package com.c;

import java.io.ByteArrayOutputStream;
import java.io.IOException;



public abstract class r
{
  private int X;
  private int bk;
  
  protected r(int paramInt)
  {
    this(paramInt, 0);
  }
  

  protected r(int paramInt1, int paramInt2)
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
    localByteArrayOutputStream.write(t.z(aF()));
    localByteArrayOutputStream.write(K());
    localByteArrayOutputStream.write(t.z("endobj\n"));
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
