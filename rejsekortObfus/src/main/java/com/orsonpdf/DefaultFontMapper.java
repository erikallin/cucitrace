package com.orsonpdf;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

public class DefaultFontMapper
  implements FontMapper
{
  private final Map<FontKey, String> I;
  
  public DefaultFontMapper()
  {
    this.I = new HashMap<FontKey, String>();
    this.I.put(new FontKey("Dialog", false, false), "Helvetica");
    this.I.put(new FontKey("Dialog", true, false), "Helvetica-Bold");
    this.I.put(new FontKey("Dialog", false, true), "Helvetica-Oblique");
    this.I.put(new FontKey("Dialog", true, true), "Helvetica-BoldOblique");
    this.I.put(new FontKey("Arial", false, false), "Helvetica");
    this.I.put(new FontKey("Arial", true, false), "Helvetica-Bold");
    this.I.put(new FontKey("Arial", false, true), "Helvetica-Oblique");
    this.I.put(new FontKey("Arial", true, true), "Helvetica-BoldOblique");
    this.I.put(new FontKey("Courier", false, false), "Courier");
    this.I.put(new FontKey("Courier", true, false), "Courier-Bold");
    this.I.put(new FontKey("Courier", false, true), "Courier-Italic");
    this.I.put(new FontKey("Courier", true, true), "Courier-BoldItalic");
    this.I.put(new FontKey("Courier_New", false, false), "Courier");
    this.I.put(new FontKey("Courier_New", true, false), "Courier-Bold");
    this.I.put(new FontKey("Courier_New", false, true), "Courier-Italic");
    this.I.put(new FontKey("Courier_New", true, true), "Courier-BoldItalic");
    this.I.put(new FontKey("DialogInput", false, false), "Helvetica");
    this.I.put(new FontKey("DialogInput", true, false), "Helvetica-Bold");
    this.I.put(new FontKey("DialogInput", false, true), "Helvetica-Oblique");
    this.I.put(new FontKey("DialogInput", true, true), "Helvetica-BoldOblique");
    this.I.put(new FontKey("MgOpen_Cosmetica", false, false), "Times-Roman");
    this.I.put(new FontKey("MgOpen_Cosmetica", true, false), "Times-Bold");
    this.I.put(new FontKey("MgOpen_Cosmetica", false, true), "Times-Italic");
    this.I.put(new FontKey("MgOpen_Cosmetica", true, true), "Times-BoldItalic");
    this.I.put(new FontKey("Monospaced", false, false), "Courier");
    this.I.put(new FontKey("Monospaced", true, false), "Courier-Bold");
    this.I.put(new FontKey("Monospaced", false, true), "Courier-Italic");
    this.I.put(new FontKey("Monospaced", true, true), "Courier-BoldItalic");
    this.I.put(new FontKey("Palatino", false, false), "Times-Roman");
    this.I.put(new FontKey("Palatino", true, false), "Times-Bold");
    this.I.put(new FontKey("Palatino", false, true), "Times-Italic");
    this.I.put(new FontKey("Palatino", true, true), "Times-BoldItalic");
    this.I.put(new FontKey("SansSerif", false, false), "Helvetica");
    this.I.put(new FontKey("SansSerif", true, false), "Helvetica-Bold");
    this.I.put(new FontKey("SansSerif", false, true), "Helvetica-Oblique");
    this.I.put(new FontKey("SansSerif", true, true), "Helvetica-BoldOblique");
    this.I.put(new FontKey("Serif", false, false), "Times-Roman");
    this.I.put(new FontKey("Serif", true, false), "Times-Bold");
    this.I.put(new FontKey("Serif", false, true), "Times-Italic");
    this.I.put(new FontKey("Serif", true, true), "Times-BoldItalic");
    this.I.put(new FontKey("Tahoma", false, false), "Times-Roman");
    this.I.put(new FontKey("Tahoma", true, false), "Times-Bold");
    this.I.put(new FontKey("Tahoma", false, true), "Times-Italic");
    this.I.put(new FontKey("Tahoma", true, true), "Times-BoldItalic");
    this.I.put(new FontKey("Times_New_Roman", false, false), "Times-Roman");
    this.I.put(new FontKey("Times_New_Roman", true, false), "Times-Bold");
    this.I.put(new FontKey("Times_New_Roman", false, true), "Times-Italic");
    this.I.put(new FontKey("Times_New_Roman", true, true), "Times-BoldItalic");
  }
  
  public String a(Font paramFont)
  {
    String str = (String)this.I.get(FontKey.b(paramFont));
    if (str == null) {
      str = "Courier";
    }
    return str;
  }
}
