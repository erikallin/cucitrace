package com.orsonpdf;

import java.awt.geom.Rectangle2D;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.orsonpdf.util.Args;



public class PDFDocument
{
  private static final Logger aj = Logger.getLogger(
    PDFDocument.class.getName());
  

  @SuppressWarnings("unused")
private static final String ak = "OrsonPDF 1.7";
  

  private DictionaryObject al;
  

  private DictionaryObject am;
  

  private DictionaryObject an;
  

  private String ao;
  

  private String ap;
  

  private Pages aq;
  

  private List<PDFObject> ar;
  

  private int as = 1;
  



  private boolean at;
  


  public PDFDocument()
  {
    this.al = new DictionaryObject(this.as++, "/Catalog");
    this.am = new DictionaryObject(this.as++, "/Outlines");
    this.an = new DictionaryObject(this.as++, "/Info");
    StringBuilder localStringBuilder = new StringBuilder("(").append("OrsonPDF 1.7");
    localStringBuilder.append(")");
    this.an.a("Producer", localStringBuilder.toString());
    Date localDate = new Date();
    String str = "(" + PDFUtils.a(localDate) + ")";
    this.an.a("CreationDate", str);
    this.an.a("ModDate", str);
    this.am.a("Count", Integer.valueOf(0));
    this.al.a("Outlines", this.am);
    this.aq = new Pages(this.as++, 0, this);
    this.al.a("Pages", this.aq);
    this.ar = new ArrayList<PDFObject>();
  }
  




  public String Y()
  {
    return this.ao;
  }
  




  public void x(String paramString)
  {
    this.ao = paramString;
    if (paramString != null) {
      this.an.a("Title", "(" + paramString + ")");
    } else {
      this.an.v("Title");
    }
  }
  




  public String Z()
  {
    return this.ap;
  }
  




  public void y(String paramString)
  {
    this.ap = paramString;
    if (paramString != null) {
      this.an.a("Author", "(" + this.ap + ")");
    } else {
      this.an.v("Author");
    }
  }
  







  public boolean aa()
  {
    return this.at;
  }
  







  public void d(boolean paramBoolean)
  {
    this.at = paramBoolean;
  }
  







  public Page e(Rectangle2D paramRectangle2D)
  {
    Page localu = new Page(this.as++, 0, this.aq, paramRectangle2D, 
      !this.at);
    this.aq.a(localu);
    return localu;
  }
  




  public void f(PDFObject paramr)
  {
    Args.aab(paramr, "object");
    this.ar.add(paramr);
  }
  






  public int ab()
  {
    int i = this.as;
    this.as += 1;
    return i;
  }
  




  public byte[] ac()
  {
    int[] arrayOfInt = new int[this.as];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try {
      localByteArrayOutputStream.write(z("%PDF-1.4\n"));
      localByteArrayOutputStream.write(new byte[] { 37, Byte.MIN_VALUE, -127, -126, -125, 10 });
      
      arrayOfInt[(this.al.S() - 1)] = localByteArrayOutputStream.size();
      localByteArrayOutputStream.write(this.al.I());
      arrayOfInt[(this.am.S() - 1)] = localByteArrayOutputStream.size();
      localByteArrayOutputStream.write(this.am.I());
      arrayOfInt[(this.an.S() - 1)] = localByteArrayOutputStream.size();
      localByteArrayOutputStream.write(this.an.I());
      arrayOfInt[(this.aq.S() - 1)] = localByteArrayOutputStream.size();
      localByteArrayOutputStream.write(this.aq.I());
      
      for (Page ua : this.aq.aL()) {
        arrayOfInt[ua.S() - 1] = localByteArrayOutputStream.size();
        localByteArrayOutputStream.write(ua.I());
        PDFObject localr = (ua.aH());
        arrayOfInt[(localr.S() - 1)] = localByteArrayOutputStream.size();
        localByteArrayOutputStream.write(localr.I());
      }
      for (PDFFont ub: this.aq.aM()) {
        arrayOfInt[(ub.S() - 1)] = localByteArrayOutputStream.size();
        localByteArrayOutputStream.write(ub.I());
      }
      
      for (PDFObject uc: this.ar) {
        arrayOfInt[(uc.S() - 1)] = localByteArrayOutputStream.size();
        localByteArrayOutputStream.write(uc.I());
      }
      arrayOfInt[(arrayOfInt.length - 1)] = localByteArrayOutputStream.size();
      
      localByteArrayOutputStream.write(z("xref\n"));
      localByteArrayOutputStream.write(z("0 " + String.valueOf(this.as) + 
        "\n"));
      localByteArrayOutputStream.write(z("0000000000 65535 f \n"));
      
      for (int i = 0; i < this.as - 1; i++) {
        String localObject2 = String.valueOf(arrayOfInt[i]);
        int j = localObject2.length();
        String str = "0000000000".substring(j) + localObject2;
        localByteArrayOutputStream.write(z(str + " 00000 n \n"));
      }
      

      localByteArrayOutputStream.write(z("trailer\n"));
      Dictionary localb = new Dictionary();
      localb.a("/Size", Integer.valueOf(this.as));
      localb.a("/Root", this.al);
      localb.a("/Info", this.an);
      localByteArrayOutputStream.write(localb.I());
      localByteArrayOutputStream.write(z("startxref\n"));
      localByteArrayOutputStream.write(z(String.valueOf(arrayOfInt[(this.as - 1)]) + 
        "\n"));
      localByteArrayOutputStream.write(z("%%EOF"));
    } catch (IOException localIOException) {
      throw new RuntimeException(localIOException);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  /* Error */
  public void a(java.io.File paramFile)
  {
      FileOutputStream fos = null;
      try {
          fos = new FileOutputStream(paramFile);
          fos.write(ac());
      } catch (FileNotFoundException ex) {
    	  aj.log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
    	  aj.log(Level.SEVERE, null, ex);
      } finally {
          try {
              if (fos != null) {
                  fos.close();
              }
          } catch (IOException ex) {
        	  aj.log(Level.SEVERE, null, ex);
          }
      }
  }
  
  private byte[] z(String paramString)
  {
    byte[] arrayOfByte = null;
    try {
      arrayOfByte = paramString.getBytes("US-ASCII");
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      throw new RuntimeException(localUnsupportedEncodingException);
    }
    return arrayOfByte;
  }
}
