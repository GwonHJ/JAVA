class X {
 X() { System.out.println("default no-argX"); }
  public String toString() { return new String("X"); }
  public int comp(int n) { return n*2; }
  public int comp2(int n) { return n*4; }
 }
class Y extends X {
 Y() { System.out.println("constructor Y()"); }
 Y(int n) { this(); System.out.println("constructor Y("+ n + ")"); }
 public String toString() { return new String("Y"); } 
 public void whoami() { System.out.println(toString()); }
 public void whoisparent() { System.out.println(super.toString()); }
 public int comp(int n) { return n*3; }
 public int comp2(double n) { return (int)(n*6); }
}

public class TestWrongOverriding{
 public static void main(String[] args) {
  Y y1 = new Y();// (1)
  y1.whoami();// (2)
  y1.whoisparent();// (3)
  System.out.println("comp(10) = " + y1.comp(10) +"\ncomp2(10) = " + y1.comp2(10) + "\ncomp2(10.0) = " + y1.comp2(10.0)); 
	}
 }