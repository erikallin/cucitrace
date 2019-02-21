package a.c.b.a;

import a.c.a.j;
import java.util.ArrayList;
import java.util.List;

public class b
{
  private static final String[] dn = { "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", 
    "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234" };
  
  private static int bI() {
    return c.e(150, 312);
  }
  
  private static String bJ() {
    return (String)c.a(dn);
  }
  





  public List<j> x(int paramInt)
  {
    List<j> localArrayList = new ArrayList<j>();
    
    for (int i = 0; i < paramInt; i++) {
      localArrayList.add(bK());
    }
    
    return localArrayList;
  }
  
  private j bK() {
    return new j(bJ(), bI(), false);
  }
}
