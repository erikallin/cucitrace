package com.orsonpdf;

import java.awt.RenderingHints.Key;
























































public final class p
{
  public static final a cf = new a(0);
  





  public static final Object cg = "VALUE_DRAW_STRING_TYPE_STANDARD";
  





  public static final Object ch = "VALUE_DRAW_STRING_TYPE_VECTOR";
  

  public static class a
    extends RenderingHints.Key
  {
    public a(int paramInt)
    {
      super();
    }
    








    public boolean b(Object paramObject)
    {
      switch (intKey()) {
      case 0: 
        return (paramObject == null) || 
          (p.cg.equals(paramObject)) || 
          (p.ch.equals(paramObject));
      }
      throw new RuntimeException("Not expected!");
    }
  }
}
