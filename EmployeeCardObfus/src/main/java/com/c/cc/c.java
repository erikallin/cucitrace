package com.c.cc;

import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;
import java.util.Hashtable;


public class c
{
  public static Shape g(Shape paramShape)
  {
    a.aab(paramShape, "shape");
    Object localObject; if ((paramShape instanceof Line2D)) {
      localObject = (Line2D)paramShape;
      return new Line2D.Double(((Line2D)localObject).getX1(), ((Line2D)localObject).getY1(), ((Line2D)localObject).getX2(), ((Line2D)localObject).getY2());
    }
    if ((paramShape instanceof Rectangle2D)) {
      localObject = (Rectangle2D)paramShape;
      return new Rectangle2D.Double(((Rectangle2D)localObject).getX(), ((Rectangle2D)localObject).getY(), ((Rectangle2D)localObject).getWidth(), 
        ((Rectangle2D)localObject).getHeight());
    }
    if ((paramShape instanceof RoundRectangle2D)) {
      localObject = (RoundRectangle2D)paramShape;
      return new RoundRectangle2D.Double(((RoundRectangle2D)localObject).getX(), ((RoundRectangle2D)localObject).getY(), 
        ((RoundRectangle2D)localObject).getWidth(), ((RoundRectangle2D)localObject).getHeight(), ((RoundRectangle2D)localObject).getArcWidth(), 
        ((RoundRectangle2D)localObject).getArcHeight());
    }
    if ((paramShape instanceof Arc2D)) {
      localObject = (Arc2D)paramShape;
      return new Arc2D.Double(((Arc2D)localObject).getX(), ((Arc2D)localObject).getY(), ((Arc2D)localObject).getWidth(), 
        ((Arc2D)localObject).getHeight(), ((Arc2D)localObject).getAngleStart(), ((Arc2D)localObject).getAngleExtent(), 
        ((Arc2D)localObject).getArcType());
    }
    if ((paramShape instanceof Ellipse2D)) {
      localObject = (Ellipse2D)paramShape;
      return new Ellipse2D.Double(((Ellipse2D)localObject).getX(), ((Ellipse2D)localObject).getY(), ((Ellipse2D)localObject).getWidth(), 
        ((Ellipse2D)localObject).getHeight());
    }
    if ((paramShape instanceof Polygon)) {
      localObject = (Polygon)paramShape;
      return new Polygon(((Polygon)localObject).xpoints, ((Polygon)localObject).ypoints, ((Polygon)localObject).npoints);
    }
    return new Path2D.Double(paramShape);
  }
  

  public static GeneralPath a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt, boolean paramBoolean)
  {
    GeneralPath localGeneralPath = new GeneralPath();
    localGeneralPath.moveTo(paramArrayOfInt1[0], paramArrayOfInt2[0]);
    for (int i = 1; i < paramInt; i++) {
      localGeneralPath.lineTo(paramArrayOfInt1[i], paramArrayOfInt2[i]);
    }
    if (paramBoolean) {
      localGeneralPath.closePath();
    }
    return localGeneralPath;
  }
  

  public static BufferedImage a(RenderedImage paramRenderedImage)
  {
    if ((paramRenderedImage instanceof BufferedImage)) {
      return (BufferedImage)paramRenderedImage;
    }
    ColorModel localColorModel = paramRenderedImage.getColorModel();
    int i = paramRenderedImage.getWidth();
    int j = paramRenderedImage.getHeight();
    WritableRaster localWritableRaster = localColorModel.createCompatibleWritableRaster(i, j);
    boolean bool = localColorModel.isAlphaPremultiplied();
    Hashtable localHashtable = new Hashtable();
    String[] arrayOfString = paramRenderedImage.getPropertyNames();
    if (arrayOfString != null) {
      for (int k = 0; k < arrayOfString.length; k++) {
        localHashtable.put(arrayOfString[k], paramRenderedImage.getProperty(arrayOfString[k]));
      }
    }
    BufferedImage localBufferedImage = new BufferedImage(localColorModel, localWritableRaster, 
      bool, localHashtable);
    paramRenderedImage.copyData(localWritableRaster);
    return localBufferedImage;
  }
}
