package com.orsonpdf;

import com.orsonpdf.util.a;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;



















































public class k
{
  private static final Logger aj = Logger.getLogger(
    k.class.getName());
  

  private static final String ak = "OrsonPDF 1.7";
  

  private c al;
  

  private c am;
  

  private c an;
  

  private String ao;
  

  private String ap;
  

  private v aq;
  

  private List<r> ar;
  

  private int as = 1;
  



  private boolean at;
  




  public k()
  {
    this.al = new c(this.as++, "/Catalog");
    this.am = new c(this.as++, "/Outlines");
    this.an = new c(this.as++, "/Info");
    StringBuilder localStringBuilder = new StringBuilder("(").append("OrsonPDF 1.7");
    localStringBuilder.append(")");
    this.an.a("Producer", localStringBuilder.toString());
    Date localDate = new Date();
    String str = "(" + t.a(localDate) + ")";
    this.an.a("CreationDate", str);
    this.an.a("ModDate", str);
    this.am.a("Count", Integer.valueOf(0));
    this.al.a("Outlines", this.am);
    this.aq = new v(this.as++, 0, this);
    this.al.a("Pages", this.aq);
    this.ar = new ArrayList();
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
  







  public u a(Rectangle2D paramRectangle2D)
  {
    u localu = new u(this.as++, 0, this.aq, paramRectangle2D, 
      !this.at);
    this.aq.a(localu);
    return localu;
  }
  




  public void a(r paramr)
  {
    a.a(paramr, "object");
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
      Object localObject1; for (Object localObject2 = this.aq.aL().iterator(); ((Iterator)localObject2).hasNext();) { localObject1 = (u)((Iterator)localObject2).next();
        arrayOfInt[(localObject1.S() - 1)] = localByteArrayOutputStream.size();
        localByteArrayOutputStream.write(((u)localObject1).I());
        r localr = ((u)localObject1).aH();
        arrayOfInt[(localr.S() - 1)] = localByteArrayOutputStream.size();
        localByteArrayOutputStream.write(localr.I());
      }
      for (localObject2 = this.aq.aM().iterator(); ((Iterator)localObject2).hasNext();) { localObject1 = (l)((Iterator)localObject2).next();
        arrayOfInt[(localObject1.S() - 1)] = localByteArrayOutputStream.size();
        localByteArrayOutputStream.write(((l)localObject1).I());
      }
      for (localObject2 = this.ar.iterator(); ((Iterator)localObject2).hasNext();) { localObject1 = (r)((Iterator)localObject2).next();
        arrayOfInt[(localObject1.S() - 1)] = localByteArrayOutputStream.size();
        localByteArrayOutputStream.write(((r)localObject1).I());
      }
      arrayOfInt[(arrayOfInt.length - 1)] = localByteArrayOutputStream.size();
      
      localByteArrayOutputStream.write(z("xref\n"));
      localByteArrayOutputStream.write(z("0 " + String.valueOf(this.as) + 
        "\n"));
      localByteArrayOutputStream.write(z("0000000000 65535 f \n"));
      for (int i = 0; i < this.as - 1; i++) {
        localObject2 = String.valueOf(arrayOfInt[i]);
        int j = ((String)localObject2).length();
        String str = "0000000000".substring(j) + (String)localObject2;
        localByteArrayOutputStream.write(z(str + " 00000 n \n"));
      }
      

      localByteArrayOutputStream.write(z("trailer\n"));
      b localb = new b();
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
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 40	java/io/FileOutputStream
    //   5: dup
    //   6: aload_1
    //   7: invokespecial 96	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokevirtual 74	com/orsonpdf/k:ac	()[B
    //   16: invokevirtual 98	java/io/FileOutputStream:write	([B)V
    //   19: goto +113 -> 132
    //   22: astore_3
    //   23: getstatic 55	com/orsonpdf/k:aj	Ljava/util/logging/Logger;
    //   26: getstatic 65	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   29: aconst_null
    //   30: aload_3
    //   31: invokevirtual 114	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   34: aload_2
    //   35: ifnull +122 -> 157
    //   38: aload_2
    //   39: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   42: goto +115 -> 157
    //   45: astore 5
    //   47: getstatic 55	com/orsonpdf/k:aj	Ljava/util/logging/Logger;
    //   50: getstatic 65	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   53: aconst_null
    //   54: aload 5
    //   56: invokevirtual 114	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   59: goto +98 -> 157
    //   62: astore_3
    //   63: getstatic 55	com/orsonpdf/k:aj	Ljava/util/logging/Logger;
    //   66: getstatic 65	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   69: aconst_null
    //   70: aload_3
    //   71: invokevirtual 114	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   74: aload_2
    //   75: ifnull +82 -> 157
    //   78: aload_2
    //   79: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   82: goto +75 -> 157
    //   85: astore 5
    //   87: getstatic 55	com/orsonpdf/k:aj	Ljava/util/logging/Logger;
    //   90: getstatic 65	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   93: aconst_null
    //   94: aload 5
    //   96: invokevirtual 114	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   99: goto +58 -> 157
    //   102: astore 4
    //   104: aload_2
    //   105: ifnull +24 -> 129
    //   108: aload_2
    //   109: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   112: goto +17 -> 129
    //   115: astore 5
    //   117: getstatic 55	com/orsonpdf/k:aj	Ljava/util/logging/Logger;
    //   120: getstatic 65	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   123: aconst_null
    //   124: aload 5
    //   126: invokevirtual 114	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   129: aload 4
    //   131: athrow
    //   132: aload_2
    //   133: ifnull +24 -> 157
    //   136: aload_2
    //   137: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   140: goto +17 -> 157
    //   143: astore 5
    //   145: getstatic 55	com/orsonpdf/k:aj	Ljava/util/logging/Logger;
    //   148: getstatic 65	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   151: aconst_null
    //   152: aload 5
    //   154: invokevirtual 114	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   157: return
    // Line number table:
    //   Java source line #304	-> byte code offset #0
    //   Java source line #306	-> byte code offset #2
    //   Java source line #307	-> byte code offset #11
    //   Java source line #308	-> byte code offset #19
    //   Java source line #309	-> byte code offset #23
    //   Java source line #314	-> byte code offset #34
    //   Java source line #315	-> byte code offset #38
    //   Java source line #317	-> byte code offset #42
    //   Java source line #318	-> byte code offset #47
    //   Java source line #310	-> byte code offset #62
    //   Java source line #311	-> byte code offset #63
    //   Java source line #314	-> byte code offset #74
    //   Java source line #315	-> byte code offset #78
    //   Java source line #317	-> byte code offset #82
    //   Java source line #318	-> byte code offset #87
    //   Java source line #312	-> byte code offset #102
    //   Java source line #314	-> byte code offset #104
    //   Java source line #315	-> byte code offset #108
    //   Java source line #317	-> byte code offset #112
    //   Java source line #318	-> byte code offset #117
    //   Java source line #320	-> byte code offset #129
    //   Java source line #314	-> byte code offset #132
    //   Java source line #315	-> byte code offset #136
    //   Java source line #317	-> byte code offset #140
    //   Java source line #318	-> byte code offset #145
    //   Java source line #321	-> byte code offset #157
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	k
    //   0	158	1	paramFile	java.io.File
    //   1	136	2	localFileOutputStream	java.io.FileOutputStream
    //   22	9	3	localFileNotFoundException	java.io.FileNotFoundException
    //   62	9	3	localIOException1	IOException
    //   102	28	4	localObject	Object
    //   45	10	5	localIOException2	IOException
    //   85	10	5	localIOException3	IOException
    //   115	10	5	localIOException4	IOException
    //   143	10	5	localIOException5	IOException
    // Exception table:
    //   from	to	target	type
    //   2	19	22	java/io/FileNotFoundException
    //   34	42	45	java/io/IOException
    //   2	19	62	java/io/IOException
    //   74	82	85	java/io/IOException
    //   2	34	102	finally
    //   62	74	102	finally
    //   104	112	115	java/io/IOException
    //   132	140	143	java/io/IOException
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
