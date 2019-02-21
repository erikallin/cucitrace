package com.orsonpdf.util;

import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import java.util.Arrays;









































public class e
{
  private RadialGradientPaint de;
  float df = 0.0F;
  




  public e(RadialGradientPaint paramRadialGradientPaint)
  {
    a.a(paramRadialGradientPaint, "rgp");
    this.de = paramRadialGradientPaint;
  }
  





  public RadialGradientPaint bI()
  {
    return this.de;
  }
  







  public boolean a(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof RadialGradientPaint)) {
      return false;
    }
    RadialGradientPaint localRadialGradientPaint = (RadialGradientPaint)paramObject;
    if (!this.de.getCenterPoint().equals(localRadialGradientPaint.getCenterPoint())) {
      return false;
    }
    if (!this.de.getFocusPoint().equals(localRadialGradientPaint.getCenterPoint())) {
      return false;
    }
    if (!Arrays.equals(this.de.getColors(), localRadialGradientPaint.getColors())) {
      return false;
    }
    if (!Arrays.equals(this.de.getFractions(), localRadialGradientPaint.getFractions())) {
      return false;
    }
    return true;
  }
  





  public int ay()
  {
    int i = 5;
    i = 47 * i + this.de.getCenterPoint().hashCode();
    i = 47 * i + this.de.getFocusPoint().hashCode();
    i = 47 * i + Float.floatToIntBits(this.de.getRadius());
    i = 47 * i + Arrays.hashCode(this.de.getColors());
    i = 47 * i + Arrays.hashCode(this.de.getFractions());
    return i;
  }
}
