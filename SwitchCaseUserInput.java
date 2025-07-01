package package2;
import java.util.Scanner;
public class SwitchCaseUserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input switch case");
		int input =sc.nextInt();
		switch(input) 
		{
			case 1: System.out.println("Indigo");
			break;
			
			case 2: System.out.println("Akasa");
			break;
			
			case 3:System.out.println("AirAsia");
			break;
			
			case 4: System.out.println("Spicejet");
			break;
			
			default: System.out.println("Please make correct input selection");
			sc.close();
		}
	}
}
