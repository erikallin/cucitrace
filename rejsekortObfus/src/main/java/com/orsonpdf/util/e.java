package com.orsonpdf.util;

import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import java.util.Arrays;


public class e
{
  private RadialGradientPaint ce;
  float cf = 0.0F;
  

  public e(RadialGradientPaint paramRadialGradientPaint)
  {
    a.aab(paramRadialGradientPaint, "rgp");
    this.ce = paramRadialGradientPaint;
  }
  

  public RadialGradientPaint aY()
  {
    return this.ce;
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
    if (!this.ce.getCenterPoint().equals(localRadialGradientPaint.getCenterPoint())) {
      return false;
    }
    if (!this.ce.getFocusPoint().equals(localRadialGradientPaint.getCenterPoint())) {
      return false;
    }
    if (!Arrays.equals(this.ce.getColors(), localRadialGradientPaint.getColors())) {
      return false;
    }
    if (!Arrays.equals(this.ce.getFractions(), localRadialGradientPaint.getFractions())) {
      return false;
    }
    return true;
  }


  public int O()
  {
    int i = 5;
    i = 47 * i + this.ce.getCenterPoint().hashCode();
    i = 47 * i + this.ce.getFocusPoint().hashCode();
    i = 47 * i + Float.floatToIntBits(this.ce.getRadius());
    i = 47 * i + Arrays.hashCode(this.ce.getColors());
    i = 47 * i + Arrays.hashCode(this.ce.getFractions());
    return i;
  }
}
