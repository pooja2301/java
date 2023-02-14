package Pooja;

public class Lab12 {
	static int a= 31;
	static int b;
	static void math(int x) {
		System.out.println("x = " +x);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	static {
		//This is static block
		System.out.println("Before static method a = " +a);
		
		b = a*4;
	}

	public static void main(String[] args) {
		System.out.println("Before static method b = " +b);
		math(42);
		
	}

}
