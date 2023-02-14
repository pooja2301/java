//static variable
package Pooja;

public class Staicvar_Demo {
	int a=10;
	static int b=10;

	public static void main(String[] args) {
		Staicvar_Demo st=new Staicvar_Demo();
		System.out.println(st.a);
		System.out.println(st.b);
		Staicvar_Demo st1=new Staicvar_Demo();
		int x=st1.a++;
		System.out.println(x);
		int y=st1.b++;
		System.out.println(y);
		Staicvar_Demo st2=new Staicvar_Demo();
		int p=st2.a++;
		System.out.println(p);
		int q=st2.b++;
		System.out.println(q);
		Staicvar_Demo st3=new Staicvar_Demo();
		int c=st3.a++;
		System.out.println(st3.a++);
		int d=st3.b++;
		System.out.println(d);
	}

}
