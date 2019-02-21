package com.orsonpdf;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Image;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;







































































public class u
  extends r
{
  private v cl;
  private Rectangle2D cm;
  private j cn;
  private m co;
  private List<String> cp;
  private Map<com.orsonpdf.util.b, String> cq;
  private Map<com.orsonpdf.util.e, String> cr;
  private b cs;
  private b ct;
  private AffineTransform cu;
  private b cv = new b();
  







  u(int paramInt1, int paramInt2, v paramv, Rectangle2D paramRectangle2D)
  {
    this(paramInt1, paramInt2, paramv, paramRectangle2D, true);
  }
  













  u(int paramInt1, int paramInt2, v paramv, Rectangle2D paramRectangle2D, boolean paramBoolean)
  {
    super(paramInt1, paramInt2);
    com.orsonpdf.util.a.a(paramRectangle2D, "bounds");
    this.cl = paramv;
    this.cm = ((Rectangle2D)paramRectangle2D.clone());
    this.cp = new ArrayList();
    int i = this.cl.bu().aL();
    this.cn = new j(i, this);
    if (paramBoolean) {
      this.cn.a(new com.orsonpdf.filter.e());
    }
    this.cq = new HashMap();
    this.cr = new HashMap();
    
    this.cs = new b();
    this.ct = new b();
    
    this.cu = AffineTransform.getTranslateInstance(0.0D, 
      paramRectangle2D.getHeight());
    this.cu.concatenate(AffineTransform.getScaleInstance(1.0D, 
      -1.0D));
  }
  





  public Rectangle2D bq()
  {
    return (Rectangle2D)this.cm.clone();
  }
  




  public r br()
  {
    return this.cn;
  }
  




  public m bs()
  {
    if (this.co == null) {
      this.co = new m(this.cn, 
        (int)this.cm.getWidth(), 
        (int)this.cm.getHeight());
    }
    return this.co;
  }
  







  String f(Font paramFont)
  {
    String str = this.cl.f(paramFont);
    if (!this.cp.contains(str)) {
      this.cp.add(str);
    }
    return str;
  }
  
  private b bt() {
    b localb = new b();
    for (String str : this.cp) {
      l locall = this.cl.J(str);
      localb.a(str, locall.bo());
    }
    return localb;
  }
  








  String c(GradientPaint paramGradientPaint)
  {
    com.orsonpdf.util.b localb = new com.orsonpdf.util.b(paramGradientPaint);
    String str = (String)this.cq.get(localb);
    if (str == null) {
      k localk = this.cl.bu();
      d locald = new d(
        localk.aL(), 
        paramGradientPaint.getColor1().getRGBColorComponents(null), 
        paramGradientPaint.getColor2().getRGBColorComponents(null));
      localk.a(locald);
      double[] arrayOfDouble = new double[4];
      arrayOfDouble[0] = paramGradientPaint.getPoint1().getX();
      arrayOfDouble[1] = paramGradientPaint.getPoint1().getY();
      arrayOfDouble[2] = paramGradientPaint.getPoint2().getX();
      arrayOfDouble[3] = paramGradientPaint.getPoint2().getY();
      com.orsonpdf.shading.a locala = new com.orsonpdf.shading.a(localk.aL(), arrayOfDouble, locald);
      localk.a(locala);
      w.a locala1 = new w.a(localk.aL(), locala, 
        this.cu);
      localk.a(locala1);
      str = "/P" + (this.cs.ar() + 1);
      this.cs.a(str, locala1);
      this.cq.put(localb, str);
    }
    return str;
  }
  








  String c(RadialGradientPaint paramRadialGradientPaint)
  {
    com.orsonpdf.util.e locale = new com.orsonpdf.util.e(paramRadialGradientPaint);
    String str = (String)this.cr.get(locale);
    if (str == null) {
      k localk = this.cl.bu();
      g localg = a(paramRadialGradientPaint);
      localk.a(localg);
      double[] arrayOfDouble = new double[6];
      arrayOfDouble[0] = paramRadialGradientPaint.getFocusPoint().getX();
      arrayOfDouble[1] = paramRadialGradientPaint.getFocusPoint().getY();
      arrayOfDouble[2] = 0.0D;
      arrayOfDouble[3] = paramRadialGradientPaint.getCenterPoint().getX();
      arrayOfDouble[4] = paramRadialGradientPaint.getCenterPoint().getY();
      arrayOfDouble[5] = paramRadialGradientPaint.getRadius();
      com.orsonpdf.shading.b localb = new com.orsonpdf.shading.b(localk.aL(), arrayOfDouble, localg);
      localk.a(localb);
      w.a locala = new w.a(localk.aL(), localb, 
        this.cu);
      localk.a(locala);
      str = "/P" + (this.cs.ar() + 1);
      this.cs.a(str, locala);
      this.cr.put(locale, str);
    }
    return str;
  }
  
  private g a(MultipleGradientPaint paramMultipleGradientPaint)
  {
    k localk = this.cl.bu();
    
    if (paramMultipleGradientPaint.getColors().length == 2) {
      d locald = new d(
        localk.aL(), 
        paramMultipleGradientPaint.getColors()[0].getRGBColorComponents(null), 
        paramMultipleGradientPaint.getColors()[1].getRGBColorComponents(null));
      return locald;
    }
    int i = paramMultipleGradientPaint.getColors().length - 1;
    g[] arrayOfg = new g[i];
    float[] arrayOfFloat1 = new float[i - 1];
    float[] arrayOfFloat2 = new float[i * 2];
    for (int j = 0; j < i; j++)
    {
      arrayOfg[j] = new d(
        localk.aL(), 
        paramMultipleGradientPaint.getColors()[j].getRGBColorComponents(null), 
        paramMultipleGradientPaint.getColors()[(j + 1)].getRGBColorComponents(null));
      localk.a(arrayOfg[j]);
      if (j < i - 1) {
        arrayOfFloat1[j] = paramMultipleGradientPaint.getFractions()[(j + 1)];
      }
      arrayOfFloat2[(j * 2)] = 0.0F;
      arrayOfFloat2[(j * 2 + 1)] = 1.0F;
    }
    return new x(localk.aL(), arrayOfg, 
      arrayOfFloat1, arrayOfFloat2);
  }
  


  private Map<Integer, String> cw = new HashMap();
  








  String y(int paramInt)
  {
    Integer localInteger = Integer.valueOf(paramInt);
    float f = paramInt / 255.0F;
    String str = (String)this.cw.get(localInteger);
    if (str == null) {
      k localk = this.cl.bu();
      i locali = new i(
        localk.aL());
      locali.b(f);
      locali.a(f);
      localk.a(locali);
      str = "/GS" + (this.ct.ar() + 1);
      this.ct.a(str, locali);
      this.cw.put(localInteger, str);
    }
    return str;
  }
  







  String a(Image paramImage)
  {
    com.orsonpdf.util.a.a(paramImage, "img");
    k localk = this.cl.bu();
    s locals = new s(
      localk.aL(), paramImage);
    locals.a(new com.orsonpdf.filter.e());
    localk.a(locals);
    String str = "/Image" + this.cv.ar();
    this.cv.a(str, locals);
    return locals.bo();
  }
  










  String a(Image paramImage, boolean paramBoolean)
  {
    com.orsonpdf.util.a.a(paramImage, "img");
    k localk = this.cl.bu();
    String str1 = null;
    if (paramBoolean) {
      str1 = a(paramImage);
    }
    q localq = new q(localk.aL(), paramImage, 
      str1);
    localq.a(new com.orsonpdf.filter.e());
    localk.a(localq);
    String str2 = "/Image" + this.cv.ar();
    this.cv.a(str2, localq);
    return str2;
  }
  
  public byte[] au()
  {
    return aO().as();
  }
  
  private b aO() {
    b localb1 = new b("/Page");
    localb1.a("/Parent", this.cl);
    localb1.a("/MediaBox", this.cm);
    localb1.a("/Contents", this.cn);
    b localb2 = new b();
    localb2.a("/ProcSet", "[/PDF /Text /ImageB /ImageC /ImageI]");
    if (!this.cv.aq()) {
      localb2.a("/XObject", this.cv);
    }
    if (!this.cp.isEmpty()) {
      localb2.a("/Font", bt());
    }
    if (!this.cs.aq()) {
      localb2.a("/Pattern", this.cs);
    }
    if (!this.ct.aq()) {
      localb2.a("/ExtGState", this.ct);
    }
    localb1.a("/Resources", localb2);
    return localb1;
  }
}
