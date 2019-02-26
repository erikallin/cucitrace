package com.c;

import com.c.filter.c;
import com.c.filter.d;
import com.c.util.a;
import com.orsonpdf.PDFUtils;
import com.orsonpdf.filter.Filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class y extends r
{
  private List<c> bH;
  
  y(int paramInt)
  {
    super(paramInt);
    this.bH = new ArrayList<c>();
  }
  

  public void a(c paramc)
  {
    a.aab(paramc, "f");
    this.bH.add(paramc);
  }
  


  public void aO()
  {
    this.bH.clear();
  }
  

  
  public byte[] K() throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = X();
    for (c paramc : this.bH) {
      arrayOfByte = paramc.a(arrayOfByte);
    }
    b localObject = o(arrayOfByte.length);
    localByteArrayOutputStream.write(localObject.I());
    localByteArrayOutputStream.write(PDFUtils.toBytes("stream\n"));
    localByteArrayOutputStream.write(arrayOfByte);
    localByteArrayOutputStream.write(PDFUtils.toBytes("endstream\n"));
    return localByteArrayOutputStream.toByteArray();
  }
 


  protected b o(int paramInt)
  {
    b localb = new b();
    localb.a("/Length", Integer.valueOf(paramInt));
    if (!this.bH.isEmpty()) {
      String[] arrayOfString = new String[this.bH.size()];
      int i = this.bH.size();
      for (int j = 0; j < i; j++) {
        c localc = (c)this.bH.get(i - j - 1);
        arrayOfString[j] = localc.aP().aS();
      }
      localb.a("/Filter", arrayOfString);
    }
    return localb;
  }
  
  public abstract byte[] X();
}
