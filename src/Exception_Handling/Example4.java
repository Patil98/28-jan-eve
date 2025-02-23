package Exception_Handling;

public class Example4 
{
	
	public static void main(String[] args) 
	{

		String s1="abcd";
		
		try 
		{
			System.out.println(s1.charAt(5));           //risky code
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndex Out Of Bounds Exception handled");
		}
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println("exception handled");
		}
		catch(ArithmeticException e3)
		{
			System.out.println("exception handled");
		}
		
		System.out.println("hi");
		System.out.println("hello");
	}

}
