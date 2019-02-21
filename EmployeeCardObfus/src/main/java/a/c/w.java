package a.c;

import a.c.b.c;
import a.c.c.a;
import java.awt.geom.AffineTransform;









































public abstract class w
  extends r
{
  protected b aK;
  
  public static final class a
    extends w
  {
    private c cD;
    
    public a(int paramInt, c paramc, AffineTransform paramAffineTransform)
    {
      super();
      this.aK.a("/PatternType", "2");
      this.aK.a("/Matrix", t.e(paramAffineTransform));
      a(paramc);
    }
    




    public c bx()
    {
      return this.cD;
    }
    




    public void a(c paramc)
    {
      a.a(paramc, "shading");
      this.cD = paramc;
      this.aK.a("/Shading", this.cD);
    }
  }
  






  protected w(int paramInt)
  {
    super(paramInt);
    this.aK = new b("/Pattern");
  }
  






  public byte[] au()
  {
    return this.aK.as();
  }
}
