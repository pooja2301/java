//write a program to reverse and forward order

package Pooja;

public class Lab10 {

	public static void main(String[] args) {
		int n=67;
		System.out.println("Forward order");
		for (int i=1; i<=n; i++) {
			if (i%5 ==0) {
				System.out.println(i);
			}
		}
		System.out.println("Reverse order");
		for(int i =n; i>=1; i--) {
			if(i%5 == 0) {
				System.out.println(i);
			}
			
		}
	}

}
