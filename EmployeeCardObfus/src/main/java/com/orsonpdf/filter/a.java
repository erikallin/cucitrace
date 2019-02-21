package com.orsonpdf.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;














































public class a
  implements c
{
  public d bz()
  {
    return d.cN;
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    b localb = new b(localByteArrayOutputStream);
    try {
      localb.write(paramArrayOfByte);
      localb.bB();
      localb.close();
    }
    catch (IOException localIOException) {
      throw new RuntimeException(localIOException);
    }
    return localByteArrayOutputStream.toByteArray();
  }
}
