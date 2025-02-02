
public class Method_Overloading {
	 Method_Overloading(double pi)
	 {
		 System.out.println("This is my constructor 3");
	 }
	 Method_Overloading(double pi, int radius)
	 {
		 System.out.println("This is my constructor 4");
	 }
	 Method_Overloading()
	 {
		 System.out.println("This is my constructor 1");
	 }
	 Method_Overloading(boolean a)
	 {
		 System.out.println("This is my constructor 2");
	 }
	public static void main(String[] args) 
	{
		Method_Overloading r=new Method_Overloading(3.14);
		Method_Overloading r1=new Method_Overloading(3.14, 6);
		Method_Overloading r2=new Method_Overloading();
		Method_Overloading r3=new Method_Overloading(true);
		

	}

}
//In both method overloading/overriding method body should be different//
//Same/different return type: The overloading//
//Real time example:- facebook application,you can login either through mob no or email id//
*/
 void login(String email id)
 {
	
 }
void login(long mobno)
{
	
 }
 
 /*
//Same return type: The overriding method must have the same return type as the method in the parent class//



