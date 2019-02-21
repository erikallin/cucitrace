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
  private v bl;
  private Rectangle2D bm;
  private j bn;
  private m bo;
  private List<String> bp;
  private Map<com.orsonpdf.util.b, String> bq;
  private Map<com.orsonpdf.util.e, String> br;
  private b bs;
  private b bt;
  private AffineTransform bu;
  private b bv = new b();
  







  u(int paramInt1, int paramInt2, v paramv, Rectangle2D paramRectangle2D)
  {
    this(paramInt1, paramInt2, paramv, paramRectangle2D, true);
  }
  













  u(int paramInt1, int paramInt2, v paramv, Rectangle2D paramRectangle2D, boolean paramBoolean)
  {
    super(paramInt1, paramInt2);
    com.orsonpdf.util.a.a(paramRectangle2D, "bounds");
    this.bl = paramv;
    this.bm = ((Rectangle2D)paramRectangle2D.clone());
    this.bp = new ArrayList();
    int i = this.bl.aK().ab();
    this.bn = new j(i, this);
    if (paramBoolean) {
      this.bn.a(new com.orsonpdf.filter.e());
    }
    this.bq = new HashMap();
    this.br = new HashMap();
    
    this.bs = new b();
    this.bt = new b();
    
    this.bu = AffineTransform.getTranslateInstance(0.0D, 
      paramRectangle2D.getHeight());
    this.bu.concatenate(AffineTransform.getScaleInstance(1.0D, 
      -1.0D));
  }
  





  public Rectangle2D aG()
  {
    return (Rectangle2D)this.bm.clone();
  }
  




  public r aH()
  {
    return this.bn;
  }
  




  public m aI()
  {
    if (this.bo == null) {
      this.bo = new m(this.bn, 
        (int)this.bm.getWidth(), 
        (int)this.bm.getHeight());
    }
    return this.bo;
  }
  







  String f(Font paramFont)
  {
    String str = this.bl.f(paramFont);
    if (!this.bp.contains(str)) {
      this.bp.add(str);
    }
    return str;
  }
  
  private b aJ() {
    b localb = new b();
    for (String str : this.bp) {
      l locall = this.bl.A(str);
      localb.a(str, locall.aE());
    }
    return localb;
  }
  








  String c(GradientPaint paramGradientPaint)
  {
    com.orsonpdf.util.b localb = new com.orsonpdf.util.b(paramGradientPaint);
    String str = (String)this.bq.get(localb);
    if (str == null) {
      k localk = this.bl.aK();
      d locald = new d(
        localk.ab(), 
        paramGradientPaint.getColor1().getRGBColorComponents(null), 
        paramGradientPaint.getColor2().getRGBColorComponents(null));
      localk.a(locald);
      double[] arrayOfDouble = new double[4];
      arrayOfDouble[0] = paramGradientPaint.getPoint1().getX();
      arrayOfDouble[1] = paramGradientPaint.getPoint1().getY();
      arrayOfDouble[2] = paramGradientPaint.getPoint2().getX();
      arrayOfDouble[3] = paramGradientPaint.getPoint2().getY();
      com.orsonpdf.shading.a locala = new com.orsonpdf.shading.a(localk.ab(), arrayOfDouble, locald);
      localk.a(locala);
      w.a locala1 = new w.a(localk.ab(), locala, 
        this.bu);
      localk.a(locala1);
      str = "/P" + (this.bs.H() + 1);
      this.bs.a(str, locala1);
      this.bq.put(localb, str);
    }
    return str;
  }
  








  String c(RadialGradientPaint paramRadialGradientPaint)
  {
    com.orsonpdf.util.e locale = new com.orsonpdf.util.e(paramRadialGradientPaint);
    String str = (String)this.br.get(locale);
    if (str == null) {
      k localk = this.bl.aK();
      g localg = a(paramRadialGradientPaint);
      localk.a(localg);
      double[] arrayOfDouble = new double[6];
      arrayOfDouble[0] = paramRadialGradientPaint.getFocusPoint().getX();
      arrayOfDouble[1] = paramRadialGradientPaint.getFocusPoint().getY();
      arrayOfDouble[2] = 0.0D;
      arrayOfDouble[3] = paramRadialGradientPaint.getCenterPoint().getX();
      arrayOfDouble[4] = paramRadialGradientPaint.getCenterPoint().getY();
      arrayOfDouble[5] = paramRadialGradientPaint.getRadius();
      com.orsonpdf.shading.b localb = new com.orsonpdf.shading.b(localk.ab(), arrayOfDouble, localg);
      localk.a(localb);
      w.a locala = new w.a(localk.ab(), localb, 
        this.bu);
      localk.a(locala);
      str = "/P" + (this.bs.H() + 1);
      this.bs.a(str, locala);
      this.br.put(locale, str);
    }
    return str;
  }
  
  private g a(MultipleGradientPaint paramMultipleGradientPaint)
  {
    k localk = this.bl.aK();
    
    if (paramMultipleGradientPaint.getColors().length == 2) {
      d locald = new d(
        localk.ab(), 
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
        localk.ab(), 
        paramMultipleGradientPaint.getColors()[j].getRGBColorComponents(null), 
        paramMultipleGradientPaint.getColors()[(j + 1)].getRGBColorComponents(null));
      localk.a(arrayOfg[j]);
      if (j < i - 1) {
        arrayOfFloat1[j] = paramMultipleGradientPaint.getFractions()[(j + 1)];
      }
      arrayOfFloat2[(j * 2)] = 0.0F;
      arrayOfFloat2[(j * 2 + 1)] = 1.0F;
    }
    return new x(localk.ab(), arrayOfg, 
      arrayOfFloat1, arrayOfFloat2);
  }
  


  private Map<Integer, String> bw = new HashMap();
  








  String p(int paramInt)
  {
    Integer localInteger = Integer.valueOf(paramInt);
    float f = paramInt / 255.0F;
    String str = (String)this.bw.get(localInteger);
    if (str == null) {
      k localk = this.bl.aK();
      i locali = new i(
        localk.ab());
      locali.b(f);
      locali.a(f);
      localk.a(locali);
      str = "/GS" + (this.bt.H() + 1);
      this.bt.a(str, locali);
      this.bw.put(localInteger, str);
    }
    return str;
  }
  







  String a(Image paramImage)
  {
    com.orsonpdf.util.a.a(paramImage, "img");
    k localk = this.bl.aK();
    s locals = new s(
      localk.ab(), paramImage);
    locals.a(new com.orsonpdf.filter.e());
    localk.a(locals);
    String str = "/Image" + this.bv.H();
    this.bv.a(str, locals);
    return locals.aE();
  }
  










  String a(Image paramImage, boolean paramBoolean)
  {
    com.orsonpdf.util.a.a(paramImage, "img");
    k localk = this.bl.aK();
    String str1 = null;
    if (paramBoolean) {
      str1 = a(paramImage);
    }
    q localq = new q(localk.ab(), paramImage, 
      str1);
    localq.a(new com.orsonpdf.filter.e());
    localk.a(localq);
    String str2 = "/Image" + this.bv.H();
    this.bv.a(str2, localq);
    return str2;
  }
  
  public byte[] K()
  {
    return ae().I();
  }
  
  private b ae() {
    b localb1 = new b("/Page");
    localb1.a("/Parent", this.bl);
    localb1.a("/MediaBox", this.bm);
    localb1.a("/Contents", this.bn);
    b localb2 = new b();
    localb2.a("/ProcSet", "[/PDF /Text /ImageB /ImageC /ImageI]");
    if (!this.bv.G()) {
      localb2.a("/XObject", this.bv);
    }
    if (!this.bp.isEmpty()) {
      localb2.a("/Font", aJ());
    }
    if (!this.bs.G()) {
      localb2.a("/Pattern", this.bs);
    }
    if (!this.bt.G()) {
      localb2.a("/ExtGState", this.bt);
    }
    localb1.a("/Resources", localb2);
    return localb1;
  }
}