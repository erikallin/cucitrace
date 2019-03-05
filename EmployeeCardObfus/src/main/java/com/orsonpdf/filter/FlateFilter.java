package com.orsonpdf.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;


public class FlateFilter
  implements Filter
{
  public FilterType aP()
  {
    return FilterType.FLATE;
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DeflaterOutputStream localDeflaterOutputStream = new DeflaterOutputStream(localByteArrayOutputStream);
    try {
      localDeflaterOutputStream.write(paramArrayOfByte);
      localDeflaterOutputStream.flush();
      localDeflaterOutputStream.close();
    }
    catch (IOException localIOException) {
      throw new RuntimeException(localIOException);
    }
    return localByteArrayOutputStream.toByteArray();
  }
}
