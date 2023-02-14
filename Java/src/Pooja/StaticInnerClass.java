//static inner class
package Pooja;

public class StaticInnerClass {
	static class A{ //static inner class
		static int a=10;
		 int b=20;
		 void display() {
			 System.out.println("This is local method");
		 }
		 static void show() {
			 int c=63;
			 System.out.println("This is static method");
		 }
		
	}

	public static void main(String[] args) {
	A a =new A();
	System.out.println(a.b);
	System.out.println(a.a);
	a.display();
	a.show();
	
	}

}
