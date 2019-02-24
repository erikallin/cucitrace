package com.orsonpdf;

import java.awt.RenderingHints;


public final class p
{
  public static final ak bf = new ak(0);
  
  public static final Object bg = "VALUE_DRAW_STRING_TYPE_STANDARD";
  
  public static final Object bh = "VALUE_DRAW_STRING_TYPE_VECTOR";
  

  public static class ak extends RenderingHints.Key
  {
    public ak(int paramInt)
    {
      super(paramInt);
    }
    


	@Override
	public boolean isCompatibleValue(Object arg0) {
	      switch (intKey()) {
	      case 0: 
	        return (arg0 == null) || 
	          (p.bg.equals(arg0)) || 
	          (p.bh.equals(arg0));
	      }
	      throw new RuntimeException("Not expected!");
	}
  }
}
