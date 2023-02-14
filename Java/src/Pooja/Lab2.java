package Pooja;

public class Lab2 {
	byte b;
	short s;
	long l;
	int a;
	float f;
	double d;
	char ch;
	boolean b1;
	
	void show1()
	{
	System.out.println("variables & constant demo");
	System.out.println(b);
	System.out.println(s);
	System.out.println(l);
	System.out.println(a);
	System.out.println(f);
	System.out.println(d);
	System.out.println(ch);
	System.out.println(b1);
	
	
	}
	
	void show2() 
	{
		System.out.println("Integer literal demo");
		int a=20;
		int b=10;
		int c=0x12a;
		byte d=012;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	void show3()
	{
		System.out.println("Floating point litearl demo");
		float f1=99.97f;
		double d1=9.9e-9;
		double d2=9.9E+9;
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(d2);
		
	}
	void show4() 
	{
		System.out.println("character literal demo");
		char ch1= 'A';
		int x1='A';
		char ch3='I';
		int x3='I';
		System.out.println(ch1);
		System.out.println(x1);
		System.out.println(ch3);
		System.out.println(x3);
	}
	void show5() 
	{
		System.out.println("Boolean literal demo");
		boolean bb1=false;
		boolean bb2=true;
		System.out.println(bb1);
		System.out.println(bb2);
	}
	void show6() 
	{
		System.out.println("String literal demo");
		String ste1="";
		String ste2="123 abc +";
		String ste3="1";
		System.out.println("ste1 = " + ste1);
		System.out.println(ste1.length());
		System.out.println("ste2 = " + ste2);
		System.out.println(ste2.length());
		System.out.println("ste3 = " + ste3);
		System.out.println(ste3.length());
		
		
		
		
	}

		public static void main(String[] args) {
		Lab2 h = new Lab2();
		h.show1();
		h.show2();
		h.show3();
		h.show4();
		h.show5();
		h.show6();
	
	}
	}

