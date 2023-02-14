//static block
package Pooja;

public class StaticBlock {
	StaticBlock(){
		System.out.println("This is constructor");
	}
	{
		System.out.println("This is non static block");
	}
	{
		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		StaticBlock s= new StaticBlock();
		StaticBlock s1= new StaticBlock();
	}

}
