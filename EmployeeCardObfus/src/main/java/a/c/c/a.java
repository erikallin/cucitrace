package a.c.c;















































public class a
{
  public static void a(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("Null '" + paramString + "' argument.");
    }
  }
  









  public static void a(int paramInt, boolean[] paramArrayOfBoolean, String paramString)
  {
    a(paramArrayOfBoolean, "array");
    if (paramArrayOfBoolean.length != paramInt) {
      throw new IllegalArgumentException("Array '" + paramString + 
        "' requires length " + paramInt);
    }
  }
  









  public static void a(int paramInt, double[] paramArrayOfDouble, String paramString)
  {
    a(paramArrayOfDouble, "array");
    if (paramArrayOfDouble.length != paramInt) {
      throw new IllegalArgumentException("Array '" + paramString + 
        "' requires length " + paramInt);
    }
  }
}
