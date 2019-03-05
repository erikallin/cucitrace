package com.orsonpdf;


public class PDFFont
  extends PDFObject
{
  public static final String au = "Helvetica";
  

  public static final String av = "Helvetica-Bold";
  

  public static final String aw = "Helvetica-Oblique";
  

  public static final String ax = "Helvetica-BoldOblique";
  

  public static final String ay = "Times-Roman";
  

  public static final String az = "Times-Bold";
  

  public static final String aA = "Times-Italic";


  public static final String aB = "Times-BoldItalic";
  

  public static final String aC = "Courier";
  

  public static final String aD = "Courier-Bold";
  

  public static final String aE = "Courier-Italic";
  

  public static final String aF = "Courier-BoldItalic";
  

  private String O;
  

  private String aG;
  

  private String aH;
  

  PDFFont(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    super(paramInt1, paramInt2);
    this.O = paramString1;
    this.aG = paramString2;
    this.aH = paramString3;
  }
  


  public String ad()
  {
    return this.O;
  }
  


  public byte[] K()
  {
    return ae().I();
  }
  
  private Dictionary ae() {
    Dictionary localb = new Dictionary("/Font");
    localb.a("/Subtype", "/Type1");
    localb.a("/Name", this.O);
    localb.a("/BaseFont", this.aG);
    localb.a("/Encoding", this.aH);
    return localb;
  }
}
