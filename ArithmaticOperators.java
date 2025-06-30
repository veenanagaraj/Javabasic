package module1programs;

public class ArithmaticOperators {
	
	static void add()
	{
		int a=20;
		int b=40;
		int c=a+b;
		System.out.println("Sum of numbers is:"+c);
	}
	
	static void sub()
	{
		int a=20;
		int b=40;
		int d=b-a;
		System.out.println("difference of numbers is:"+d);
	}
	
	static void mul()
	{
		int a=20;
		int b=40;
		int e=b*a;
		System.out.println("product of numbers is:"+e);
	}
	
	static void div()
	{
		float a=20;
		float b=45;
		float f=b/a;
		System.out.println("quotient of numbers is:"+f);
	}
	
	static void mod()
	{
		int a=20;
		int b=40;
		int g=b%a;
		System.out.println("Remainder of numbers is:"+g);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
	}

}
