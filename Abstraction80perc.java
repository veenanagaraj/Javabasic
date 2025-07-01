package package2;
abstract class Airlines
{
	abstract void indigo();
	abstract void akasa();
	abstract void spicejet();
	abstract void vistara();
	void AirAsia()
	{
		System.out.println("AirAsia logic exposed");
	}
}
public class Abstraction80perc extends Airlines
{

	public static void main(String[] args) 
	{
		Abstraction80perc a= new Abstraction80perc();
		a.AirAsia();
		a.akasa();
		a.indigo();
		a.spicejet();
		a.vistara();
	}
	void indigo() 
	{
		System.out.println("abstract indigo");
	}
	void akasa() 
	{
		System.out.println("abstract akasa");
	}
	void spicejet() 
	{	
		System.out.println("abstract spicejet");
	}
	void vistara() 
	{
		System.out.println("abstract vistara");
	}
}
