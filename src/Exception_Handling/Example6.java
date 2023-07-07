package Exception_Handling;

public class Example6 

{
public static void main(String[] args) 
{

	String s1="abcd";

	try 
	{
		System.out.println(s1.charAt(5));           //risky code
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception handled");
	}
	
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("exception handled");
	}
	catch(Exception e)                                // generic exception 
	{
		System.out.println("exception handled");
	}
	
	
   
	
	System.out.println("hi");
	System.out.println("hello");
}

	
}
	
	

