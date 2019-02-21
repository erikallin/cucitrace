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
  private GraphicsDevice cb;
  private int bI;
  private int bJ;
  
  public n(int paramInt1, int paramInt2)
  {
    this.bI = paramInt1;
    this.bJ = paramInt2;
  }
  





  public GraphicsDevice be()
  {
    if (this.cb == null) {
      this.cb = new o("OrsonPDF-GraphicsDevice", 
        this);
    }
    return this.cb;
  }
  





  public ColorModel bf()
  {
    return w(3);
  }
  








  public ColorModel w(int paramInt)
  {
    if (paramInt == 3)
      return ColorModel.getRGBdefault();
    if (paramInt == 1) {
      return new DirectColorModel(32, 16711680, 65280, 255);
    }
    return null;
  }
  






  public AffineTransform bg()
  {
    return new AffineTransform();
  }
  





  public AffineTransform bh()
  {
    return new AffineTransform();
  }
  





  public Rectangle bi()
  {
    return new Rectangle(this.bI, this.bJ);
  }
  
  private BufferedImage cc = new BufferedImage(10, 10, 
    2);
  
  public VolatileImage a(int paramInt1, int paramInt2, ImageCapabilities paramImageCapabilities, int paramInt3)
    throws AWTException
  {
    return 
      this.cc.createGraphics().getDeviceConfiguration().createCompatibleVolatileImage(paramInt1, paramInt2, paramImageCapabilities, 
      paramInt3);
  }
}
