package package2;

public class PrimitiveTypeCasting {

	public static void main(String[] args) 
	{
		//float to double
		float a=1.2f;
		double converted_value=a;//widening
		System.out.println(converted_value);
		
		double converted_value1=(double)a;
		System.out.println(converted_value1);
	}
}
