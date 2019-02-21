package com.orsonpdf;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;













































public class a
  implements f
{
  private final Map<e, String> aI;
  
  public a()
  {
    this.aI = new HashMap();
    this.aI.put(new e("Dialog", false, false), "Helvetica");
    this.aI.put(new e("Dialog", true, false), "Helvetica-Bold");
    this.aI.put(new e("Dialog", false, true), "Helvetica-Oblique");
    this.aI.put(new e("Dialog", true, true), "Helvetica-BoldOblique");
    this.aI.put(new e("Arial", false, false), "Helvetica");
    this.aI.put(new e("Arial", true, false), "Helvetica-Bold");
    this.aI.put(new e("Arial", false, true), "Helvetica-Oblique");
    this.aI.put(new e("Arial", true, true), "Helvetica-BoldOblique");
    this.aI.put(new e("Courier", false, false), "Courier");
    this.aI.put(new e("Courier", true, false), "Courier-Bold");
    this.aI.put(new e("Courier", false, true), "Courier-Italic");
    this.aI.put(new e("Courier", true, true), "Courier-BoldItalic");
    this.aI.put(new e("Courier_New", false, false), "Courier");
    this.aI.put(new e("Courier_New", true, false), "Courier-Bold");
    this.aI.put(new e("Courier_New", false, true), "Courier-Italic");
    this.aI.put(new e("Courier_New", true, true), "Courier-BoldItalic");
    this.aI.put(new e("DialogInput", false, false), "Helvetica");
    this.aI.put(new e("DialogInput", true, false), "Helvetica-Bold");
    this.aI.put(new e("DialogInput", false, true), "Helvetica-Oblique");
    this.aI.put(new e("DialogInput", true, true), "Helvetica-BoldOblique");
    this.aI.put(new e("MgOpen_Cosmetica", false, false), "Times-Roman");
    this.aI.put(new e("MgOpen_Cosmetica", true, false), "Times-Bold");
    this.aI.put(new e("MgOpen_Cosmetica", false, true), "Times-Italic");
    this.aI.put(new e("MgOpen_Cosmetica", true, true), "Times-BoldItalic");
    this.aI.put(new e("Monospaced", false, false), "Courier");
    this.aI.put(new e("Monospaced", true, false), "Courier-Bold");
    this.aI.put(new e("Monospaced", false, true), "Courier-Italic");
    this.aI.put(new e("Monospaced", true, true), "Courier-BoldItalic");
    this.aI.put(new e("Palatino", false, false), "Times-Roman");
    this.aI.put(new e("Palatino", true, false), "Times-Bold");
    this.aI.put(new e("Palatino", false, true), "Times-Italic");
    this.aI.put(new e("Palatino", true, true), "Times-BoldItalic");
    this.aI.put(new e("SansSerif", false, false), "Helvetica");
    this.aI.put(new e("SansSerif", true, false), "Helvetica-Bold");
    this.aI.put(new e("SansSerif", false, true), "Helvetica-Oblique");
    this.aI.put(new e("SansSerif", true, true), "Helvetica-BoldOblique");
    this.aI.put(new e("Serif", false, false), "Times-Roman");
    this.aI.put(new e("Serif", true, false), "Times-Bold");
    this.aI.put(new e("Serif", false, true), "Times-Italic");
    this.aI.put(new e("Serif", true, true), "Times-BoldItalic");
    this.aI.put(new e("Tahoma", false, false), "Times-Roman");
    this.aI.put(new e("Tahoma", true, false), "Times-Bold");
    this.aI.put(new e("Tahoma", false, true), "Times-Italic");
    this.aI.put(new e("Tahoma", true, true), "Times-BoldItalic");
    this.aI.put(new e("Times_New_Roman", false, false), "Times-Roman");
    this.aI.put(new e("Times_New_Roman", true, false), "Times-Bold");
    this.aI.put(new e("Times_New_Roman", false, true), "Times-Italic");
    this.aI.put(new e("Times_New_Roman", true, true), "Times-BoldItalic");
  }
  
  public String a(Font paramFont)
  {
    String str = (String)this.aI.get(e.b(paramFont));
    if (str == null) {
      str = "Courier";
    }
    return str;
  }
}
