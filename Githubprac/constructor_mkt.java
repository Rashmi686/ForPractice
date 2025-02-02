
public class constructor_mkt {
	 constructor_mkt() 
		{
			System.out.println("This is good cls");
		}
		constructor_mkt(String name)
		{
			System.out.println("He is good enough");
		}
		
	public static void main(String[] args) {
		constructor_mkt r=new constructor_mkt();
		constructor_mkt r1=new constructor_mkt("Manish");
		

	}

}

//We can have more than one constructor in a cls but it gives birth to concept of constructor overloading (variation in the argument list)//