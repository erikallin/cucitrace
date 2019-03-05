package com.orsonpdf;

import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public final class Pages
  extends PDFObject
{
  private PDFDocument bx;
  
  
  private List<Page> by;
  
  
  private List<PDFFont> bz;
  
  
  private Map<FontKey, PDFFont> bA;
  
  private int bB = 1;
  
  private FontMapper bC;
  


  Pages(int paramInt1, int paramInt2, PDFDocument paramk)
  {
    super(paramInt1, paramInt2);
    com.orsonpdf.util.Args.aab(paramk, "parent");
    this.bx = paramk;
    this.by = new ArrayList<Page>();
    this.bz = new ArrayList<PDFFont>();
    this.bA = new HashMap<FontKey, PDFFont>();
    this.bC = new DefaultFontMapper();
  }
  


  public PDFDocument aK()
  {
    return this.bx;
  }
  


  public List<Page> aL()
  {
    return this.by;
  }
  


  public List<PDFFont> aM()
  {
    return this.bz;
  }
  





  public PDFFont A(String paramString)
  {
    for (PDFFont locall : this.bz) {
      if (locall.ad().equals(paramString)) {
        return locall;
      }
    }
    return null;
  }
  


  void a(Page paramu)
  {
    this.by.add(paramu);
  }
  



  public String f(Font paramFont)
  {
    FontKey locale = FontKey.b(paramFont);
    PDFFont locall = (PDFFont)this.bA.get(locale);
    if (locall == null) {
      int i = this.bx.ab();
      String str1 = "/F" + this.bB + "-" + 
        paramFont.getFamily().replace(' ', '_');
      String str2 = this.bC.a(paramFont);
      this.bB += 1;
      locall = new PDFFont(i, 0, str1, "/" + str2, 
        "/MacRomanEncoding");
      this.bz.add(locall);
      this.bA.put(locale, locall);
    }
    return locall.ad();
  }
  
  private Dictionary ae() {
    Dictionary localb = new Dictionary("/Pages");
    Page[] arrayOfu = new Page[this.by.size()];
    for (int i = 0; i < this.by.size(); i++) {
      arrayOfu[i] = ((Page)this.by.get(i));
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
