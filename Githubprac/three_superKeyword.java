class one
{
	one()
	{
		System.out.println("constructor 1");
	}
}
class two extends one
{
	two() 
	{
		
		System.out.println("constructor 2");
	}
}
public class three_superKeyword extends two 
{
	three_superKeyword() 
	{
		System.out.println("constructor 3");
	}
	


	public  void main(String[] args) {
		three_superKeyword r=new three_superKeyword();
	}
	}



	