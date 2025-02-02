class one 
{
	public one() 
	{
		System.out.println("constructor 1");
	}
}
public class two_super extends one
{
	public two_super() 
	{
		System.out.println("constructor 2");
	}

	public static void main(String[] args) 
	{
		two_super r=new two_super();
		

	}

}
//In every constructor first statement  will be always super calling statement no matter you want or don’t want//
//implicitly-don't write ,non-implicitly-write//
//super statement is of 2 types(parameterised,Nonparameterised)//
// parameterised super statement - to call the parameterised constructor of parent cls//
//Nonparameterised - to call the nonparameterised constructor of parent cls//