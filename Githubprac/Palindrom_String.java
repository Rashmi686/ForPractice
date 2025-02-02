
public class Palindrom_String {

	public static void main(String[] args) {
		String name ="radarq";
		int n=name.length();
		String rev="";
		for(int i=n-1;i>=0;i--)
		{
			char c1=name.charAt(i);
			rev=rev+c1;
		}
System.out.println("rev");
if(name.contains(rev))
{
	System.out.println("It is a palindrom");
}else
{
	System.out.println("It is not a palindrom");
}
	}

}
