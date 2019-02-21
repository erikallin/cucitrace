package a.c;

import a.c.a.c;
import a.c.a.d;
import a.c.c.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;







































public abstract class y
  extends r
{
  private List<c> cH;
  
  y(int paramInt)
  {
    super(paramInt);
    this.cH = new ArrayList();
  }
  






  public void a(c paramc)
  {
    a.a(paramc, "f");
    this.cH.add(paramc);
  }
  




  public void by()
  {
    this.cH.clear();
  }
  







  public byte[] au()
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = aH();
    for (Iterator localIterator = this.cH.iterator(); localIterator.hasNext();) { localObject = (c)localIterator.next();
      arrayOfByte = ((c)localObject).a(arrayOfByte);
    }
    Object localObject = x(arrayOfByte.length);
    localByteArrayOutputStream.write(((b)localObject).as());
    localByteArrayOutputStream.write(t.I("stream\n"));
    localByteArrayOutputStream.write(arrayOfByte);
    localByteArrayOutputStream.write(t.I("endstream\n"));
    return localByteArrayOutputStream.toByteArray();
  }
  








  protected b x(int paramInt)
  {
    b localb = new b();
    localb.a("/Length", Integer.valueOf(paramInt));
    if (!this.cH.isEmpty()) {
      String[] arrayOfString = new String[this.cH.size()];
      int i = this.cH.size();
      for (int j = 0; j < i; j++) {
        c localc = (c)this.cH.get(i - j - 1);
        arrayOfString[j] = localc.bz().bC();
      }
      localb.a("/Filter", arrayOfString);
    }
    return localb;
  }
  
  public abstract byte[] aH();
}
