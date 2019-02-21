package com.orsonpdf.filter;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;




















































public class b
  extends FilterOutputStream
{
  private int aI = 72;
  
  private int bI;
  
  private int bJ;
  
  private int bK;
  
  private boolean bL;
  
  private boolean bM;
  

  public b(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  







  public b(OutputStream paramOutputStream, boolean paramBoolean)
  {
    this(paramOutputStream);
    this.bM = paramBoolean;
  }
  








  public b(OutputStream paramOutputStream, int paramInt, boolean paramBoolean)
  {
    this(paramOutputStream);
    
    this.bM = paramBoolean;
  }
  

  private void aQ()
    throws IOException
  {
    this.bL = true;
  }
  






  public void q(int paramInt)
    throws IOException
  {
    if (!this.bL) {
      aQ();
    }
    switch (this.bK++) {
    case 0: 
      this.bJ |= (paramInt & 0xFF) << 24;
      break;
    case 1: 
      this.bJ |= (paramInt & 0xFF) << 16;
      break;
    case 2: 
      this.bJ |= (paramInt & 0xFF) << 8;
      break;
    case 3: 
      this.bJ |= paramInt & 0xFF;
      if (this.bJ == 0)
      {
        this.out.write(122);
        if (this.bI++ >= this.aI) {
          this.bI = 0;
          this.out.write(13);
          this.out.write(10);
        }
      } else if ((this.bM) && (this.bJ == 538976288))
      {
        this.out.write(121);
        if (this.bI++ >= this.aI) {
          this.bI = 0;
          this.out.write(13);
          this.out.write(10);
        }
      } else {
        b(this.bJ, this.bK);
      }
      this.bJ = 0;
      this.bK = 0;
    }
    
  }
  







  public void r(int paramInt)
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
      r(paramArrayOfByte[(paramInt1 + i)]);
    }
  }
  






  private void b(int paramInt1, int paramInt2)
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
      if (this.bI++ >= this.aI) {
        this.bI = 0;
        this.out.write(13);
        this.out.write(10);
      }
    } while (
    





      i-- > 0);
  }
  





  public void aR()
    throws IOException
  {
    if (this.bL) {
      if (this.bK > 0)
        b(this.bJ, this.bK);
      if (this.bI + 2 > this.aI) {
        this.out.write(13);
        this.out.write(10);
      }
      
      this.out.write(126);
      this.out.write(62);
      this.out.write(13);
      this.out.write(10);
      
      this.bL = false;
      this.bJ = (this.bK = 0);
    }
    
    super.flush();
  }
}
