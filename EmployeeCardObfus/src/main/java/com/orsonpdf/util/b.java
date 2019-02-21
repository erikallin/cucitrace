package com.orsonpdf.util;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.geom.Point2D;










































public final class b
{
  private GradientPaint dd;
  
  public b(GradientPaint paramGradientPaint)
  {
    a.a(paramGradientPaint, "paint");
    this.dd = paramGradientPaint;
  }
  





  public GradientPaint bH()
  {
    return this.dd;
  }
  







  public boolean a(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    b localb = (b)paramObject;
    GradientPaint localGradientPaint1 = this.dd;
    GradientPaint localGradientPaint2 = localb.bH();
    if (!localGradientPaint1.getColor1().equals(localGradientPaint2.getColor1())) {
      return false;
    }
    if (!localGradientPaint1.getColor2().equals(localGradientPaint2.getColor2())) {
      return false;
    }
    if (!localGradientPaint1.getPoint1().equals(localGradientPaint2.getPoint1())) {
      return false;
    }
    if (!localGradientPaint1.getPoint2().equals(localGradientPaint2.getPoint2())) {
      return false;
    }
    if (localGradientPaint1.getTransparency() != localGradientPaint2.getTransparency()) {
      return false;
    }
    if (localGradientPaint1.isCyclic() != localGradientPaint2.isCyclic()) {
      return false;
    }
    return true;
  }
  





  public int ay()
  {
    int i = 5;
    i = 47 * i + this.dd.getPoint1().hashCode();
    i = 47 * i + this.dd.getPoint2().hashCode();
    i = 47 * i + this.dd.getColor1().hashCode();
    i = 47 * i + this.dd.getColor2().hashCode();
    return i;
  }
}
