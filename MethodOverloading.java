package Nosnstaticmethods;

public class MethodOverloading 
{
	static void add(int a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	static void add(int a, double b, int c)
	{
		double sum=a+b+c;
		System.out.println(sum);
	}
	
	static void add(double a, int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	 void add(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void add(int a , int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		add(100, 5.34);
		add(5, 3.2, 6);
		add(4.12, 5);
		MethodOverloading M1= new MethodOverloading();
		M1.add(3.12, 5.12);
	}

}
