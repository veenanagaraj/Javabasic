package package2;

public class ThisCallingStatement {
	
	ThisCallingStatement()
	{
		this (100);
		System.out.println("without parameters");
	}
	
	ThisCallingStatement(int a)
	{
		this("Mahesh");
		System.out.println("int a constructor");
	}
	
	ThisCallingStatement(int a,double b)
	{
		this('M');
		System.out.println("int a and double b constructor");
	}
	
	ThisCallingStatement(String c)
	{
		this(100, 5.34);
		System.out.println("String c constructor");
	}
	
	ThisCallingStatement(char a)
	{
		System.out.println("Char a constructor");
	}
	
public static void main(String[] args) 
	{
		new ThisCallingStatement();
	}
}
