//static method
package Pooja;

public class Staticmethod {
	static int i=10;
	int b=20;
	void display() 
	{
		System.out.println("This is display method");
	}
	static void show() {
		System.out.println("Hello This is JBK classes");
	}
	public static void main(String[] args) {
		Staticmethod s=new Staticmethod();
		s.display();
		s.show();
		Staticmethod s1=null;
		s1.show();
		
	}

}
