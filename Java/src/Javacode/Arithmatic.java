package Javacode;

public class Arithmatic {
	private int a,b;
	public int getA() {
		return a;
		
	}
	public void setA(int a) {
		this.a= a;
	}
     public int getB() {
    	 return b;
     }
     public void setB(int b) {
    	 this.b=b;
     }
	public static void main(String[] args) {
		Arithmatic a= new Arithmatic();
		a.setA(15);
		a.setB(3);
		int c =a.getA()+a.getB();
		System.out.println("Addition is " +c);
	}


}
