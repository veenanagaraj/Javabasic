package Nosnstaticmethods;

public class AmazonLogin 
{
	AmazonLogin(long mobilenum)
	{
		System.out.println("Login using email id");
	}
	
	AmazonLogin(String emailid)
	{
		System.out.println("Login using email id");
	}
	
	public static void main(String[] args) 
	{
		AmazonLogin a1 = new AmazonLogin(878767547);
		AmazonLogin a2=new AmazonLogin("jbfhdfhvd@jnfhjh.com");
		new AmazonLogin(765765467);
		new AmazonLogin("hhgyyttyyttyty");
	}

}
