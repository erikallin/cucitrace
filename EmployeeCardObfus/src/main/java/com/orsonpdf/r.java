package com.orsonpdf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;













































public abstract class r
{
  private int aX;
  private int ck;
  
  protected r(int paramInt)
  {
    this(paramInt, 0);
  }
  






  protected r(int paramInt1, int paramInt2)
  {
    this.aX = paramInt1;
    this.ck = paramInt2;
  }
  




  public int aC()
  {
    return this.aX;
  }
  




  public int bn()
  {
    return this.ck;
  }
  







  public String bo()
  {
    return this.aX + " " + this.ck + " R";
  }
  





  public byte[] as()
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    localByteArrayOutputStream.write(t.I(bp()));
    localByteArrayOutputStream.write(au());
    localByteArrayOutputStream.write(t.I("endobj\n"));
    return localByteArrayOutputStream.toByteArray();
  }
  



  public abstract byte[] au()
    throws IOException;
  


  private String bp()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.aX).append(" ").append(this.ck).append(" ");
    localStringBuilder.append("obj\n");
    return localStringBuilder.toString();
  }
}
