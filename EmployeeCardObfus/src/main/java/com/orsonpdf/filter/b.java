package com.orsonpdf.filter;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;




















































public class b
  extends FilterOutputStream
{
  private int bI = 72;
  
  private int cI;
  
  private int cJ;
  
  private int cK;
  
  private boolean cL;
  
  private boolean cM;
  

  public b(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  







  public b(OutputStream paramOutputStream, boolean paramBoolean)
  {
    this(paramOutputStream);
    this.cM = paramBoolean;
  }
  








  public b(OutputStream paramOutputStream, int paramInt, boolean paramBoolean)
  {
    this(paramOutputStream);
    
    this.cM = paramBoolean;
  }
  

  private void bA()
    throws IOException
  {
    this.cL = true;
  }
  






  public void z(int paramInt)
    throws IOException
  {
    if (!this.cL) {
      bA();
    }
    switch (this.cK++) {
    case 0: 
      this.cJ |= (paramInt & 0xFF) << 24;
      break;
    case 1: 
      this.cJ |= (paramInt & 0xFF) << 16;
      break;
    case 2: 
      this.cJ |= (paramInt & 0xFF) << 8;
      break;
    case 3: 
      this.cJ |= paramInt & 0xFF;
      if (this.cJ == 0)
      {
        this.out.write(122);
        if (this.cI++ >= this.bI) {
          this.cI = 0;
          this.out.write(13);
          this.out.write(10);
        }
      } else if ((this.cM) && (this.cJ == 538976288))
      {
        this.out.write(121);
        if (this.cI++ >= this.bI) {
          this.cI = 0;
          this.out.write(13);
          this.out.write(10);
        }
      } else {
        d(this.cJ, this.cK);
      }
      this.cJ = 0;
      this.cK = 0;
    }
    
  }
  







  public void A(int paramInt)
    throws IOException
  {
    super.write(paramInt);
  }
  







  public void b(byte[] paramArrayOfByte)
    throws IOException
  {
    a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  









  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    for (int i = 0; i < paramInt2; i++) {
      A(paramArrayOfByte[(paramInt1 + i)]);
    }
  }
  






  private void d(int paramInt1, int paramInt2)
    throws IOException
  {
    int i = 5;
    byte[] arrayOfByte = new byte[5];
    int j = 0;
    
    long l = paramInt1 & 0xFFFFFFFF;
    do
    {
      arrayOfByte[(j++)] = ((byte)(int)(l % 85L));
      l /= 85L;
      i--;
    } while (
    

      i > 0);
    
    i = paramInt2;
    do {
      this.out.write(arrayOfByte[(j = (short)(j - 1))] + 33);
      if (this.cI++ >= this.bI) {
        this.cI = 0;
        this.out.write(13);
        this.out.write(10);
      }
    } while (
    





      i-- > 0);
  }
  





  public void bB()
    throws IOException
  {
    if (this.cL) {
      if (this.cK > 0)
        d(this.cJ, this.cK);
      if (this.cI + 2 > this.bI) {
        this.out.write(13);
        this.out.write(10);
      }
      
      this.out.write(126);
      this.out.write(62);
      this.out.write(13);
      this.out.write(10);
      
      this.cL = false;
      this.cJ = (this.cK = 0);
    }
    
    super.flush();
  }
}
