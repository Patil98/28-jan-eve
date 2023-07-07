package Exception_Handling;

public class Example7 
{
	public static void main(String[] args) 
	{
		
		String s1="abcd";
		int ar []= {40,20,30,10};
		
		
		try
		{
			System.out.println(s1.charAt(5));   // risky code 1
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled");
		}
		
		try
		{
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
