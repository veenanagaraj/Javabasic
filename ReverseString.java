package module1programs;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string:");
	String	input =sc.next();
	String output="";
	sc.close();
	for(int i=input.length()-1;i>=0;i--) 
	{
		char c1=input.charAt(i);
		output=output+c1;
	}
	System.out.println("This is my input:"+input);
	System.out.print("This is my output:"+output);
	}
}
