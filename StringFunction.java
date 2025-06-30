package module1programs;

public class StringFunction {

	public static void main(String[] args) 
	{
		String a="Automation testing";
		int size=a.length();
		System.out.println(size);
		
		String uppercase=a.toUpperCase();
		System.out.println(uppercase);
		
		String lower=a.toLowerCase();
		System.out.println(lower);
		
		String b="VEENA testing";
		boolean b1=b.contains("testing");
		System.out.println(b1);
		
		String full=a.concat(" Selenium");
		System.out.println(full);
		
		boolean equals=a.equals(b);
		System.out.println(b);
		
		String c="world";
		char index=c.charAt(1);
		System.out.println(index);
		
		boolean eqign=a.equalsIgnoreCase(b);
		System.out.println(eqign);
		
		int ind=a.indexOf('o');
		System.out.println(ind);
		
		String s1=a.substring(11);
		System.out.println(s1);
		
		String s2=a.substring(2, 7);
		System.out.println(s2);
	}

}
