package a.b.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;















































public class e
  implements c
{
  public d aP()
  {
    return d.bO;
  }
  
  public byte[] aa(byte[] paramArrayOfByte)
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
