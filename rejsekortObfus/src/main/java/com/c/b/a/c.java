package com.c.b.a;

import java.util.Random;




public class c
{
  private static final Random d;
  
  static {
	  d = new Random();
  }
  
  public static int d(int paramInt1, int paramInt2)
  {
    return paramInt1 + (int)Math.round(d.nextDouble() * (paramInt2 - paramInt1));
  }
  
  public static <T> T a(T[] paramArrayOfT) {
    return paramArrayOfT[d(0, paramArrayOfT.length - 1)];
  }
}
