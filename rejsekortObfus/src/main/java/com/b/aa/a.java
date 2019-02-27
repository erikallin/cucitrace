package com.b.aa;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class a
  implements c
{
  public d aP()
  {
    return d.ASCII85;
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    b localb = new b(localByteArrayOutputStream);
    try {
      localb.write(paramArrayOfByte);
      localb.aR();
      localb.close();
    }
    catch (IOException localIOException) {
      throw new RuntimeException(localIOException);
    }
    return localByteArrayOutputStream.toByteArray();
  }
}
