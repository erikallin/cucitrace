package com.orsonpdf;

import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;













































public final class v
  extends r
{
  private k cx;
  private List<u> cy;
  private List<l> cz;
  private Map<e, l> cA;
  private int cB = 1;
  



  private f cC;
  



  v(int paramInt1, int paramInt2, k paramk)
  {
    super(paramInt1, paramInt2);
    com.orsonpdf.util.a.a(paramk, "parent");
    this.cx = paramk;
    this.cy = new ArrayList();
    this.cz = new ArrayList();
    this.cA = new HashMap();
    this.cC = new a();
  }
  




  public k bu()
  {
    return this.cx;
  }
  




  public List<u> bv()
  {
    return this.cy;
  }
  




  public List<l> bw()
  {
    return this.cz;
  }
  







  public l J(String paramString)
  {
    for (l locall : this.cz) {
      if (locall.aN().equals(paramString)) {
        return locall;
      }
    }
    return null;
  }
  



  void a(u paramu)
  {
    this.cy.add(paramu);
  }
  







  public String f(Font paramFont)
  {
    e locale = e.b(paramFont);
    l locall = (l)this.cA.get(locale);
    if (locall == null) {
      int i = this.cx.aL();
      String str1 = "/F" + this.cB + "-" + 
        paramFont.getFamily().replace(' ', '_');
      String str2 = this.cC.a(paramFont);
      this.cB += 1;
      locall = new l(i, 0, str1, "/" + str2, 
        "/MacRomanEncoding");
      this.cz.add(locall);
      this.cA.put(locale, locall);
    }
    return locall.aN();
  }
  
  private b aO() {
    b localb = new b("/Pages");
    u[] arrayOfu = new u[this.cy.size()];
    for (int i = 0; i < this.cy.size(); i++) {
      arrayOfu[i] = ((u)this.cy.get(i));
    }
    localb.a("/Kids", arrayOfu);
    localb.a("/Count", Integer.valueOf(this.cy.size()));
    return localb;
  }
  
  public byte[] au()
  {
    return aO().as();
  }
}
