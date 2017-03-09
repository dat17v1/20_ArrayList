import java.util.ArrayList;

public class GarbageManUnion {
  ArrayList<GarbageMan> union = new ArrayList<GarbageMan>();

  // Parameter: Type navn
  public void addGarbageMan(GarbageMan g) {
    union.add(g);
  }
  
  public void print() {
    
    for(int i = 0; i < union.size(); i++) {
      // arraylist-navn.get(4);
      System.out.println(union.get(i));
    }

    
  }
  // GarbageMan[] union = new GarbageMan[5];

}