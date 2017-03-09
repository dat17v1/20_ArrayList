public class GarbageMan {
  private String name;

  public static void main(String[] args) {
    GarbageMan g1 = new GarbageMan();
    GarbageMan g2 = new GarbageMan();

    GarbageManUnion u = new GarbageManUnion();
    
    // obj.navn . metodenavn(*parametre);
    u.addGarbageMan(g1);
    u.addGarbageMan(g2);
    u.print();
    
    
  }
}