package com.orsonpdf;

import com.orsonpdf.PDFUtils;
import com.orsonpdf.filter.Filter;
import com.orsonpdf.util.Args;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public abstract class Stream extends PDFObject
{
  private List<Filter> bH;
  
  Stream(int paramInt)
  {
    super(paramInt);
    this.bH = new ArrayList<Filter>();
  }
  

  public void a(Filter paramc)
  {
    Args.aab(paramc, "f");
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
    for (Filter paramc : this.bH) {
      arrayOfByte = paramc.a(arrayOfByte);
    }
    Dictionary localObject = o(arrayOfByte.length);
    localByteArrayOutputStream.write(localObject.I());
    localByteArrayOutputStream.write(PDFUtils.z("stream\n"));
    localByteArrayOutputStream.write(arrayOfByte);
    localByteArrayOutputStream.write(PDFUtils.z("endstream\n"));
    return localByteArrayOutputStream.toByteArray();
  }
 


  protected Dictionary o(int paramInt)
  {
    Dictionary localb = new Dictionary();
    localb.a("/Length", Integer.valueOf(paramInt));
    if (!this.bH.isEmpty()) {
      String[] arrayOfString = new String[this.bH.size()];
      int i = this.bH.size();
      for (int j = 0; j < i; j++) {
        Filter localc = (Filter)this.bH.get(i - j - 1);
        arrayOfString[j] = localc.aP().aS();
      }
      localb.a("/Filter", arrayOfString);
    }
    return localb;
  }
  
  public abstract byte[] X();
}
