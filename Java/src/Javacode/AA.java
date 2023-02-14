package Javacode;



public class AA {
	static int ctr=0;
	int i=100;
	{
		//This is block
		System.out.println("Before change in local block");
		System.out.println("ctr = " +ctr);
		System.out.println("i =" +i);
		int ctr =2, i=200;
		System.out.println("");
		System.out.println("After change in local block");
		System.out.println("ctr = " +ctr);
		System.out.println("i =" +i);
	}
	void display2() {
		System.out.println("In another method");
		System.out.println("ctr = "+ctr);
		System.out.println("i= " +i);
	}
	

	public static void main(String[] args) {
		AA sObj = new AA();
		System.out.println("");
		sObj.display2();
	}

}
