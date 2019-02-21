package a.c;

import a.c.c.a;
import a.c.c.c;
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
  int bI;
  int bJ;
  private RenderingHints bK;
  private Paint bL = Color.WHITE;
  
  private Color bM = Color.WHITE;
  
  private Color bN = Color.WHITE;
  
  private Composite bO = AlphaComposite.getInstance(
    3, 1.0F);
  
  private Stroke bP = new BasicStroke(1.0F);
  
  private AffineTransform bQ = new AffineTransform();
  

  private Shape bR = null;
  
  private Font bd = new Font("SansSerif", 0, 12);
  

  private BufferedImage bS = new BufferedImage(10, 10, 
    1);
  




  private Line2D bT;
  




  Rectangle2D bU;
  



  private RoundRectangle2D bV;
  



  private Ellipse2D bW;
  



  private Arc2D bX;
  



  private j bY;
  



  private GraphicsConfiguration bZ;
  



  private final FontRenderContext ca = new FontRenderContext(
    null, false, true);
  








  public m(j paramj, int paramInt1, int paramInt2)
  {
    this(paramj, paramInt1, paramInt2, false);
  }
  












  public m(j paramj, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a.a(paramj, "gs");
    this.bI = paramInt1;
    this.bJ = paramInt2;
    this.bK = new RenderingHints(RenderingHints.KEY_ANTIALIASING, 
      RenderingHints.VALUE_ANTIALIAS_ON);
    this.bY = paramj;
    
    if (!paramBoolean) {
      this.bY.a(AffineTransform.getTranslateInstance(0.0D, 
        paramInt2));
      this.bY.a(AffineTransform.getScaleInstance(1.0D, -1.0D));
    }
    this.bY.c(aW());
    this.bY.a(aR());
    this.bY.b(aR());
    this.bY.a(aU());
  }
  






  public Graphics aP()
  {
    m localm = new m(this.bY, this.bI, 
      this.bJ, true);
    localm.a(aV());
    localm.b(aY());
    localm.e(bb());
    localm.a(aQ());
    localm.c(aR());
    localm.a(aT());
    localm.b(aU());
    localm.d(aW());
    localm.d(aS());
    return localm;
  }
  








  public Paint aQ()
  {
    return this.bL;
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
    this.bL = paramPaint;
    Object localObject; if ((paramPaint instanceof GradientPaint)) {
      localObject = (GradientPaint)paramPaint;
      this.bY.a((GradientPaint)localObject);
      this.bY.b((GradientPaint)localObject);
    } else if ((paramPaint instanceof RadialGradientPaint)) {
      localObject = (RadialGradientPaint)paramPaint;
      this.bY.a((RadialGradientPaint)localObject);
      this.bY.b((RadialGradientPaint)localObject);
    }
  }
  









  public Color aR()
  {
    return this.bM;
  }
  









  public void c(Color paramColor)
  {
    if ((paramColor == null) || (this.bL.equals(paramColor))) {
      return;
    }
    this.bM = paramColor;
    this.bL = paramColor;
    this.bY.a(paramColor);
    this.bY.b(paramColor);
  }
  








  public Color aS()
  {
    return this.bN;
  }
  











  public void d(Color paramColor)
  {
    this.bN = paramColor;
  }
  







  public Composite aT()
  {
    return this.bO;
  }
  







  public void a(Composite paramComposite)
  {
    a.a(paramComposite, "comp");
    this.bO = paramComposite;
    if ((paramComposite instanceof AlphaComposite)) {
      AlphaComposite localAlphaComposite = (AlphaComposite)paramComposite;
      this.bY.a(localAlphaComposite);
    } else {
      this.bY.a(null);
    }
  }
  







  public Stroke aU()
  {
    return this.bP;
  }
  








  public void b(Stroke paramStroke)
  {
    a.a(paramStroke, "s");
    if (this.bP.equals(paramStroke)) {
      return;
    }
    this.bP = paramStroke;
    this.bY.a(paramStroke);
  }
  











  public Object a(RenderingHints.Key paramKey)
  {
    return this.bK.get(paramKey);
  }
  









  public void a(RenderingHints.Key paramKey, Object paramObject)
  {
    this.bK.put(paramKey, paramObject);
  }
  









  public RenderingHints aV()
  {
    return (RenderingHints)this.bK.clone();
  }
  







  public void a(Map<?, ?> paramMap)
  {
    this.bK.clear();
    this.bK.putAll(paramMap);
  }
  





  public void b(Map<?, ?> paramMap)
  {
    this.bK.putAll(paramMap);
  }
  
  private Shape b(Shape paramShape) {
    Shape localShape = paramShape;
    try {
      AffineTransform localAffineTransform = this.bQ.createInverse();
      localShape = localAffineTransform.createTransformedShape(paramShape);
    }
    catch (NoninvertibleTransformException localNoninvertibleTransformException) {}
    
    return localShape;
  }
  










  public void c(Shape paramShape)
  {
    if (!(this.bP instanceof BasicStroke)) {
      d(this.bP.createStrokedShape(paramShape));
      return;
    }
    if ((paramShape instanceof Line2D)) {
      if (this.bR != null) {
        this.bY.aF();
        this.bY.a(b(this.bR));
        this.bY.a((Line2D)paramShape);
        this.bY.aG();
      } else {
        this.bY.a((Line2D)paramShape);
      }
    } else if ((paramShape instanceof Path2D)) {
      if (this.bR != null) {
        this.bY.aF();
        this.bY.a(b(this.bR));
        this.bY.a((Path2D)paramShape);
        this.bY.aG();
      } else {
        this.bY.a((Path2D)paramShape);
      }
    } else {
      c(new GeneralPath(paramShape));
    }
  }
  









  public void d(Shape paramShape)
  {
    if ((paramShape instanceof Path2D)) {
      if (this.bR != null) {
        this.bY.aF();
        this.bY.a(b(this.bR));
        this.bY.b((Path2D)paramShape);
        this.bY.aG();
      } else {
        this.bY.b((Path2D)paramShape);
      }
    } else {
      d(new GeneralPath(paramShape));
    }
  }
  







  public Font aW()
  {
    return this.bd;
  }
  







  public void d(Font paramFont)
  {
    if ((paramFont == null) || (this.bd.equals(paramFont))) {
      return;
    }
    this.bd = paramFont;
    this.bY.c(paramFont);
  }
  







  public FontMetrics e(Font paramFont)
  {
    return this.bS.createGraphics().getFontMetrics(paramFont);
  }
  







  public FontRenderContext aX()
  {
    return this.ca;
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
    if (this.bR != null) {
      this.bY.aF();
      this.bY.a(b(this.bR));
    }
    



    if (!p.ch.equals(this.bK.get(p.cf))) {
      this.bY.a(paramString, paramFloat1, paramFloat2);
    } else {
      AttributedString localAttributedString = new AttributedString(paramString, 
        this.bd.getAttributes());
      a(localAttributedString.getIterator(), paramFloat1, paramFloat2);
    }
    
    if (this.bR != null) {
      this.bY.aG();
    }
  }
  









  public void a(AttributedCharacterIterator paramAttributedCharacterIterator, int paramInt1, int paramInt2)
  {
    a(paramAttributedCharacterIterator, paramInt1, paramInt2);
  }
  












  public void a(AttributedCharacterIterator paramAttributedCharacterIterator, float paramFloat1, float paramFloat2)
  {
    TextLayout localTextLayout = new TextLayout(paramAttributedCharacterIterator, aX());
    localTextLayout.draw(this, paramFloat1, paramFloat2);
  }
  







  public void a(GlyphVector paramGlyphVector, float paramFloat1, float paramFloat2)
  {
    d(paramGlyphVector.getOutline(paramFloat1, paramFloat2));
  }
  









  public void c(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2);
  }
  






  public void a(double paramDouble1, double paramDouble2)
  {
    AffineTransform localAffineTransform = aY();
    localAffineTransform.translate(paramDouble1, paramDouble2);
    b(localAffineTransform);
  }
  





  public void d(double paramDouble)
  {
    AffineTransform localAffineTransform = aY();
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
    AffineTransform localAffineTransform = aY();
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
    AffineTransform localAffineTransform = aY();
    localAffineTransform.concatenate(paramAffineTransform);
    b(localAffineTransform);
  }
  







  public AffineTransform aY()
  {
    return (AffineTransform)this.bQ.clone();
  }
  








  public void b(AffineTransform paramAffineTransform)
  {
    if (paramAffineTransform == null) {
      this.bQ = new AffineTransform();
    } else {
      this.bQ = new AffineTransform(paramAffineTransform);
    }
    this.bY.b(this.bQ);
  }
  






  public boolean a(Rectangle paramRectangle, Shape paramShape, boolean paramBoolean)
  {
    Shape localShape;
    




    if (paramBoolean) {
      localShape = this.bQ.createTransformedShape(
        this.bP.createStrokedShape(paramShape));
    } else {
      localShape = this.bQ.createTransformedShape(paramShape);
    }
    if (!paramRectangle.getBounds2D().intersects(localShape.getBounds2D())) {
      return false;
    }
    Area localArea1 = new Area(paramRectangle);
    Area localArea2 = new Area(localShape);
    localArea1.intersect(localArea2);
    return !localArea1.isEmpty();
  }
  





  public GraphicsConfiguration aZ()
  {
    if (this.bZ == null) {
      this.bZ = new n(this.bI, 
        this.bJ);
    }
    return this.bZ;
  }
  








  public void ba() {}
  







  public void e(Color paramColor) {}
  







  public Shape bb()
  {
    if (this.bR == null) {
      return null;
    }
    try
    {
      AffineTransform localAffineTransform = this.bQ.createInverse();
      return localAffineTransform.createTransformedShape(this.bR);
    } catch (NoninvertibleTransformException localNoninvertibleTransformException) {}
    return null;
  }
  









  public void e(Shape paramShape)
  {
    this.bR = this.bQ.createTransformedShape(paramShape);
  }
  













  public Rectangle bc()
  {
    Shape localShape = bb();
    return localShape != null ? localShape.getBounds() : null;
  }
  













  public void f(Shape paramShape)
  {
    if (this.bR == null) {
      e(paramShape);
      return;
    }
    Shape localShape = this.bQ.createTransformedShape(paramShape);
    if (!localShape.intersects(this.bR.getBounds2D())) {
      e(new Rectangle2D.Double());
    } else {
      Area localArea1 = new Area(localShape);
      Area localArea2 = new Area(this.bR);
      localArea1.intersect(localArea2);
      this.bR = new Path2D.Double(localArea1);
    }
  }
  









  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    h(paramInt1, paramInt2, paramInt3, paramInt4);
    f(this.bU);
  }
  











  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    e(new Rectangle(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  









  public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.bT == null) {
      this.bT = new Line2D.Double(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      this.bT.setLine(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    c(this.bT);
  }
  








  public void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.bU == null) {
      this.bU = new Rectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      this.bU.setRect(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    d(this.bU);
  }
  












  public void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (aS() == null) {
      return;
    }
    Paint localPaint = aQ();
    a(aS());
    d(paramInt1, paramInt2, paramInt3, paramInt4);
    a(localPaint);
  }
  














  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    f(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(this.bV);
  }
  











  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    f(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    d(this.bV);
  }
  











  public void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    i(paramInt1, paramInt2, paramInt3, paramInt4);
    c(this.bW);
  }
  










  public void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    i(paramInt1, paramInt2, paramInt3, paramInt4);
    d(this.bW);
  }
  
















  public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    g(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(this.bX);
  }
  
















  public void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    g(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    d(this.bX);
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
    AffineTransform localAffineTransform = aY();
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
    BufferedImage localBufferedImage = c.a(paramRenderedImage);
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
    if (this.bR != null) {
      this.bY.aF();
      this.bY.a(b(this.bR));
      this.bY.a(paramImage, paramInt1, paramInt2, paramInt3, paramInt4);
      this.bY.aG();
    } else {
      this.bY.a(paramImage, paramInt1, paramInt2, paramInt3, paramInt4);
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
    Paint localPaint = aQ();
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
    Paint localPaint = aQ();
    a(paramColor);
    d(paramInt1, paramInt2, paramInt3 - paramInt1, paramInt4 - paramInt2);
    a(localPaint);
    return a(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramImageObserver);
  }
  










  public void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
  










  public void bd() {}
  










  private void h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.bU == null) {
      this.bU = new Rectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      this.bU.setRect(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  












  private void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (this.bV == null) {
      this.bV = new RoundRectangle2D.Double(paramInt1, paramInt2, paramInt3, paramInt4, 
        paramInt5, paramInt6);
    } else {
      this.bV.setRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, 
        paramInt5, paramInt6);
    }
  }
  









  private void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.bW == null) {
      this.bW = new Ellipse2D.Double(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      this.bW.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  












  private void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (this.bX == null) {
      this.bX = new Arc2D.Double(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 
        paramInt6, 0);
    } else {
      this.bX.setArc(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, 
        0);
    }
  }
}
