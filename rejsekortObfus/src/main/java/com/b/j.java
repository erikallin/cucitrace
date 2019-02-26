package com.b;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Image;
import java.awt.RadialGradientPaint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Path2D;
import java.awt.geom.Path2D.Double;
import java.awt.geom.PathIterator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import com.b.util.a;


public class j
  extends y
{
  private u ab;
  private ByteArrayOutputStream ac;
  private Font ad;
  private int ae;
  private AffineTransform af;
  private DecimalFormat ag;
  private DecimalFormat ah;
  
  j(int paramInt, u paramu)
  {
    super(paramInt);
    this.ab = paramu;
    this.ac = new ByteArrayOutputStream();
    this.ad = new Font("Dialog", 0, 12);
    this.ae = 255;
    
    DecimalFormatSymbols localDecimalFormatSymbols = new DecimalFormatSymbols();
    localDecimalFormatSymbols.setDecimalSeparator('.');
    this.ag = new DecimalFormat("0.##", localDecimalFormatSymbols);
    this.ah = new DecimalFormat("0.######", localDecimalFormatSymbols);
  }
  
  private void w(String paramString) {
    try {
      this.ac.write(t.z(paramString));
    } catch (IOException localIOException) {
      throw new RuntimeException(localIOException);
    }
  }
  


  void V()
  {
    w("q\n");
  }
  


  void W()
  {
    w("Q\n");
  }
  

  void a(AffineTransform paramAffineTransform)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c(paramAffineTransform.getScaleX())).append(" ");
    localStringBuilder.append(c(paramAffineTransform.getShearY())).append(" ");
    localStringBuilder.append(c(paramAffineTransform.getShearX())).append(" ");
    localStringBuilder.append(c(paramAffineTransform.getScaleY())).append(" ");
    localStringBuilder.append(c(paramAffineTransform.getTranslateX())).append(" ");
    localStringBuilder.append(c(paramAffineTransform.getTranslateY())).append(" cm\n");
    w(localStringBuilder.toString());
  }
  


  void b(AffineTransform paramAffineTransform)
  {
    AffineTransform localAffineTransform1 = new AffineTransform(paramAffineTransform);
    try {
      AffineTransform localAffineTransform2 = localAffineTransform1.createInverse();
      AffineTransform localAffineTransform3;
      if (this.af != null) {
        localAffineTransform3 = new AffineTransform(this.af);
        localAffineTransform3.concatenate(localAffineTransform1);
      } else {
        localAffineTransform3 = localAffineTransform1;
      }
      this.af = localAffineTransform2;
      a(localAffineTransform3);
    }
    catch (NoninvertibleTransformException localNoninvertibleTransformException) {}
  }
  

  void c(AffineTransform paramAffineTransform)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramAffineTransform.getScaleX()).append(" ");
    localStringBuilder.append(paramAffineTransform.getShearY()).append(" ");
    localStringBuilder.append(paramAffineTransform.getShearX()).append(" ");
    localStringBuilder.append(paramAffineTransform.getScaleY()).append(" ");
    localStringBuilder.append(paramAffineTransform.getTranslateX()).append(" ");
    localStringBuilder.append(paramAffineTransform.getTranslateY()).append(" Tm\n");
    w(localStringBuilder.toString());
  }
  


  void d(Shape paramShape)
  {
    a.aab(paramShape, "clip");
    StringBuilder localStringBuilder = new StringBuilder();
    Path2D.Double localDouble = new Path2D.Double(paramShape);
    localStringBuilder.append(c(localDouble));
    localStringBuilder.append("W n\n");
    w(localStringBuilder.toString());
  }
  





  void e(Stroke paramStroke)
  {
    if (!(paramStroke instanceof BasicStroke)) {
      return;
    }
    BasicStroke localBasicStroke = (BasicStroke)paramStroke;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localBasicStroke.getLineWidth()).append(" ").append("w\n");
    localStringBuilder.append(localBasicStroke.getEndCap()).append(" J\n");
    localStringBuilder.append(localBasicStroke.getLineJoin()).append(" j\n");
    float[] arrayOfFloat = localBasicStroke.getDashArray();
    if (arrayOfFloat != null) {
      localStringBuilder.append(t.c(arrayOfFloat)).append(" 0 d\n");
    } else {
      localStringBuilder.append("[] 0 d\n");
    }
    w(localStringBuilder.toString());
  }
  




  void f(Color paramColor)
  {
    float f1 = paramColor.getRed() / 255.0F;
    float f2 = paramColor.getGreen() / 255.0F;
    float f3 = paramColor.getBlue() / 255.0F;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(f1).append(" ").append(f2).append(" ").append(f3)
      .append(" RG\n");
    w(localStringBuilder.toString());
    m(paramColor.getAlpha());
  }
  




  void g(Color paramColor)
  {
    float f1 = paramColor.getRed() / 255.0F;
    float f2 = paramColor.getGreen() / 255.0F;
    float f3 = paramColor.getBlue() / 255.0F;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(f1).append(" ").append(f2).append(" ").append(f3)
      .append(" rg\n");
    w(localStringBuilder.toString());
    m(paramColor.getAlpha());
  }
  





  void h(GradientPaint paramGradientPaint)
  {
    String str = this.ab.c(paramGradientPaint);
    StringBuilder localStringBuilder = new StringBuilder("/Pattern CS\n");
    localStringBuilder.append(str).append(" SCN\n");
    w(localStringBuilder.toString());
  }
  





  void i(RadialGradientPaint paramRadialGradientPaint)
  {
    String str = this.ab.c(paramRadialGradientPaint);
    StringBuilder localStringBuilder = new StringBuilder("/Pattern CS\n");
    localStringBuilder.append(str).append(" SCN\n");
    w(localStringBuilder.toString());
  }
  





  void i(GradientPaint paramGradientPaint)
  {
    String str = this.ab.c(paramGradientPaint);
    StringBuilder localStringBuilder = new StringBuilder("/Pattern cs\n");
    localStringBuilder.append(str).append(" scn\n");
    w(localStringBuilder.toString());
  }
  





  void j(RadialGradientPaint paramRadialGradientPaint)
  {
    String str = this.ab.c(paramRadialGradientPaint);
    StringBuilder localStringBuilder = new StringBuilder("/Pattern cs\n");
    localStringBuilder.append(str).append(" scn\n");
    w(localStringBuilder.toString());
  }
  
  private float ai = 1.0F;
  




  void k(AlphaComposite paramAlphaComposite)
  {
    if (paramAlphaComposite == null) {
      this.ai = 1.0F;
    } else {
      this.ai = paramAlphaComposite.getAlpha();
      int i = (int)(paramAlphaComposite.getAlpha() * 255.0F);
      if (this.ae != i) {
        String str = this.ab.p(i);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(str).append(" gs\n");
        w(localStringBuilder.toString());
        this.ae = i;
      }
    }
  }
  





  void m(int paramInt)
  {
    int i = (int)(paramInt * this.ai);
    if (this.ae != i) {
      String str = this.ab.p(i);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str).append(" gs\n");
      w(localStringBuilder.toString());
      this.ae = i;
    }
  }
  
  private String b(double paramDouble) {
    if (this.ag != null) {
      return this.ag.format(paramDouble);
    }
    return String.valueOf(paramDouble);
  }
  
  private String c(double paramDouble)
  {
    if (this.ah != null) {
      return this.ah.format(paramDouble);
    }
    return String.valueOf(paramDouble);
  }
  





  void a(Line2D paramLine2D)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b(paramLine2D.getX1())).append(" ").append(b(paramLine2D.getY1()))
      .append(" ").append("m\n");
    localStringBuilder.append(b(paramLine2D.getX2())).append(" ").append(b(paramLine2D.getY2()))
      .append(" ").append("l\n");
    localStringBuilder.append("S\n");
    w(localStringBuilder.toString());
  }
  




  void a(Path2D paramPath2D)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c(paramPath2D)).append("S\n");
    w(localStringBuilder.toString());
  }
  




  void b(Path2D paramPath2D)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c(paramPath2D)).append("f\n");
    w(localStringBuilder.toString());
  }
  






  void c(Font paramFont)
  {
    this.ad = paramFont;
  }
  








  void a(String paramString, float paramFloat1, float paramFloat2)
  {
    String str = this.ab.f(this.ad);
    w("BT ");
    AffineTransform localAffineTransform = new AffineTransform(1.0D, 0.0D, 0.0D, -1.0D, 0.0D, 
      paramFloat2 * 2.0F);
    c(localAffineTransform);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str).append(" ").append(this.ad.getSize())
      .append(" Tf ");
    localStringBuilder.append(b(paramFloat1)).append(" ").append(b(paramFloat2)).append(" Td (")
      .append(paramString).append(") Tj ET\n");
    w(localStringBuilder.toString());
  }
  








  void a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    String str = this.ab.a(paramImage, true);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("q\n");
    localStringBuilder.append(b(paramInt3)).append(" 0 0 ").append(b(paramInt4)).append(" ");
    localStringBuilder.append(b(paramInt1)).append(" ").append(b(paramInt2)).append(" cm\n");
    localStringBuilder.append(str).append(" Do\n");
    localStringBuilder.append("Q\n");
    w(localStringBuilder.toString());
  }
  







  private String c(Path2D paramPath2D)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    float[] arrayOfFloat = new float[6];
    float f1 = 0.0F;
    float f2 = 0.0F;
    PathIterator localPathIterator = paramPath2D.getPathIterator(null);
    while (!localPathIterator.isDone()) {
      int i = localPathIterator.currentSegment(arrayOfFloat);
      switch (i) {
      case 0: 
        localStringBuilder.append(b(arrayOfFloat[0])).append(" ");
        localStringBuilder.append(b(arrayOfFloat[1])).append(" m\n");
        f1 = arrayOfFloat[0];
        f2 = arrayOfFloat[1];
        break;
      case 1: 
        localStringBuilder.append(b(arrayOfFloat[0])).append(" ");
        localStringBuilder.append(b(arrayOfFloat[1])).append(" l\n");
        f1 = arrayOfFloat[0];
        f2 = arrayOfFloat[1];
        break;
      



      case 2: 
        float f3 = 0.25F * f1 + 0.75F * arrayOfFloat[0];
        float f4 = 0.25F * f2 + 0.75F * arrayOfFloat[1];
        float f5 = 0.5F * arrayOfFloat[0] + 0.5F * arrayOfFloat[2];
        float f6 = 0.5F * arrayOfFloat[1] + 0.5F * arrayOfFloat[3];
        localStringBuilder.append(b(f3)).append(" ");
        localStringBuilder.append(b(f4)).append(" ");
        localStringBuilder.append(b(f5)).append(" ");
        localStringBuilder.append(b(f6)).append(" ");
        localStringBuilder.append(b(arrayOfFloat[2])).append(" ");
        localStringBuilder.append(b(arrayOfFloat[3])).append(" c\n");
        f1 = arrayOfFloat[2];
        f2 = arrayOfFloat[3];
        break;
      case 3: 
        localStringBuilder.append(b(arrayOfFloat[0])).append(" ");
        localStringBuilder.append(b(arrayOfFloat[1])).append(" ");
        localStringBuilder.append(b(arrayOfFloat[2])).append(" ");
        localStringBuilder.append(b(arrayOfFloat[3])).append(" ");
        localStringBuilder.append(b(arrayOfFloat[4])).append(" ");
        localStringBuilder.append(b(arrayOfFloat[5])).append(" c\n");
        f1 = arrayOfFloat[4];
        f2 = arrayOfFloat[5];
        break;
      case 4: 
        localStringBuilder.append("h\n");
        break;
      }
      
      
      localPathIterator.next();
    }
    return localStringBuilder.toString();
  }
  
  public byte[] X()
  {
    return this.ac.toByteArray();
  }
}
