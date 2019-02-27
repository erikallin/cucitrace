package com.c;

import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public final class v
  extends r
{
  private k bx;
  
  
  private List<u> by;
  
  
  private List<l> bz;
  
  
  private Map<e, l> bA;
  
  private int bB = 1;
  
  private f bC;
  


  v(int paramInt1, int paramInt2, k paramk)
  {
    super(paramInt1, paramInt2);
    com.c.cc.a.aab(paramk, "parent");
    this.bx = paramk;
    this.by = new ArrayList<u>();
    this.bz = new ArrayList<l>();
    this.bA = new HashMap<e, l>();
    this.bC = new a();
  }
  


  public k aK()
  {
    return this.bx;
  }
  


  public List<u> aL()
  {
    return this.by;
  }
  


  public List<l> aM()
  {
    return this.bz;
  }
  





  public l A(String paramString)
  {
    for (l locall : this.bz) {
      if (locall.ad().equals(paramString)) {
        return locall;
      }
    }
    return null;
  }
  


  void a(u paramu)
  {
    this.by.add(paramu);
  }
  



  public String f(Font paramFont)
  {
    e locale = e.b(paramFont);
    l locall = (l)this.bA.get(locale);
    if (locall == null) {
      int i = this.bx.ab();
      String str1 = "/F" + this.bB + "-" + 
        paramFont.getFamily().replace(' ', '_');
      String str2 = this.bC.a(paramFont);
      this.bB += 1;
      locall = new l(i, 0, str1, "/" + str2, 
        "/MacRomanEncoding");
      this.bz.add(locall);
      this.bA.put(locale, locall);
    }
    return locall.ad();
  }
  
  private b ae() {
    b localb = new b("/Pages");
    u[] arrayOfu = new u[this.by.size()];
    for (int i = 0; i < this.by.size(); i++) {
      arrayOfu[i] = ((u)this.by.get(i));
    }
    localb.a("/Kids", arrayOfu);
    localb.a("/Count", Integer.valueOf(this.by.size()));
    return localb;
  }
  
  public byte[] K()
  {
    return ae().I();
  }
}
