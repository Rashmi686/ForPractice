interface mkt
	{
		void login();
		void logout();
		
public class Interface_mkt  implements mkt
    {
	@Override
	public void login() {
	System.out.println("login by developer");     // All methods in interface are by default public, No need to write abstract before method//
	}
    @Override
	public void logout() 
    {
    System.out.println("login by developer1");
	}
   
    public static void main(String[] args) 
    {
    	Interface_mkt r=new Interface_mkt();
    	r.login();
    	r.logout();
	}
    }  
}

	
