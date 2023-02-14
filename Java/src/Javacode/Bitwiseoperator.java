package Javacode;

public class Bitwiseoperator {
	public static void main(String[] args) {
		int a=2;
		int b=4;
		System.out.println("value of a before: " +a);
		System.out.println("value of a before: " +b);
		
		//bitwise urinary operator (~)
		System.out.println("value of a after negation: " + ~a);
		System.out.println("value of a after negation: " + ~b);
		
		//bitwise AND operator &
		System.out.println("Result of a&b is: " +(a&b));
		
		//bitwise OR operator |
		System.out.println("Result of a|b : " +(a|b));
		
		//bitwise XOR operator ^
		System.out.println("Result of a^b is: " +(a^b));
		int no=8;
		System.out.println("Original number: " +no);
		
		//left shifiting bytes with 1 position
		
		no=no<<1; //should be 16 i.e.0001 0000
		
		//equivalent of multiplication of 2
		
		System.out.println("value after left shift: " +no);
		
		no= -8;
		
		//right shifiting bytes with sign 1 position
		
		no=no>>1;  //should be 16 i.e. 00010000
		
		//equivalent of division of 2
		
		System.out.println("value after right shift with sign: " +no);
		 no= -8;
		 //right shifiting bytes without sign 1 position
		 
		 no=no>>>1;  //should be 16 i.e. 00010000
		 //equivalent of division of 2
		 
			System.out.println("value after right shift with sign: " +no);
		 
		
		
	}

}
