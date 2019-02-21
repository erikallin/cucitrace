package a.c;

import a.c.c.a;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
















































public class q
  extends y
{
  int bI;
  int bJ;
  Image ci;
  String cj;
  
  public q(int paramInt, Image paramImage, String paramString)
  {
    super(paramInt);
    a.a(paramImage, "img");
    this.bI = paramImage.getWidth(null);
    this.bJ = paramImage.getHeight(null);
    this.ci = paramImage;
    this.cj = paramString;
  }
  




  public byte[] aH()
  {
    BufferedImage localBufferedImage;
    


    if (!(this.ci instanceof BufferedImage)) {
      localBufferedImage = new BufferedImage(this.bI, this.bJ, 
        2);
      localObject = localBufferedImage.createGraphics();
      ((Graphics2D)localObject).setBackground(new Color(255, 255, 255, 0));
      ((Graphics2D)localObject).clearRect(0, 0, this.bI, this.bJ);
      ((Graphics2D)localObject).drawImage(this.ci, 0, 0, null);
    } else {
      localBufferedImage = (BufferedImage)this.ci;
    }
    
    Object localObject = new byte[this.bI * this.bJ * 3];
    int i = 0;
    for (int j = this.bJ - 1; j >= 0; j--) {
      for (int k = 0; k < this.bI; k++) {
        int m = localBufferedImage.getRGB(k, j);
        localObject[(i++)] = ((byte)(m >> 16));
        localObject[(i++)] = ((byte)(m >> 8));
        localObject[(i++)] = ((byte)m);
      }
    }
    return (byte[])localObject;
  }
  








  protected b x(int paramInt)
  {
    b localb = super.x(paramInt);
    localb.D("/XObject");
    localb.a("/Subtype", "/Image");
    localb.a("/ColorSpace", "/DeviceRGB");
    localb.a("/BitsPerComponent", Integer.valueOf(8));
    localb.a("/Width", Integer.valueOf(this.bI));
    localb.a("/Height", Integer.valueOf(this.bJ));
    if (this.cj != null) {
      localb.a("/SMask", this.cj);
    }
    return localb;
  }
}
