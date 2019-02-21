package a.c;

import a.c.c.a;
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































































public class j
  extends y
{
  private u bb;
  private ByteArrayOutputStream bc;
  private Font bd;
  private int be;
  private AffineTransform bf;
  private DecimalFormat bg;
  private DecimalFormat bh;
  
  j(int paramInt, u paramu)
  {
    super(paramInt);
    this.bb = paramu;
    this.bc = new ByteArrayOutputStream();
    this.bd = new Font("Dialog", 0, 12);
    this.be = 255;
    
    DecimalFormatSymbols localDecimalFormatSymbols = new DecimalFormatSymbols();
    localDecimalFormatSymbols.setDecimalSeparator('.');
    this.bg = new DecimalFormat("0.##", localDecimalFormatSymbols);
    this.bh = new DecimalFormat("0.######", localDecimalFormatSymbols);
  }
  
  private void F(String paramString) {
    try {
      this.bc.write(t.I(paramString));
    } catch (IOException localIOException) {
      throw new RuntimeException(localIOException);
    }
  }
  


  void aF()
  {
    F("q\n");
  }
  


  void aG()
  {
    F("Q\n");
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
    F(localStringBuilder.toString());
  }
  




  void b(AffineTransform paramAffineTransform)
  {
    AffineTransform localAffineTransform1 = new AffineTransform(paramAffineTransform);
    try {
      AffineTransform localAffineTransform2 = localAffineTransform1.createInverse();
      AffineTransform localAffineTransform3;
      if (this.bf != null) {
        localAffineTransform3 = new AffineTransform(this.bf);
        localAffineTransform3.concatenate(localAffineTransform1);
      } else {
        localAffineTransform3 = localAffineTransform1;
      }
      this.bf = localAffineTransform2;
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
    F(localStringBuilder.toString());
  }
  




  void a(Shape paramShape)
  {
    a.a(paramShape, "clip");
    StringBuilder localStringBuilder = new StringBuilder();
    Path2D.Double localDouble = new Path2D.Double(paramShape);
    localStringBuilder.append(c(localDouble));
    localStringBuilder.append("W n\n");
    F(localStringBuilder.toString());
  }
  





  void a(Stroke paramStroke)
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
    F(localStringBuilder.toString());
  }
  




  void a(Color paramColor)
  {
    float f1 = paramColor.getRed() / 255.0F;
    float f2 = paramColor.getGreen() / 255.0F;
    float f3 = paramColor.getBlue() / 255.0F;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(f1).append(" ").append(f2).append(" ").append(f3)
      .append(" RG\n");
    F(localStringBuilder.toString());
    v(paramColor.getAlpha());
  }
  




  void b(Color paramColor)
  {
    float f1 = paramColor.getRed() / 255.0F;
    float f2 = paramColor.getGreen() / 255.0F;
    float f3 = paramColor.getBlue() / 255.0F;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(f1).append(" ").append(f2).append(" ").append(f3)
      .append(" rg\n");
    F(localStringBuilder.toString());
    v(paramColor.getAlpha());
  }
  





  void a(GradientPaint paramGradientPaint)
  {
    String str = this.bb.c(paramGradientPaint);
    StringBuilder localStringBuilder = new StringBuilder("/Pattern CS\n");
    localStringBuilder.append(str).append(" SCN\n");
    F(localStringBuilder.toString());
  }
  





  void a(RadialGradientPaint paramRadialGradientPaint)
  {
    String str = this.bb.c(paramRadialGradientPaint);
    StringBuilder localStringBuilder = new StringBuilder("/Pattern CS\n");
    localStringBuilder.append(str).append(" SCN\n");
    F(localStringBuilder.toString());
  }
  





  void b(GradientPaint paramGradientPaint)
  {
    String str = this.bb.c(paramGradientPaint);
    StringBuilder localStringBuilder = new StringBuilder("/Pattern cs\n");
    localStringBuilder.append(str).append(" scn\n");
    F(localStringBuilder.toString());
  }
  





  void b(RadialGradientPaint paramRadialGradientPaint)
  {
    String str = this.bb.c(paramRadialGradientPaint);
    StringBuilder localStringBuilder = new StringBuilder("/Pattern cs\n");
    localStringBuilder.append(str).append(" scn\n");
    F(localStringBuilder.toString());
  }
  
  private float bi = 1.0F;
  




  void a(AlphaComposite paramAlphaComposite)
  {
    if (paramAlphaComposite == null) {
      this.bi = 1.0F;
    } else {
      this.bi = paramAlphaComposite.getAlpha();
      int i = (int)(paramAlphaComposite.getAlpha() * 255.0F);
      if (this.be != i) {
        String str = this.bb.y(i);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(str).append(" gs\n");
        F(localStringBuilder.toString());
        this.be = i;
      }
    }
  }
  





  void v(int paramInt)
  {
    int i = (int)(paramInt * this.bi);
    if (this.be != i) {
      String str = this.bb.y(i);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str).append(" gs\n");
      F(localStringBuilder.toString());
      this.be = i;
    }
  }
  
  private String b(double paramDouble) {
    if (this.bg != null) {
      return this.bg.format(paramDouble);
    }
    return String.valueOf(paramDouble);
  }
  
  private String c(double paramDouble)
  {
    if (this.bh != null) {
      return this.bh.format(paramDouble);
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
    F(localStringBuilder.toString());
  }
  




  void a(Path2D paramPath2D)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c(paramPath2D)).append("S\n");
    F(localStringBuilder.toString());
  }
  




  void b(Path2D paramPath2D)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c(paramPath2D)).append("f\n");
    F(localStringBuilder.toString());
  }
  






  void c(Font paramFont)
  {
    this.bd = paramFont;
  }
  








  void a(String paramString, float paramFloat1, float paramFloat2)
  {
    String str = this.bb.f(this.bd);
    F("BT ");
    AffineTransform localAffineTransform = new AffineTransform(1.0D, 0.0D, 0.0D, -1.0D, 0.0D, 
      paramFloat2 * 2.0F);
    c(localAffineTransform);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str).append(" ").append(this.bd.getSize())
      .append(" Tf ");
    localStringBuilder.append(b(paramFloat1)).append(" ").append(b(paramFloat2)).append(" Td (")
      .append(paramString).append(") Tj ET\n");
    F(localStringBuilder.toString());
  }
  








  void a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    String str = this.bb.a(paramImage, true);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("q\n");
    localStringBuilder.append(b(paramInt3)).append(" 0 0 ").append(b(paramInt4)).append(" ");
    localStringBuilder.append(b(paramInt1)).append(" ").append(b(paramInt2)).append(" cm\n");
    localStringBuilder.append(str).append(" Do\n");
    localStringBuilder.append("Q\n");
    F(localStringBuilder.toString());
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
  
  public byte[] aH()
  {
    return this.bc.toByteArray();
  }
}
