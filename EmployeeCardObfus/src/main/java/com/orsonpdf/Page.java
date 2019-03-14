package com.orsonpdf;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Image;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page extends PDFObject
{
  private Pages bl;
  private Rectangle2D bm;
  private GraphicsStream bn;
  private PDFGraphics2D bo;
  private List<String> bp;
  private Map<com.orsonpdf.util.GradientPaintKey, String> bq;
  private Map<com.orsonpdf.util.RadialGradientPaintKey, String> br;
  private Dictionary bs;
  private Dictionary bt;
  private AffineTransform bu;
  private Dictionary bv = new Dictionary();
  
  Page(int paramInt1, int paramInt2, Pages paramu, Rectangle2D paramRectangle2D)
  {
    this(paramInt1, paramInt2, paramu, paramRectangle2D, true);
  }
  
  Page(int paramInt1, int paramInt2, Pages paramu, Rectangle2D paramRectangle2D, boolean paramBoolean)
  {
    super(paramInt1, paramInt2);
    com.orsonpdf.util.Args.aab(paramRectangle2D, "bounds");
    this.bl = paramu;
    this.bm = (Rectangle2D) paramRectangle2D.clone();
    this.bp = new ArrayList<String>();
    int i = this.bl.aK().ab();
    this.bn = new GraphicsStream(i, this);
    if (paramBoolean) {
      this.bn.a(new com.orsonpdf.filter.FlateFilter());
    }
    this.bq = new HashMap<com.orsonpdf.util.GradientPaintKey, String>();
    this.br = new HashMap<com.orsonpdf.util.RadialGradientPaintKey, String>();
    
    this.bs = new Dictionary();
    this.bt = new Dictionary();
    
    this.bu = AffineTransform.getTranslateInstance(0.0D, 
      paramRectangle2D.getHeight());
    this.bu.concatenate(AffineTransform.getScaleInstance(1.0D, 
      -1.0D));
  }
  
  public Rectangle2D aG()
  {
    return (Rectangle2D) this.bm.clone();
  }
  
  public PDFObject aH()
  {
    return this.bn;
  }
  
  public PDFGraphics2D aI()
  {
    if (this.bo == null) {
      this.bo = new PDFGraphics2D(this.bn, 
        (int) this.bm.getWidth(), 
        (int) this.bm.getHeight());
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
  
  private Dictionary aJ()
  {
    Dictionary localb = new Dictionary();
    for (String str : this.bp)
    {
      PDFFont locall = this.bl.A(str);
      localb.a(str, locall.aE());
    }
    return localb;
  }
  
  String c(GradientPaint paramGradientPaint)
  {
    com.orsonpdf.util.GradientPaintKey localb = new com.orsonpdf.util.GradientPaintKey(paramGradientPaint);
    String str = (String)this.bq.get(localb);
    if (str == null)
    {
      PDFDocument localk = this.bl.aK();
      ExponentialInterpolationFunction locald = new ExponentialInterpolationFunction(
        localk.ab(), 
        paramGradientPaint.getColor1().getRGBColorComponents(null), 
        paramGradientPaint.getColor2().getRGBColorComponents(null));
      localk.f(locald);
      double[] arrayOfDouble = new double[4];
      arrayOfDouble[0] = paramGradientPaint.getPoint1().getX();
      arrayOfDouble[1] = paramGradientPaint.getPoint1().getY();
      arrayOfDouble[2] = paramGradientPaint.getPoint2().getX();
      arrayOfDouble[3] = paramGradientPaint.getPoint2().getY();
      com.orsonpdf.shading.AxialShading locala = new com.orsonpdf.shading.AxialShading(localk.ab(), arrayOfDouble, locald);
      localk.f(locala);
      Pattern locala1 = new Pattern.an(localk.ab(), locala, 
        this.bu);
      localk.f(locala1);
      str = "/P" + (this.bs.H() + 1);
      this.bs.a(str, locala1);
      this.bq.put(localb, str);
    }
    return str;
  }
  
  String c(RadialGradientPaint paramRadialGradientPaint)
  {
    com.orsonpdf.util.RadialGradientPaintKey locale = new com.orsonpdf.util.RadialGradientPaintKey(paramRadialGradientPaint);
    String str = (String)this.br.get(locale);
    if (str == null)
    {
      PDFDocument localk = this.bl.aK();
      Function localg = a(paramRadialGradientPaint);
      localk.f(localg);
      double[] arrayOfDouble = new double[6];
      arrayOfDouble[0] = paramRadialGradientPaint.getFocusPoint().getX();
      arrayOfDouble[1] = paramRadialGradientPaint.getFocusPoint().getY();
      arrayOfDouble[2] = 0.0D;
      arrayOfDouble[3] = paramRadialGradientPaint.getCenterPoint().getX();
      arrayOfDouble[4] = paramRadialGradientPaint.getCenterPoint().getY();
      arrayOfDouble[5] = paramRadialGradientPaint.getRadius();
      com.orsonpdf.shading.RadialShading localb = new com.orsonpdf.shading.RadialShading(localk.ab(), arrayOfDouble, localg);
      localk.f(localb);
      Pattern locala = new Pattern.an(localk.ab(), localb, 
        this.bu);
      localk.f(locala);
      str = "/P" + (this.bs.H() + 1);
      this.bs.a(str, locala);
      this.br.put(locale, str);
    }
    return str;
  }
  
  private Function a(MultipleGradientPaint paramMultipleGradientPaint)
  {
    PDFDocument localk = this.bl.aK();
    if (paramMultipleGradientPaint.getColors().length == 2)
    {
      ExponentialInterpolationFunction locald = new ExponentialInterpolationFunction(
        localk.ab(), 
        paramMultipleGradientPaint.getColors()[0].getRGBColorComponents(null), 
        paramMultipleGradientPaint.getColors()[1].getRGBColorComponents(null));
      return locald;
    }
    int i = paramMultipleGradientPaint.getColors().length - 1;
    Function[] arrayOfg = new Function[i];
    float[] arrayOfFloat1 = new float[i - 1];
    float[] arrayOfFloat2 = new float[i * 2];
    for (int j = 0; j < i; j++)
    {
      arrayOfg[j] = new ExponentialInterpolationFunction(
        localk.ab(), 
        paramMultipleGradientPaint.getColors()[j].getRGBColorComponents(null), 
        paramMultipleGradientPaint.getColors()[(j + 1)].getRGBColorComponents(null));
      localk.f(arrayOfg[j]);
      if (j < i - 1) {
        arrayOfFloat1[j] = paramMultipleGradientPaint.getFractions()[(j + 1)];
      }
      arrayOfFloat2[(j * 2)] = 0.0F;
      arrayOfFloat2[(j * 2 + 1)] = 1.0F;
    }
    return new StitchingFunction(localk.ab(), arrayOfg, 
      arrayOfFloat1, arrayOfFloat2);
  }
  
  private Map<Integer, String> bw = new HashMap<Integer, String>();
  
  String p(int paramInt)
  {
    Integer localInteger = Integer.valueOf(paramInt);
    float f = paramInt / 255.0F;
    String str = (String)this.bw.get(localInteger);
    if (str == null)
    {
      PDFDocument localk = this.bl.aK();
      GraphicsStateDictionary locali = new GraphicsStateDictionary(
        localk.ab());
      locali.b(f);
      locali.a(f);
      localk.f(locali);
      str = "/GS" + (this.bt.H() + 1);
      this.bt.a(str, locali);
      this.bw.put(localInteger, str);
    }
    return str;
  }
  
  String a(Image paramImage)
  {
    com.orsonpdf.util.Args.aab(paramImage, "img");
    PDFDocument localk = this.bl.aK();
    PDFSoftMaskImage locals = new PDFSoftMaskImage(
      localk.ab(), paramImage);
    locals.a(new com.orsonpdf.filter.FlateFilter());
    localk.f(locals);
    String str = "/Image" + this.bv.H();
    this.bv.a(str, locals);
    return locals.aE();
  }
  
  String a(Image paramImage, boolean paramBoolean)
  {
    com.orsonpdf.util.Args.aab(paramImage, "img");
    PDFDocument localk = this.bl.aK();
    String str1 = null;
    if (paramBoolean) {
      str1 = a(paramImage);
    }
    PDFImage localq = new PDFImage(localk.ab(), paramImage, 
      str1);
    localq.a(new com.orsonpdf.filter.FlateFilter());
    localk.f(localq);
    String str2 = "/Image" + this.bv.H();
    this.bv.a(str2, localq);
    return str2;
  }
  
  public byte[] K()
  {
    return ae().I();
  }
  
  private Dictionary ae()
  {
    Dictionary localb1 = new Dictionary("/Page");
    localb1.a("/Parent", this.bl);
    localb1.a("/MediaBox", this.bm);
    localb1.a("/Contents", this.bn);
    Dictionary localb2 = new Dictionary();
    localb2.a("/ProcSet", "[]");
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
