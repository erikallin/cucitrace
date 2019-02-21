package a.b;

import a.b.c.a;
import a.b.c.c;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Path2D;
import java.awt.geom.Path2D.Double;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.Map;




































public final class m
  extends Graphics2D
{
  int aI;
  int aJ;
  private RenderingHints aK;
  private Paint aL = Color.WHITE;
  
  private Color aM = Color.WHITE;
  
  private Color aN = Color.WHITE;
  
  private Composite aO = AlphaComposite.getInstance(
    3, 1.0F);
  
  private Stroke aP = new BasicStroke(1.0F);
  
  private AffineTransform aQ = new AffineTransform();
  

  private Shape aR = null;
  
  private Font ad = new Font("SansSerif", 0, 12);
  

  private BufferedImage aS = new BufferedImage(10, 10, 
    1);
  




  private Line2D aT;
  




  Rectangle2D aU;
  



  private RoundRectangle2D aV;
  



  private Ellipse2D aW;
  



  private Arc2D aX;
  



  private j aY;
  



  private GraphicsConfiguration aZ;
  



  private final FontRenderContext ba = new FontRenderContext(
    null, false, true);
  








  public m(j paramj, int paramInt1, int paramInt2)
  {
    this(paramj, paramInt1, paramInt2, false);
  }
  












  public m(j paramj, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a.a(paramj, "gs");
    this.aI = paramInt1;
    this.aJ = paramInt2;
    this.aK = new RenderingHints(RenderingHints.KEY_ANTIALIASING, 
      RenderingHints.VALUE_ANTIALIAS_ON);
    this.aY = paramj;
    
    if (!paramBoolean) {
      this.aY.a(AffineTransform.getTranslateInstance(0.0D, 
        paramInt2));
      this.aY.a(AffineTransform.getScaleInstance(1.0D, -1.0D));
    }
    this.aY.c(am());
    this.aY.a(ah());
    this.aY.b(ah());
    this.aY.a(ak());
  }
  






  public Graphics af()
  {
    m localm = new m(this.aY, this.aI, 
      this.aJ, true);
    localm.a(al());
    localm.b(ao());
    localm.e(ar());
    localm.a(ag());
    localm.c(ah());
    localm.a(aj());
    localm.b(ak());
    localm.d(am());
    localm.d(ai());
    return localm;
  }
  








  public Paint ag()
  {
    return this.aL;
  }
  











  public void a(Paint paramPaint)
  {
    if (paramPaint == null) {
      return;
    }
    if ((paramPaint instanceof Color)) {
      c((Color)paramPaint);
      return;
    }
    this.aL = paramPaint;
    Object localObject; if ((paramPaint instanceof GradientPaint)) {
      localObject = (GradientPaint)paramPaint;
      this.aY.a((GradientPaint)localObject);
      this.aY.b((GradientPaint)localObject);
    } else if ((paramPaint instanceof RadialGradientPaint)) {
      localObject = (RadialGradientPaint)paramPaint;
      this.aY.a((RadialGradientPaint)localObject);
      this.aY.b((RadialGradientPaint)localObject);
    }
  }
  









  public Color ah()
  {
    return this.aM;
  }
  









  public void c(Color paramColor)
  {
    if ((paramColor == null) || (this.aL.equals(paramColor))) {
      return;
    }
    this.aM = paramColor;
    this.aL = paramColor;
    this.aY.a(paramColor);
    this.aY.b(paramColor);
  }
  








  public Color ai()
  {
    return this.aN;
  }
  











  public void d(Color paramColor)
  {
    this.aN = paramColor;
  }
  







  public Composite aj()
  {
    return this.aO;
  }
  







  public void a(Composite paramComposite)
  {
    a.a(paramComposite, "comp");
    this.aO = paramComposite;
    if ((paramComposite instanceof AlphaComposite)) {
      AlphaComposite localAlphaComposite = (AlphaComposite)paramComposite;
      this.aY.a(localAlphaComposite);
    } else {
      this.aY.aa(null);
    }
  }
  







  public Stroke ak()
  {
    return this.aP;
  }
  








  public void b(Stroke paramStroke)
  {
    a.a(paramStroke, "s");
    if (this.aP.equals(paramStroke)) {
      return;
    }
    this.aP = paramStroke;
    this.aY.a(paramStroke);
  }
  











  public Object a(RenderingHints.Key paramKey)
  {
    return this.aK.get(paramKey);
  }
  









  public void a(RenderingHints.Key paramKey, Object paramObject)
  {
    this.aK.put(paramKey, paramObject);
  }
  









  public RenderingHints al()
  {
    return (RenderingHints)this.aK.clone();
  }
  







  public void a(Map<?, ?> paramMap)
  {
    this.aK.clear();
    this.aK.putAll(paramMap);
  }
  





  public void b(Map<?, ?> paramMap)
  {
    this.aK.putAll(paramMap);
  }
  
  private Shape b(Shape paramShape) {
    Shape localShape = paramShape;
    try {
      AffineTransform localAffineTransform = this.aQ.createInverse();
      localShape = localAffineTransform.createTransformedShape(paramShape);
    }
    catch (NoninvertibleTransformException localNoninvertibleTransformException) {}
    
    return localShape;
  }
  










  public void c(Shape paramShape)
  {
    if (!(this.aP instanceof BasicStroke)) {
      d(this.aP.createStrokedShape(paramShape));
      return;
    }
    if ((paramShape instanceof Line2D)) {
      if (this.aR != null) {
        this.aY.V();
        this.aY.a(b(this.aR));
        this.aY.a((Line2D)paramShape);
        this.aY.W();
      } else {
        this.aY.a((Line2D)paramShape);
      }
    } else if ((paramShape instanceof Path2D)) {
      if (this.aR != null) {
        this.aY.V();
        this.aY.a(b(this.aR));
        this.aY.a((Path2D)paramShape);
        this.aY.W();
      } else {
        this.aY.a((Path2D)paramShape);
      }
    } else {
      c(new GeneralPath(paramShape));
    }
  }
  









  public void d(Shape paramShape)
  {
    if ((paramShape instanceof Path2D)) {
      if (this.aR != null) {
        this.aY.V();
        this.aY.a(b(this.aR));
        this.aY.b((Path2D)paramShape);
        this.aY.W();
      } else {
        this.aY.b((Path2D)paramShape);
      }
    } else {
      d(new GeneralPath(paramShape));
    }
  }
  







  public Font am()
  {
    return this.ad;
  }
  







  public void d(Font paramFont)
  {
    if ((paramFont == null) || (this.ad.equals(paramFont))) {
      return;
    }
    this.ad = paramFont;
    this.aY.c(paramFont);
  }
  







  public FontMetrics e(Font paramFont)
  {
    return this.aS.createGraphics().getFontMetrics(paramFont);
  }
  







  public FontRenderContext an()
  {
    return this.ba;
  }
  










  public void a(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1, paramInt2);
  }
  








  public void a(String paramString, float paramFloat1, float paramFloat2)
  {
    if (paramString == null) {
      throw new NullPointerException("Null 'str' argument.");
    }
    if (this.aR != null) {
      this.aY.V();
      this.aY.a(b(this.aR));
    }
    



    if (!p.bh.equals(this.aK.get(p.bf))) {
      this.aY.a(paramString, paramFloat1, paramFloat2);
    } else {
      AttributedString localAttributedString = new AttributedString(paramString, 
        this.ad.getAttributes());
      a(localAttributedString.getIterator(), paramFloat1, paramFloat2);
    }
    
    if (this.aR != null) {
      this.aY.W();
    }
  }
  









  public void a(AttributedCharacterIterator paramAttributedCharacterIterator, int paramInt1, int paramInt2)
  {
    a(paramAttributedCharacterIterator, paramInt1, paramInt2);
  }
  












  public void a(AttributedCharacterIterator paramAttributedCharacterIterator, float paramFloat1, float paramFloat2)
  {
    TextLayout localTextLayout = new TextLayout(paramAttributedCharacterIterator, an());
    localTextLayout.draw(this, paramFloat1, paramFloat2);
  }
  







  public void a(GlyphVector paramGlyphVector, float paramFloat1, float paramFloat2)
  {
    d(paramGlyphVector.getOutline(paramFloat1, paramFloat2));
  }
  









  public void a(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2);
  }
  






  public void a(double paramDouble1, double paramDouble2)
  {
    AffineTransform localAffineTransform = ao();
    localAffineTransform.translate(paramDouble1, paramDouble2);
    b(localAffineTransform);
  }
  





  public void d(double paramDouble)
  {
    AffineTransform localAffineTransform = ao();
    localAffineTransform.rotate(paramDouble);
    b(localAffineTransform);
  }
  







  public void a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    a(paramDouble2, paramDouble3);
    d(paramDouble1);
    a(-paramDouble2, -paramDouble3);
  }
  






  public void b(double paramDouble1, double paramDouble2)
  {
    AffineTransform localAffineTransform = ao();
    localAffineTransform.scale(paramDouble1, paramDouble2);
    b(localAffineTransform);
  }
  











  public void c(double paramDouble1, double paramDouble2)
  {
    AffineTransform localAffineTransform = AffineTransform.getShearInstance(paramDouble1, paramDouble2);
    d(localAffineTransform);
  }
  





  public void d(AffineTransform paramAffineTransform)
  {
    AffineTransform localAffineTransform = ao();
    localAffineTransform.concatenate(paramAffineTransform);
    b(localAffineTransform);
  }
  







  public AffineTransform ao()
  {
    return (AffineTransform)this.aQ.clone();
  }
  








  public void b(AffineTransform paramAffineTransform)
  {
    if (paramAffineTransform == null) {
      this.aQ = new AffineTransform();
    } else {
      this.aQ = new AffineTransform(paramAffineTransform);
    }
    this.aY.b(this.aQ);
  }
  






  public boolean a(Rectangle paramRectangle, Shape paramShape, boolean paramBoolean)
  {
    Shape localShape;
    




    if (paramBoolean) {
      localShape = this.aQ.createTransformedShape(
        this.aP.createStrokedShape(paramShape));
    } else {
      localShape = this.aQ.createTransformedShape(paramShape);
    }
    if (!paramRectangle.getBounds2D().intersects(localShape.getBounds2D())) {
      return false;
    }
    Area localArea1 = new Area(paramRectangle);
    Area localArea2 = new Area(localShape);
    localArea1.intersect(localArea2);
    return !localArea1.isEmpty();
  }
  





  public GraphicsConfiguration ap()
  {
    if (this.aZ == null) {
      this.aZ = new n(this.aI, 
        this.aJ);
    }
    return this.aZ;
  }
  








  public void aq() {}
  







  public void e(Color paramColor) {}
  







  public Shape ar()
  {
    if (this.aR == null) {
      return null;
    }
    try
    {
      AffineTransform localAffineTransform = this.aQ.createInverse();
      return localAffineTransform.createTransformedShape(this.aR);
    } catch (NoninvertibleTransformException localNoninvertibleTransformException) {}
    return null;
  }
  









  public void e(Shape paramShape)
  {
    this.aR = this.aQ.createTransformedShape(paramShape);
  }
  













  public Rectangle as()
  {
    Shape localShape = ar();
    return localShape != null ? localShape.getBounds() : null;
  }
  













  public void f(Shape paramShape)
  {
    if (this.aR == null) {
      e(paramShape);
      return;
    }
    Shape localShape = this.aQ.createTransformedShape(paramShape);
    if (!localShape.intersects(this.aR.getBounds2D())) {
      e(new Rectangle2D.Double());
    } else {
      Area localArea1 = new Area(localShape);
      Area localArea2 = new Area(this.aR);
      localArea1.intersect(localArea2);
      this.aR = new Path2D.Double(localArea1);
    }
  }
  









  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    h(paramInt1, paramInt2, paramInt3, paramInt4);
    f(this.aU);
  }
  











  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    e(new Rectangle(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  









  public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.aT == null) {
      this.aT = new Line2D.Double(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      this.aT.setLine(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    c(this.aT);
  }
  








  public void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.aU == null) {
      this.aU = new Rectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      this.aU.setRect(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    d(this.aU);
  }
  












  public void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (ai() == null) {
      return;
    }
    Paint localPaint = ag();
    a(ai());
    d(paramInt1, paramInt2, paramInt3, paramInt4);
    a(localPaint);
  }
  














  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    f(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(this.aV);
  }
  











  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    f(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    d(this.aV);
  }
  











  public void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    i(paramInt1, paramInt2, paramInt3, paramInt4);
    c(this.aW);
  }
  










  public void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    i(paramInt1, paramInt2, paramInt3, paramInt4);
    d(this.aW);
  }
  
















  public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    g(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(this.aX);
  }
  
















  public void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    g(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    d(this.aX);
  }
  








  public void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    GeneralPath localGeneralPath = c.a(paramArrayOfInt1, paramArrayOfInt2, paramInt, 
      false);
    c(localGeneralPath);
  }
  









  public void b(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    GeneralPath localGeneralPath = c.a(paramArrayOfInt1, paramArrayOfInt2, paramInt, 
      true);
    c(localGeneralPath);
  }
  









  public void c(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    GeneralPath localGeneralPath = c.a(paramArrayOfInt1, paramArrayOfInt2, paramInt, 
      true);
    d(localGeneralPath);
  }
  











  public boolean a(Image paramImage, AffineTransform paramAffineTransform, ImageObserver paramImageObserver)
  {
    AffineTransform localAffineTransform = ao();
    if (paramAffineTransform != null) {
      d(paramAffineTransform);
    }
    boolean bool = a(paramImage, 0, 0, paramImageObserver);
    if (paramAffineTransform != null) {
      b(localAffineTransform);
    }
    return bool;
  }
  









  public void a(BufferedImage paramBufferedImage, BufferedImageOp paramBufferedImageOp, int paramInt1, int paramInt2)
  {
    BufferedImage localBufferedImage = paramBufferedImageOp.filter(paramBufferedImage, null);
    a(localBufferedImage, new AffineTransform(1.0F, 0.0F, 0.0F, 1.0F, paramInt1, paramInt2), null);
  }
  






  public void a(RenderedImage paramRenderedImage, AffineTransform paramAffineTransform)
  {
    BufferedImage localBufferedImage = c.aa(paramRenderedImage);
    a(localBufferedImage, paramAffineTransform, null);
  }
  







  public void a(RenderableImage paramRenderableImage, AffineTransform paramAffineTransform)
  {
    RenderedImage localRenderedImage = paramRenderableImage.createDefaultRendering();
    a(localRenderedImage, paramAffineTransform);
  }
  











  public boolean a(Image paramImage, int paramInt1, int paramInt2, ImageObserver paramImageObserver)
  {
    int i = paramImage.getWidth(paramImageObserver);
    if (i < 0) {
      return false;
    }
    int j = paramImage.getHeight(paramImageObserver);
    if (j < 0) {
      return false;
    }
    return a(paramImage, paramInt1, paramInt2, i, j, paramImageObserver);
  }
  















  public boolean a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, ImageObserver paramImageObserver)
  {
    if (this.aR != null) {
      this.aY.V();
      this.aY.a(b(this.aR));
      this.aY.a(paramImage, paramInt1, paramInt2, paramInt3, paramInt4);
      this.aY.W();
    } else {
      this.aY.a(paramImage, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    return true;
  }
  













  public boolean a(Image paramImage, int paramInt1, int paramInt2, Color paramColor, ImageObserver paramImageObserver)
  {
    int i = paramImage.getWidth(null);
    if (i < 0) {
      return false;
    }
    int j = paramImage.getHeight(null);
    if (j < 0) {
      return false;
    }
    return a(paramImage, paramInt1, paramInt2, i, j, paramColor, paramImageObserver);
  }
  
















  public boolean a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor, ImageObserver paramImageObserver)
  {
    Paint localPaint = ag();
    a(paramColor);
    d(paramInt1, paramInt2, paramInt3, paramInt4);
    a(localPaint);
    return a(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramImageObserver);
  }
  



















  public boolean a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, ImageObserver paramImageObserver)
  {
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    BufferedImage localBufferedImage = new BufferedImage(i, j, 
      2);
    Graphics2D localGraphics2D = localBufferedImage.createGraphics();
    localGraphics2D.drawImage(paramImage, 0, 0, i, j, paramInt5, paramInt6, paramInt7, paramInt8, null);
    return a(localBufferedImage, paramInt1, paramInt2, null);
  }
  























  public boolean a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Color paramColor, ImageObserver paramImageObserver)
  {
    Paint localPaint = ag();
    a(paramColor);
    d(paramInt1, paramInt2, paramInt3 - paramInt1, paramInt4 - paramInt2);
    a(localPaint);
    return a(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramImageObserver);
  }
  










  public void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
  










  public void at() {}
  










  private void h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.aU == null) {
      this.aU = new Rectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      this.aU.setRect(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  












  private void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (this.aV == null) {
      this.aV = new RoundRectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4, 
        paramInt5, paramInt6);
    } else {
      this.aV.setRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, 
        paramInt5, paramInt6);
    }
  }
  









  private void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.aW == null) {
      this.aW = new Ellipse2D.Double(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      this.aW.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  












  private void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (this.aX == null) {
      this.aX = new Arc2D.Double(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 
        paramInt6, 0);
    } else {
      this.aX.setArc(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, 
        0);
    }
  }
}
