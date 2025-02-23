package Exception_Handling;

public class Example9 
{
	public static void main(String[] args) 
	{
		try 
		{
			int result=10/0;	
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
				
	}

}
