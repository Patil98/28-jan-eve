package Exception_Handling;

public class Example3 
{
	public static void main(String[] args)
	{
		
	int a=10;
	int b=0;
	int div=0;
	
	try
	{
		div=a/b;
			
	}
	catch(ArithmeticException d)
	{
		System.out.println("Exception handled");	
	}
	
	System.out.println(div);
	System.out.println("hiii");
	
	}
}
