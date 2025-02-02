abstract class automation
{
	 abstract void login();
	 abstract void logout();
}
public class abstract_mkt extends automation  
{
	void login()
	{
		System.out.println("logic by developer");
	}
	void logout()
	{
		System.out.println("logic by developer1");
	}
public static void main(String[] args) 
{
	abstract_mkt r=new abstract_mkt();
	r.login();
	r.logout();
	
	}

}



//1. Abstract class - class that has abstract method in it.//
//2. Abstract method - A method with no implementation is called as abstract methods or a method with no body is called as abstract methods//
//3. It will always be non static because only non static methods can be overriden.//
//4. Every abstract method needs to be overriden in the child class.//