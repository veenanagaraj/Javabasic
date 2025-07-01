package package2;
class Education
{
	Education(String a)
	{
		 System.out.println("Parent class constructor");
	}
}
public class SupercallingStatement extends Education
{
	SupercallingStatement()
	{	
		super("Dhriti");
		System.out.println("childclass constructor");
	}
	public static void main(String[] args)
	{
		new SupercallingStatement();
	}
}
