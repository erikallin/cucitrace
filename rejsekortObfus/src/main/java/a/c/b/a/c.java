package a.c.b.a;

import java.util.Random;




public class c
{
  private static final Random d = new Random();
  
  public static int e(int paramInt1, int paramInt2)
  {
    return paramInt1 + (int) Math.round(d.nextDouble() * (paramInt2 - paramInt1));
  }
  
  public static <T> T a(T[] paramArrayOfT) {
    return paramArrayOfT[e(0, paramArrayOfT.length - 1)];
  }
}
