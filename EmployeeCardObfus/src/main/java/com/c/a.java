package com.c;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

public class a
  implements f
{
  private final Map<e, String> I;
  
  public a()
  {
    this.I = new HashMap();
    this.I.put(new e("Dialog", false, false), "Helvetica");
    this.I.put(new e("Dialog", true, false), "Helvetica-Bold");
    this.I.put(new e("Dialog", false, true), "Helvetica-Oblique");
    this.I.put(new e("Dialog", true, true), "Helvetica-BoldOblique");
    this.I.put(new e("Arial", false, false), "Helvetica");
    this.I.put(new e("Arial", true, false), "Helvetica-Bold");
    this.I.put(new e("Arial", false, true), "Helvetica-Oblique");
    this.I.put(new e("Arial", true, true), "Helvetica-BoldOblique");
    this.I.put(new e("Courier", false, false), "Courier");
    this.I.put(new e("Courier", true, false), "Courier-Bold");
    this.I.put(new e("Courier", false, true), "Courier-Italic");
    this.I.put(new e("Courier", true, true), "Courier-BoldItalic");
    this.I.put(new e("Courier_New", false, false), "Courier");
    this.I.put(new e("Courier_New", true, false), "Courier-Bold");
    this.I.put(new e("Courier_New", false, true), "Courier-Italic");
    this.I.put(new e("Courier_New", true, true), "Courier-BoldItalic");
    this.I.put(new e("DialogInput", false, false), "Helvetica");
    this.I.put(new e("DialogInput", true, false), "Helvetica-Bold");
    this.I.put(new e("DialogInput", false, true), "Helvetica-Oblique");
    this.I.put(new e("DialogInput", true, true), "Helvetica-BoldOblique");
    this.I.put(new e("MgOpen_Cosmetica", false, false), "Times-Roman");
    this.I.put(new e("MgOpen_Cosmetica", true, false), "Times-Bold");
    this.I.put(new e("MgOpen_Cosmetica", false, true), "Times-Italic");
    this.I.put(new e("MgOpen_Cosmetica", true, true), "Times-BoldItalic");
    this.I.put(new e("Monospaced", false, false), "Courier");
    this.I.put(new e("Monospaced", true, false), "Courier-Bold");
    this.I.put(new e("Monospaced", false, true), "Courier-Italic");
    this.I.put(new e("Monospaced", true, true), "Courier-BoldItalic");
    this.I.put(new e("Palatino", false, false), "Times-Roman");
    this.I.put(new e("Palatino", true, false), "Times-Bold");
    this.I.put(new e("Palatino", false, true), "Times-Italic");
    this.I.put(new e("Palatino", true, true), "Times-BoldItalic");
    this.I.put(new e("SansSerif", false, false), "Helvetica");
    this.I.put(new e("SansSerif", true, false), "Helvetica-Bold");
    this.I.put(new e("SansSerif", false, true), "Helvetica-Oblique");
    this.I.put(new e("SansSerif", true, true), "Helvetica-BoldOblique");
    this.I.put(new e("Serif", false, false), "Times-Roman");
    this.I.put(new e("Serif", true, false), "Times-Bold");
    this.I.put(new e("Serif", false, true), "Times-Italic");
    this.I.put(new e("Serif", true, true), "Times-BoldItalic");
    this.I.put(new e("Tahoma", false, false), "Times-Roman");
    this.I.put(new e("Tahoma", true, false), "Times-Bold");
    this.I.put(new e("Tahoma", false, true), "Times-Italic");
    this.I.put(new e("Tahoma", true, true), "Times-BoldItalic");
    this.I.put(new e("Times_New_Roman", false, false), "Times-Roman");
    this.I.put(new e("Times_New_Roman", true, false), "Times-Bold");
    this.I.put(new e("Times_New_Roman", false, true), "Times-Italic");
    this.I.put(new e("Times_New_Roman", true, true), "Times-BoldItalic");
  }
  
  public String a(Font paramFont)
  {
    String str = (String)this.I.get(e.b(paramFont));
    if (str == null) {
      str = "Courier";
    }
    return str;
  }
}
