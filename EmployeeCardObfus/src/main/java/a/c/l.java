package a.c;






public class l
  extends r
{
  public static final String bu = "Helvetica";
  




  public static final String bv = "Helvetica-Bold";
  




  public static final String bw = "Helvetica-Oblique";
  




  public static final String bx = "Helvetica-BoldOblique";
  




  public static final String by = "Times-Roman";
  




  public static final String bz = "Times-Bold";
  



  public static final String bA = "Times-Italic";
  



  public static final String bB = "Times-BoldItalic";
  



  public static final String bC = "Courier";
  



  public static final String bD = "Courier-Bold";
  



  public static final String bE = "Courier-Italic";
  



  public static final String bF = "Courier-BoldItalic";
  



  private String aO;
  



  private String bG;
  



  private String bH;
  




  l(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    super(paramInt1, paramInt2);
    this.aO = paramString1;
    this.bG = paramString2;
    this.bH = paramString3;
  }
  





  public String aN()
  {
    return this.aO;
  }
  






  public byte[] au()
  {
    return aO().as();
  }
  
  private b aO() {
    b localb = new b("/Font");
    localb.a("/Subtype", "/Type1");
    localb.a("/Name", this.aO);
    localb.a("/BaseFont", this.bG);
    localb.a("/Encoding", this.bH);
    return localb;
  }
}
