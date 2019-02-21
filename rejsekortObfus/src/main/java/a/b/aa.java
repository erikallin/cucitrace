package a.b;

import a.b.a.c;
import a.b.a.d;
import a.b.c.a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class aa
  extends s
{
  private List bH = new ArrayList();
  
  aa(int paramInt)
  {
    super(paramInt);
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
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = X();
    Iterator localIterator = this.bH.iterator();
    while (localIterator.hasNext())
    {
      localObject = (c)localIterator.next();
      arrayOfByte = ((c)localObject).aa(arrayOfByte);
    }
    Object localObject = o(arrayOfByte.length);
    localByteArrayOutputStream.write(((b)localObject).I());
    localByteArrayOutputStream.write(u.z("stream\n"));
    localByteArrayOutputStream.write(arrayOfByte);
    localByteArrayOutputStream.write(u.z("endstream\n"));
    return localByteArrayOutputStream.toByteArray();
  }
  
  protected b o(int paramInt)
  {
    b localb = new b();
    localb.a("/Length", Integer.valueOf(paramInt));
    if (!this.bH.isEmpty())
    {
      String[] arrayOfString = new String[this.bH.size()];
      int i = this.bH.size();
      for (int j = 0; j < i; j++)
      {
        c localc = (c)this.bH.get(i - j - 1);
        arrayOfString[j] = localc.aP().aS();
      }
      localb.a("/Filter", arrayOfString);
    }
    return localb;
  }
  
  public abstract byte[] X();
}
