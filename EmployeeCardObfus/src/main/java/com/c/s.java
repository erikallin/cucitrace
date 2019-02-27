package com.c;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import com.c.cc.a;


public class s
  extends y
{
  int aI;
  int aJ;
  Image bi;
  
  public s(int paramInt, Image paramImage)
  {
    super(paramInt);
    a.aab(paramImage, "img");
    this.aI = paramImage.getWidth(null);
    this.aJ = paramImage.getHeight(null);
    this.bi = paramImage;
  }
  

  public byte[] X()
  {
    BufferedImage localBufferedImage;

    if (!(this.bi instanceof BufferedImage)) {
      localBufferedImage = new BufferedImage(this.aI, this.aJ, 2);
      
      Graphics2D localObject = localBufferedImage.createGraphics();
      localObject.drawImage(this.bi, 0, 0, null);
    } else {
      localBufferedImage = (BufferedImage)this.bi;
    }
    
    byte[] localObject = new byte[this.aI * this.aJ];
    int i = 0;
    for (int j = this.aJ - 1; j >= 0; j--) {
      for (int k = 0; k < this.aI; k++) {
        int m = localBufferedImage.getRGB(k, j);
        localObject[i++] = (byte) (m >> 24);
      }
    }
    return localObject;
  }
  


  protected b o(int paramInt)
  {
    b localb = super.o(paramInt);
    localb.u("/XObject");
    localb.a("/Subtype", "/Image");
    localb.a("/ColorSpace", "/DeviceGray");
    localb.a("/BitsPerComponent", Integer.valueOf(8));
    localb.a("/Width", Integer.valueOf(this.aI));
    localb.a("/Height", Integer.valueOf(this.aJ));
    return localb;
  }
}
