package package2;
abstract class Google_auth
{
	abstract void login();
	static void logout() 
	{
		System.out.println("concrete class");
	}
}
public class ABstraction50perc extends Google_auth
{
	public static void main(String[] args) 
	{
		logout();
		ABstraction50perc a= new ABstraction50perc();
		a.login();
	}
	void login() 
	{
		System.out.println("real logic");
	}
}
