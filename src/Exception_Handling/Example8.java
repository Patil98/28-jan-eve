package Exception_Handling;

public class Example8

{
	public static void main(String[] args) 
	
	{

		String s1="abcd";
		int ar []= {40,20,30,10};
		
		try
		{
			try  //nested try block
			{
				System.out.println(s1.charAt(5));   // risky code 1
			
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Exception handled");
			}
			
			System.out.println(ar[9]);       // risky code 2
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception handled");	
			}
		
		System.out.println("hi");
		System.out.println("hello");
	}

}
