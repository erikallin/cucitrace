package com.orsonpdf;

import java.awt.AWTException;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.ImageCapabilities;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.VolatileImage;









































public class n
  extends GraphicsConfiguration
{
  private GraphicsDevice bb;
  private int aI;
  private int aJ;
  
  public n(int paramInt1, int paramInt2)
  {
    this.aI = paramInt1;
    this.aJ = paramInt2;
  }
  





  public GraphicsDevice au()
  {
    if (this.bb == null) {
      this.bb = new o("OrsonPDF-GraphicsDevice", 
        this);
    }
    return this.bb;
  }
  





  public ColorModel av()
  {
    return n(3);
  }
  








  public ColorModel n(int paramInt)
  {
    if (paramInt == 3)
      return ColorModel.getRGBdefault();
    if (paramInt == 1) {
      return new DirectColorModel(32, 16711680, 65280, 255);
    }
    return null;
  }
  






  public AffineTransform aw()
  {
    return new AffineTransform();
  }
  





  public AffineTransform ax()
  {
    return new AffineTransform();
  }
  





  public Rectangle ay()
  {
    return new Rectangle(this.aI, this.aJ);
  }
  
  private BufferedImage bc = new BufferedImage(10, 10, 
    2);
  
  public VolatileImage a(int paramInt1, int paramInt2, ImageCapabilities paramImageCapabilities, int paramInt3)
    throws AWTException
  {
    return 
      this.bc.createGraphics().getDeviceConfiguration().createCompatibleVolatileImage(paramInt1, paramInt2, paramImageCapabilities, 
      paramInt3);
  }
}