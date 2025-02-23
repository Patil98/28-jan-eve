package Exception_Handling;

public class Example5 
{
	public static void main(String[] args) 
	{
		

		String s1="abcd";
		
		
		try
		{
			System.out.println(s1.charAt(5));
		}
		catch(Exception e)                                // generic exception 
		{
			e.printStackTrace();
			System.out.println("exception handled");
		}
		System.out.println("hi");
		System.out.println("hello");
		
		
		
		
		
		
		
		
	}

}
