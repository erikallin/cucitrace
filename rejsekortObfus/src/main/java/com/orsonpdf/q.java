package com.orsonpdf;

import com.orsonpdf.util.a;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
















































public class q
  extends y
{
  int aI;
  int aJ;
  Image bi;
  String bj;
  
  public q(int paramInt, Image paramImage, String paramString)
  {
    super(paramInt);
    a.a(paramImage, "img");
    this.aI = paramImage.getWidth(null);
    this.aJ = paramImage.getHeight(null);
    this.bi = paramImage;
    this.bj = paramString;
  }
  




  public byte[] X()
  {
    BufferedImage localBufferedImage;
    


    if (!(this.bi instanceof BufferedImage)) {
      localBufferedImage = new BufferedImage(this.aI, this.aJ, 
        2);
      localObject = localBufferedImage.createGraphics();
      ((Graphics2D)localObject).setBackground(new Color(255, 255, 255, 0));
      ((Graphics2D)localObject).clearRect(0, 0, this.aI, this.aJ);
      ((Graphics2D)localObject).drawImage(this.bi, 0, 0, null);
    } else {
      localBufferedImage = (BufferedImage)this.bi;
    }
    
    Object localObject = new byte[this.aI * this.aJ * 3];
    int i = 0;
    for (int j = this.aJ - 1; j >= 0; j--) {
      for (int k = 0; k < this.aI; k++) {
        int m = localBufferedImage.getRGB(k, j);
        localObject[(i++)] = ((byte)(m >> 16));
        localObject[(i++)] = ((byte)(m >> 8));
        localObject[(i++)] = ((byte)m);
      }
    }
    return (byte[])localObject;
  }
  








  protected b o(int paramInt)
  {
    b localb = super.o(paramInt);
    localb.u("/XObject");
    localb.a("/Subtype", "/Image");
    localb.a("/ColorSpace", "/DeviceRGB");
    localb.a("/BitsPerComponent", Integer.valueOf(8));
    localb.a("/Width", Integer.valueOf(this.aI));
    localb.a("/Height", Integer.valueOf(this.aJ));
    if (this.bj != null) {
      localb.a("/SMask", this.bj);
    }
    return localb;
  }
}
