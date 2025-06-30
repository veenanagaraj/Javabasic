package module1programs;

public class NonStaticmethodofsameclass {

	void login()
	{
		System.out.println("Login to Amazon");
	}
	
	void logout()
	{
		System.out.println("Logout from Amazon");
	}
	public static void main(String[] args) 
	{
		NonStaticmethodofsameclass A1 = new NonStaticmethodofsameclass();
		A1.login();
		A1.logout();

	}

}
