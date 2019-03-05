package com.orsonpdf;

import java.awt.Font;

import com.orsonpdf.util.Args;
import com.orsonpdf.util.ObjectUtils;


public class FontKey
{
  private String O;
  private boolean P;
  private boolean Q;
  
  public static FontKey b(Font paramFont)
  {
    Args.aab(paramFont, "f");
    String str = paramFont.getFamily().replace(' ', '_');
    boolean bool1 = paramFont.isBold();
    boolean bool2 = paramFont.isItalic();
    return new FontKey(str, bool1, bool2);
  }
  


  public FontKey(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.O = paramString;
    this.P = paramBoolean1;
    this.Q = paramBoolean2;
  }
  


  public boolean a(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (getClass() != paramObject.getClass()) {
      return false;
    }
    FontKey locale = (FontKey)paramObject;
    if (!ObjectUtils.a(this.O, locale.O)) {
      return false;
    }
    if (this.P != locale.P) {
      return false;
    }
    if (this.Q != locale.Q) {
      return false;
    }
    return true;
  }
  


  public int O()
  {
    int i = 3;
    i = 97 * i + ObjectUtils.c(this.O);
    i = 97 * i + (this.P ? 1 : 0);
    i = 97 * i + (this.Q ? 1 : 0);
    return i;
  }
  



  public String P()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FontKey[name=").append(this.O);
    localStringBuilder.append(",isBold=").append(this.P);
    localStringBuilder.append(",isItalic=").append(this.Q);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}
