//To generate the prime number from 1 to 100

package Pooja;

public class Lab11 {

	public static void main(String[] args) {
		int limit =100;
		System.out.println("Prime numbers between 1 and " +limit);
		 for(int i=1; i<100; i++) {
			 boolean isprime = true;
			 for(int j = 2; j<i; j++ ) {
				 if(i%j ==0) {
					 isprime = false;
					 break;
					 
				 }
			 }
			 
			 if(isprime)
				 System.out.println(i + " ");
		 }
		

	}

}
