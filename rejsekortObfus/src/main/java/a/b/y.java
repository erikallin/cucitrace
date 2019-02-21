package a.b;

import a.b.a.c;
import a.b.a.d;
import a.b.c.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;







































public abstract class y
  extends r
{
  private List<c> bH;
  
  y(int paramInt)
  {
    super(paramInt);
    this.bH = new ArrayList();
  }
  






  public void a(c paramc)
  {
    a.a(paramc, "f");
    this.bH.add(paramc);
  }
  




  public void aO()
  {
    this.bH.clear();
  }
  







  public byte[] K()
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = X();
    for (Iterator localIterator = this.bH.iterator(); localIterator.hasNext();) { localObject = (c)localIterator.next();
      arrayOfByte = ((c)localObject).aa(arrayOfByte);
    }
    Object localObject = o(arrayOfByte.length);
    localByteArrayOutputStream.write(((b)localObject).I());
    localByteArrayOutputStream.write(t.z("stream\n"));
    localByteArrayOutputStream.write(arrayOfByte);
    localByteArrayOutputStream.write(t.z("endstream\n"));
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
