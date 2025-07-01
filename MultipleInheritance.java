package package2;
interface A
{
	void login();
	void logout();
}

interface B
{
	void change_password();
	void forgot_password();
}

public class MultipleInheritance implements A,B
{
	public static void main(String[] args) 
	{
		A a= new MultipleInheritance();
		B b= new MultipleInheritance();
		a.login();
		a.logout();
		b.change_password();
		b.forgot_password();
	}
	public void change_password() 
	{
		System.out.println("Change the password");
	}
	public void forgot_password() 
	{
		System.out.println("forgot password");
	}
	public void login() 
	{
		System.out.println("Login");
	}
	public void logout() 
	{
		System.out.println("logout");
	}
}
