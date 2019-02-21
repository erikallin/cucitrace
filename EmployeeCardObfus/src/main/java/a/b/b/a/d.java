package a.b.b.a;

import java.util.Random;




public class d
{
  private static final Random aH = new Random();
  
  public static int b(int paramInt1, int paramInt2)
  {
    return paramInt1 + (int)Math.round(aH.nextDouble() * (paramInt2 - paramInt1));
  }
  
  public static <T> T a(T[] paramArrayOfT) {
    return paramArrayOfT[b(0, paramArrayOfT.length - 1)];
  }
}
