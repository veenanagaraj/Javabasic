package package2;
class TypeCast
{
	void cast() 
	{
		System.out.println("casting");
	}
	void type()
	{
		System.out.println("Typing");
	}
}
public class ClassTypeCasting extends TypeCast
{
	void category() 
	{
		System.out.println("Category");
	}
	void simple()
	{
		System.out.println("Simple");
	}
	public static void main(String[] args) 
	{
		TypeCast p=new ClassTypeCasting();
		p.cast();
		p.type();
		ClassTypeCasting c=(ClassTypeCasting) p;
		c.category();
		c.simple();
	}
}
