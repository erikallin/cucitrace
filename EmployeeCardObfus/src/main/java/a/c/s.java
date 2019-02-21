package a.c;

import a.c.c.a;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;













































public class s
  extends y
{
  int bI;
  int bJ;
  Image ci;
  
  public s(int paramInt, Image paramImage)
  {
    super(paramInt);
    a.a(paramImage, "img");
    this.bI = paramImage.getWidth(null);
    this.bJ = paramImage.getHeight(null);
    this.ci = paramImage;
  }
  




  public byte[] aH()
  {
    BufferedImage localBufferedImage;
    


    if (!(this.ci instanceof BufferedImage)) {
      localBufferedImage = new BufferedImage(this.bI, this.bJ, 
        2);
      localObject = localBufferedImage.createGraphics();
      ((Graphics2D)localObject).drawImage(this.ci, 0, 0, null);
    } else {
      localBufferedImage = (BufferedImage)this.ci;
    }
    
    Object localObject = new byte[this.bI * this.bJ];
    int i = 0;
    for (int j = this.bJ - 1; j >= 0; j--) {
      for (int k = 0; k < this.bI; k++) {
        int m = localBufferedImage.getRGB(k, j);
        localObject[(i++)] = ((byte)(m >> 24));
      }
    }
    return (byte[])localObject;
  }
  








  protected b x(int paramInt)
  {
    b localb = super.x(paramInt);
    localb.D("/XObject");
    localb.a("/Subtype", "/Image");
    localb.a("/ColorSpace", "/DeviceGray");
    localb.a("/BitsPerComponent", Integer.valueOf(8));
    localb.a("/Width", Integer.valueOf(this.bI));
    localb.a("/Height", Integer.valueOf(this.bJ));
    return localb;
  }
}
