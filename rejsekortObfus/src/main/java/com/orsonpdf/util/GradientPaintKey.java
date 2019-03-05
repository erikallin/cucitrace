package com.orsonpdf.util;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.geom.Point2D;

public final class GradientPaintKey
{
  private GradientPaint cd;
  
  public GradientPaintKey(GradientPaint paramGradientPaint)
  {
    Args.aab(paramGradientPaint, "paint");
    this.cd = paramGradientPaint;
  }
  


  public GradientPaint aX()
  {
    return this.cd;
  }
  


  public boolean a(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof GradientPaintKey)) {
      return false;
    }
    GradientPaintKey localb = (GradientPaintKey)paramObject;
    GradientPaint localGradientPaint1 = this.cd;
    GradientPaint localGradientPaint2 = localb.aX();
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
  

  public int O()
  {
    int i = 5;
    i = 47 * i + this.cd.getPoint1().hashCode();
    i = 47 * i + this.cd.getPoint2().hashCode();
    i = 47 * i + this.cd.getColor1().hashCode();
    i = 47 * i + this.cd.getColor2().hashCode();
    return i;
  }
}
