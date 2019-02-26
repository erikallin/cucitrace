package com.b.util;


public class a
{
  public static void aab(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("Null '" + paramString + "' argument.");
    }
  }
  


  public static void aac(int paramInt, boolean[] paramArrayOfBoolean, String paramString)
  {
    aab(paramArrayOfBoolean, "array");
    if (paramArrayOfBoolean.length != paramInt) {
      throw new IllegalArgumentException("Array '" + paramString + 
        "' requires length " + paramInt);
    }
  }
  

  public static void aad(int paramInt, double[] paramArrayOfDouble, String paramString)
  {
    aab(paramArrayOfDouble, "array");
    if (paramArrayOfDouble.length != paramInt) {
      throw new IllegalArgumentException("Array '" + paramString + 
        "' requires length " + paramInt);
    }
  }
}
