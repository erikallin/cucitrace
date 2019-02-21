package a.c;

import a.c.c.a;
import a.c.c.d;
import java.awt.Font;
















































public class e
{
  private String aO;
  private boolean aP;
  private boolean aQ;
  
  public static e b(Font paramFont)
  {
    a.a(paramFont, "f");
    String str = paramFont.getFamily().replace(' ', '_');
    boolean bool1 = paramFont.isBold();
    boolean bool2 = paramFont.isItalic();
    return new e(str, bool1, bool2);
  }
  








  public e(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.aO = paramString;
    this.aP = paramBoolean1;
    this.aQ = paramBoolean2;
  }
  







  public boolean a(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (getClass() != paramObject.getClass()) {
      return false;
    }
    e locale = (e)paramObject;
    if (!d.a(this.aO, locale.aO)) {
      return false;
    }
    if (this.aP != locale.aP) {
      return false;
    }
    if (this.aQ != locale.aQ) {
      return false;
    }
    return true;
  }
  





  public int ay()
  {
    int i = 3;
    i = 97 * i + d.c(this.aO);
    i = 97 * i + (this.aP ? 1 : 0);
    i = 97 * i + (this.aQ ? 1 : 0);
    return i;
  }
  






  public String az()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FontKey[name=").append(this.aO);
    localStringBuilder.append(",isBold=").append(this.aP);
    localStringBuilder.append(",isItalic=").append(this.aQ);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}
