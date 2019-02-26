package com.c.util;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.text.AttributedString;


public class g
{
  public static Rectangle2D a(String paramString, Graphics2D paramGraphics2D, float paramFloat1, float paramFloat2, f paramf)
  {
    Rectangle2D.Double localDouble = new Rectangle2D.Double();
    float[] arrayOfFloat = a(paramGraphics2D, paramString, paramf, 
      localDouble);
    
    localDouble.setRect(paramFloat1 + arrayOfFloat[0], paramFloat2 + arrayOfFloat[1] + arrayOfFloat[2], 
      localDouble.getWidth(), localDouble.getHeight());
    paramGraphics2D.drawString(paramString, paramFloat1 + arrayOfFloat[0], paramFloat2 + arrayOfFloat[1]);
    return localDouble;
  }


  private static float[] a(Graphics2D paramGraphics2D, String paramString, f paramf)
  {
    float[] arrayOfFloat = new float[2];
    FontRenderContext localFontRenderContext = paramGraphics2D.getFontRenderContext();
    Font localFont = paramGraphics2D.getFont();
    FontMetrics localFontMetrics = paramGraphics2D.getFontMetrics(localFont);
    Rectangle2D localRectangle2D = a(paramString, paramGraphics2D, localFontMetrics);
    LineMetrics localLineMetrics = localFont.getLineMetrics(paramString, localFontRenderContext);
    float f1 = localLineMetrics.getAscent();
    float f2 = f1 / 2.0F;
    float f3 = localLineMetrics.getDescent();
    float f4 = localLineMetrics.getLeading();
    float f5 = 0.0F;
    float f6 = 0.0F;
    
    if (paramf.ba()) {
      f5 = (float)-localRectangle2D.getWidth() / 2.0F;
    } else if (paramf.bb()) {
      f5 = (float)-localRectangle2D.getWidth();
    }
    
    if (paramf.bc()) {
      f6 = -f3 - f4 + (float)localRectangle2D.getHeight();
    } else if (paramf.bd()) {
      f6 = f2;
    } else if (paramf.be()) {
      f6 = -f3 - f4 + (float)(localRectangle2D.getHeight() / 2.0D);
    } else if (paramf.bf()) {
      f6 = 0.0F;
    } else if (paramf.bg()) {
      f6 = -localLineMetrics.getDescent() - localLineMetrics.getLeading();
    }
    arrayOfFloat[0] = f5;
    arrayOfFloat[1] = f6;
    return arrayOfFloat;
  }



  private static float[] a(Graphics2D paramGraphics2D, String paramString, f paramf, Rectangle2D paramRectangle2D)
  {
    float[] arrayOfFloat = new float[3];
    FontRenderContext localFontRenderContext = paramGraphics2D.getFontRenderContext();
    Font localFont = paramGraphics2D.getFont();
    FontMetrics localFontMetrics = paramGraphics2D.getFontMetrics(localFont);
    Rectangle2D localRectangle2D = a(paramString, paramGraphics2D, localFontMetrics);
    LineMetrics localLineMetrics = localFont.getLineMetrics(paramString, localFontRenderContext);
    float f1 = localLineMetrics.getAscent();
    arrayOfFloat[2] = (-f1);
    float f2 = f1 / 2.0F;
    float f3 = localLineMetrics.getDescent();
    float f4 = localLineMetrics.getLeading();
    float f5 = 0.0F;
    float f6 = 0.0F;
    
    if (paramf.ba()) {
      f5 = (float)-localRectangle2D.getWidth() / 2.0F;
    } else if (paramf.bb()) {
      f5 = (float)-localRectangle2D.getWidth();
    }
    
    if (paramf.bc()) {
      f6 = -f3 - f4 + (float)localRectangle2D.getHeight();
    } else if (paramf.bd()) {
      f6 = f2;
    } else if (paramf.be()) {
      f6 = -f3 - f4 + (float)(localRectangle2D.getHeight() / 2.0D);
    } else if (paramf.bf()) {
      f6 = 0.0F;
    } else if (paramf.bg()) {
      f6 = -localLineMetrics.getDescent() - localLineMetrics.getLeading();
    }
    if (paramRectangle2D != null) {
      paramRectangle2D.setRect(localRectangle2D);
    }
    arrayOfFloat[0] = f5;
    arrayOfFloat[1] = f6;
    return arrayOfFloat;
  }


