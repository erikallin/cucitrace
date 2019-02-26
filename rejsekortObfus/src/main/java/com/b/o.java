package com.b;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;




public class o extends GraphicsDevice
{
  private String bd;
  GraphicsConfiguration be;
  
  public o(String paramString, GraphicsConfiguration paramGraphicsConfiguration)
  {
    this.bd = paramString;
    this.be = paramGraphicsConfiguration;
  }
  

  public GraphicsConfiguration[] getConfigurations() {
    return new GraphicsConfiguration[] { getDefaultConfiguration() };
  }



  public GraphicsConfiguration getDefaultConfiguration() {
	return this.be;
  }




  public String getIDstring() {
    return this.bd;
  }


  public int getType() {
	  return GraphicsDevice.TYPE_PRINTER;
  }
}
