package com.c.bb;


public enum d
{
  
    FUNCTION(1),
    
    /** Axial shading. */
    AXIAL(2),
    
    /** Radial shading. */
    RADIAL(3),
    
    FREE_FORM(4),
    
    LATTICE_FORM(5),
    
    COONS(6),
    
    TENSOR(7);
	
  private int X;
  


  private d(int paramInt1)
  {
    this.X = paramInt1;
  }
  




  public int S()
  {
    return this.X;
  }
}
