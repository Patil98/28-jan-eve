package Exception_Handling;

public class example1

{
	public static void main(String[] args) 
	{
		
		String s1="abcd";
		
		try
		{
			System.out.println(s1.charAt(5));         // risky code
			
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("exception handled");
			
		}
		
		System.out.println("hello");
		System.out.println("good morning");
		
	}
	

}
