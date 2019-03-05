package com.orsonpdf.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class ASCII85Filter
  implements Filter
{
  public FilterType aP()
  {
    return FilterType.ASCII85;
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    Ascii85OutputStream localb = new Ascii85OutputStream(localByteArrayOutputStream);
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