  public static Rectangle2D a(String paramString, Graphics2D paramGraphics2D, FontMetrics paramFontMetrics)
  {
    double d1 = paramFontMetrics.stringWidth(paramString);
    double d2 = paramFontMetrics.getHeight();
    return new Rectangle2D.Double(0.0D, -paramFontMetrics.getAscent(), d1, d2);
  }
  


  public static void a(String paramString, Graphics2D paramGraphics2D, float paramFloat1, float paramFloat2, f paramf, double paramDouble, float paramFloat3, float paramFloat4)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return;
    }
    float[] arrayOfFloat = a(paramGraphics2D, paramString, paramf);
    a(paramString, paramGraphics2D, paramFloat1 + arrayOfFloat[0], paramFloat2 + arrayOfFloat[1], paramDouble, 
      paramFloat3, paramFloat4);
  }
  


  public static void a(String paramString, Graphics2D paramGraphics2D, float paramFloat1, float paramFloat2, f paramf1, double paramDouble, f paramf2)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return;
    }
    float[] arrayOfFloat1 = a(paramGraphics2D, paramString, paramf1);
    float[] arrayOfFloat2 = b(paramGraphics2D, paramString, 
      paramf2);
    a(paramString, paramGraphics2D, paramFloat1 + arrayOfFloat1[0], paramFloat2 + arrayOfFloat1[1], 
      paramDouble, paramFloat1 + arrayOfFloat1[0] + arrayOfFloat2[0], 
      paramFloat2 + arrayOfFloat1[1] + arrayOfFloat2[1]);
  }
  


  private static float[] b(Graphics2D paramGraphics2D, String paramString, f paramf)
  {
    float[] arrayOfFloat = new float[2];
    FontRenderContext localFontRenderContext = paramGraphics2D.getFontRenderContext();
    LineMetrics localLineMetrics = paramGraphics2D.getFont().getLineMetrics(paramString, localFontRenderContext);
    FontMetrics localFontMetrics = paramGraphics2D.getFontMetrics();
    Rectangle2D localRectangle2D = a(paramString, paramGraphics2D, localFontMetrics);
    float f1 = localLineMetrics.getAscent();
    float f2 = f1 / 2.0F;
    float f3 = localLineMetrics.getDescent();
    float f4 = localLineMetrics.getLeading();
    float f5 = 0.0F;
    float f6 = 0.0F;
    
    if (paramf.aZ()) {
      f5 = 0.0F;
    } else if (paramf.ba()) {
      f5 = (float)localRectangle2D.getWidth() / 2.0F;
    } else if (paramf.bb()) {
      f5 = (float)localRectangle2D.getWidth();
    }
    
    if (paramf.bc()) {
      f6 = f3 + f4 - (float)localRectangle2D.getHeight();
    } else if (paramf.be()) {
      f6 = f3 + f4 - (float)(localRectangle2D.getHeight() / 2.0D);
    } else if (paramf.bd()) {
      f6 = -f2;
    } else if (paramf.bf()) {
      f6 = 0.0F;
    } else if (paramf.bg()) {
      f6 = localLineMetrics.getDescent() + localLineMetrics.getLeading();
    }
    arrayOfFloat[0] = f5;
    arrayOfFloat[1] = f6;
    return arrayOfFloat;
  }
  


  public static void a(String paramString, Graphics2D paramGraphics2D, double paramDouble, float paramFloat1, float paramFloat2)
  {
    a(paramString, paramGraphics2D, paramFloat1, paramFloat2, paramDouble, paramFloat1, paramFloat2);
  }
  


  public static void a(String paramString, Graphics2D paramGraphics2D, float paramFloat1, float paramFloat2, double paramDouble, float paramFloat3, float paramFloat4)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return;
    }
    
    AffineTransform localAffineTransform1 = paramGraphics2D.getTransform();
    

    AffineTransform localAffineTransform2 = AffineTransform.getRotateInstance(paramDouble, 
      paramFloat3, paramFloat4);
    paramGraphics2D.transform(localAffineTransform2);
    
    AttributedString localAttributedString = new AttributedString(paramString, 
      paramGraphics2D.getFont().getAttributes());
    paramGraphics2D.drawString(localAttributedString.getIterator(), paramFloat1, paramFloat2);
    paramGraphics2D.setTransform(localAffineTransform1);
  }
}
