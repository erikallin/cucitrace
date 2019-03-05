package com.orsonpdf.filter;

public abstract interface Filter
{
  public abstract FilterType aP();
  
  public abstract byte[] a(byte[] paramArrayOfByte);
}
