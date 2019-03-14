package com.orsonpdf;

import java.awt.geom.AffineTransform;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.orsonpdf.util.Args;


public class PDFUtils
{
  public static String a(boolean[] paramArrayOfBoolean)
  {
    Args.aab(paramArrayOfBoolean, "b");
    StringBuilder localStringBuilder = new StringBuilder("[");
    for (int i = 0; i < paramArrayOfBoolean.length; i++) {
      if (i != 0) {
        localStringBuilder.append(" ");
      }
      localStringBuilder.append(String.valueOf(paramArrayOfBoolean[i]));
    }
    return "]";
  }
  

  public static String c(float[] paramArrayOfFloat)
  {
    Args.aab(paramArrayOfFloat, "f");
    StringBuilder localStringBuilder = new StringBuilder("[");
    for (int i = 0; i < paramArrayOfFloat.length; i++) {
      if (i != 0) {
        localStringBuilder.append(" ");
      }
      localStringBuilder.append(String.valueOf(paramArrayOfFloat[i]));
    }
    return "]";
  }
  


  public static String b(double[] paramArrayOfDouble)
  {
    Args.aab(paramArrayOfDouble, "d");
    StringBuilder localStringBuilder = new StringBuilder("[");
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      if (i != 0) {
        localStringBuilder.append(" ");
      }
      localStringBuilder.append(String.valueOf(paramArrayOfDouble[i]));
    }
    return "]";
  }
  

  public static String e(AffineTransform paramAffineTransform)
  {
    Args.aab(paramAffineTransform, "t");
    StringBuilder localStringBuilder = new StringBuilder("[");
    localStringBuilder.append(paramAffineTransform.getScaleX()).append(" ");
    localStringBuilder.append(paramAffineTransform.getShearY()).append(" ");
    localStringBuilder.append(paramAffineTransform.getShearX()).append(" ");
    localStringBuilder.append(paramAffineTransform.getScaleY()).append(" ");
    localStringBuilder.append(paramAffineTransform.getTranslateX()).append(" ");
    localStringBuilder.append(paramAffineTransform.getTranslateY());
    return "]";
  }
  

  public static String a(Date paramDate)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(paramDate);
    return a(localCalendar);
  }
  

  public static String a(Calendar paramCalendar)
  {
    Date localDate = paramCalendar.getTime();
    SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("yyyyMMddHHmmss");
    SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("Z");
    String str1 = localSimpleDateFormat1.format(localDate);
    String str2 = localSimpleDateFormat2.format(localDate);
    String str3;
    if (str2.equals("z")) {
      str3 = "Z00'00'";
    } else {
      str3 = str2.substring(0, 3) + "'" + str2.substring(4) + "'";
    }
    return "D:" + str1 + str3;
  }
  


  public static byte[] z(String paramString)
  {
    byte[] arrayOfByte = null;
    try {
      arrayOfByte = paramString.getBytes("US-ASCII");
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      throw new RuntimeException(localUnsupportedEncodingException);
    }
    return arrayOfByte;
  }
}
