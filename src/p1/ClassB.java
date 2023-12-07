package p1;
public class ClassB extends ClassA {
  public int x;
  public static int y;
  public void m2() {
	  System.out.println("***CClass Instance m2 ()***");
	  System.out.println("The value x:"+x);
	  System.out.println("The value y:");
  }
  public static void m22() {
	  System.out.println("***CClass Static m22()***");
	  System.out.println("The value y:"+y);
  }
  
  
}
