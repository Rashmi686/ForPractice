class parentcls1
{
void login()

{
	System.out.println("Login with mob no");
}
}
public class Method_Overriding extends parentcls1 
{
void login()

	{
	    super.login();
		System.out.println("Login with email id");
	}



	public static void main(String[] args) 
	{
	Method_Overriding r=new Method_Overriding();
	r.login();
		
	}

}


// //1.In method overriding, a subclass provides a new implementation for a method that already exists in the parent class. //
// Rules//
//1. Both class should have the relation with each other with extends keyword//
//2. Both class should have the same method name//
//3. Both methods should have the different implementation/different body//
//4. Both methods can only be non static//
//5. Super keyword can only be used in java in method overriding to call the parent class implementation together with the child class implementation//
//6.to call the parameterized constructor of a parent class in Java, you need to use the super keyword with the required arguments inside the child class's constructor.


//Meaning of signature - Method return type,  Method parameter//


