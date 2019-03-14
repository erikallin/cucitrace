package com.orsonpdf;

import java.awt.geom.Rectangle2D;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Dictionary
{
  private String J;
  private Map<String, Object> I;
  
  public Dictionary()
  {
    this(null);
  }
  


  public Dictionary(String paramString)
  {
    this.J = paramString;
    this.I = new HashMap<String, Object>();
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
      localByteArrayOutputStream.write(PDFUtils.z(J()));
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
      
      if (localObject2 instanceof Number || localObject2 instanceof String) {
        localStringBuilder.append(localObject1.toString()).append(" ");
        localStringBuilder.append(localObject2.toString()).append("\n"); 
      
      } else if (localObject2 instanceof PDFObject) {
    	  PDFObject localObject3 = (PDFObject) localObject2;
          localStringBuilder.append(localObject1.toString()).append(" ");
          localStringBuilder.append(((PDFSoftMaskImage)localObject3).aE()).append("\n"); 
      
      } else if (localObject2 instanceof String[]) {
          localStringBuilder.append(localObject1.toString()).append(" ");
          String[] localObject4 = (String[]) localObject2;
          localStringBuilder.append("[");
          for (int i = 0; i < localObject4.length; i++) {
            if (i != 0) {
              localStringBuilder.append(" ");
            }
            localStringBuilder.append(localObject4[i]);
          }
          localStringBuilder.append("]\n");
          
    	  } else if ((localObject2 instanceof PDFSoftMaskImage[])) {
            localStringBuilder.append(localObject1.toString()).append(" ");
            PDFSoftMaskImage[] localObject4 = (PDFSoftMaskImage[])localObject2;
            localStringBuilder.append("[");
            for (int i = 0; i < localObject4.length; i++) {
              if (i != 0) {
                localStringBuilder.append(" ");
              }
              localStringBuilder.append(localObject4[i].aE());
            }
            localStringBuilder.append("]\n");
          
          } else if ((localObject2 instanceof Rectangle2D)) {
        	Rectangle2D localObject3 = (Rectangle2D) localObject2;
            localStringBuilder.append(localObject1.toString()).append(" ");
            localStringBuilder.append("[").append((localObject3).getX()).append(" ");
            localStringBuilder.append(localObject3.getY()).append(" ").append(((Rectangle2D)localObject3).getWidth()).append(" ");
            localStringBuilder.append(localObject3.getHeight()).append("]\n");
          
          } else if ((localObject2 instanceof Dictionary)) {
            localStringBuilder.append(localObject1.toString()).append(" ");
            Dictionary localObject3 = (Dictionary) localObject2;
            localStringBuilder.append(((Dictionary)localObject3).J());
          
          } else if ((localObject2 instanceof float[])) {
            localStringBuilder.append(localObject1.toString()).append(" ");
            float[] localObject3 = (float[]) localObject2;
            localStringBuilder.append("[");
            for (int i = 0; i < localObject3.length; i++) {
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
        }
    localStringBuilder.append(">>\n");
    return localStringBuilder.toString();
  }

}
