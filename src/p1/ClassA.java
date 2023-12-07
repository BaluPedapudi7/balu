package p1;
public class ClassA {
   public int a;
   public static int b;
   public void m1() {
	   System.out.println("****PClass Instance m1()****");
	   System.out.println("The value a:"+a);
	   System.out.println("The value b:"+b);
   }
   public static void m11 () {
	   System.out.println("***PClass static m11()***");
	   //System.out.println("The value a:"+a);
	   System.out.println("The value b:"+b);
   }
}
