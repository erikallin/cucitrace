package com.orsonpdf;





public enum FunctionType
{
  
  /** PDF function type 0. */
  SAMPLED(0),
    
  /** PDF function type 2. */
  EXPONENTIAL_INTERPOLATION(2),
    
  /** PDF function type 3. */
  STITCHING(3),
    
  /** PDF function type 4. */
  POSTSCRIPT_CALCULATOR(4);
	
  private int n;
  

  private FunctionType(int n)
  {
    this.n = n;
  }
  




  public int S()
  {
    return this.n;
  }
}
