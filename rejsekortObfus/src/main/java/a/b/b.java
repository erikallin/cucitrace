package a.b;

import java.awt.geom.Rectangle2D;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
















































public class b
{
  private String J;
  private Map I;
  
  public b()
  {
    this(null);
  }
  





  public b(String paramString)
  {
    this.J = paramString;
    this.I = new HashMap();
  }
  




  public String F()
  {
    return this.J;
  }
  




  public void u(String paramString)
  {
    this.J = paramString;
  }
  







  public boolean G()
  {
    return this.I.isEmpty();
  }
  




  public int H()
  {
    return this.I.size();
  }
  





  public void a(String paramString, Object paramObject)
  {
    this.I.put(paramString, paramObject);
  }
  







  public Object v(String paramString)
  {
    return this.I.remove(paramString);
  }
  




  public byte[] I()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    

    try
    {
      localByteArrayOutputStream.write(t.z(J()));
    } catch (IOException localIOException) {
      throw new RuntimeException("Dictionary.toPDFBytes() failed.", localIOException);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  






  public String J()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<< ");
    if (this.J != null) {
      localStringBuilder.append("/Type ").append(this.J).append("\n");
    }
    
    for (Object localObject1 : this.I.keySet()) {
      Object localObject2 = this.I.get(localObject1);
      if (((localObject2 instanceof Number)) || ((localObject2 instanceof String))) {
        localStringBuilder.append(localObject1.toString()).append(" ");
        localStringBuilder.append(localObject2.toString()).append("\n"); } else { Object localObject3;
        if ((localObject2 instanceof r)) {
          localObject3 = (r)localObject2;
          localStringBuilder.append(localObject1.toString()).append(" ");
          localStringBuilder.append(((r)localObject3).aE()).append("\n"); } else { int i;
          if ((localObject2 instanceof String[])) {
            localStringBuilder.append(localObject1.toString()).append(" ");
            localObject3 = (String[])localObject2;
            localStringBuilder.append("[");
            for (i = 0; i < localObject3.length; i++) {
              if (i != 0) {
                localStringBuilder.append(" ");
              }
              localStringBuilder.append(localObject3[i]);
            }
            localStringBuilder.append("]\n");
          } else if ((localObject2 instanceof r[])) {
            localStringBuilder.append(localObject1.toString()).append(" ");
            localObject3 = (r[])localObject2;
            localStringBuilder.append("[");
            for (i = 0; i < localObject3.length; i++) {
              if (i != 0) {
                localStringBuilder.append(" ");
              }
              localStringBuilder.append(localObject3[i].aE());
            }
            localStringBuilder.append("]\n");
          } else if ((localObject2 instanceof Rectangle2D)) {
            localObject3 = (Rectangle2D)localObject2;
            localStringBuilder.append(localObject1.toString()).append(" ");
            localStringBuilder.append("[").append(((Rectangle2D)localObject3).getX()).append(" ");
            localStringBuilder.append(((Rectangle2D)localObject3).getY()).append(" ").append(((Rectangle2D)localObject3).getWidth()).append(" ");
            localStringBuilder.append(((Rectangle2D)localObject3).getHeight()).append("]\n");
          } else if ((localObject2 instanceof b)) {
            localStringBuilder.append(localObject1.toString()).append(" ");
            localObject3 = (b)localObject2;
            localStringBuilder.append(((b)localObject3).J());
          } else if ((localObject2 instanceof float[])) {
            localStringBuilder.append(localObject1.toString()).append(" ");
            localObject3 = (float[])localObject2;
            localStringBuilder.append("[");
            for (i = 0; i < localObject3.length; i++) {
              if (i != 0) {
                localStringBuilder.append(" ");
              }
              localStringBuilder.append(localObject3[i]);
            }
            localStringBuilder.append("]\n");
          }
          else {
            throw new RuntimeException("Unrecognised value type: " + localObject2);
          }
        } } }
    localStringBuilder.append(">>\n");
    return localStringBuilder.toString();
  }
}
