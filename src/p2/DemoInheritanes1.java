package p2;
import p1.*;
import java.util.*;
public class DemoInheritanes1 {
   public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   ClassB ob = new ClassB();//ChildClass Object
	   System.out.println("Enter the value of a");
	   ob.a = s.nextInt();
	   System.out.println("Enter the value of b:");
	   ClassB.b = s.nextInt();
	   System.out.println("Enter the value of x:");
	   ob.x = s.nextInt();
	   System.out.println("Enter the value of y:");
	   ClassB.y = s.nextInt();
	   
	   ob.m1();
	   ClassB.m11();
	   ob.m2();
	   ClassB.m22();
	   s.close();
   }
   
}
