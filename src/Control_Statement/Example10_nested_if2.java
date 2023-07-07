package Control_Statement;

public class Example10_nested_if2 

{
public static void main(String[] args) 
{
int SA=3000;

{
if (SA>=500)
	
{
	System.out.println("no delivery charge");
	
	if (SA>=10000)
	{
		System.out.println("additional 10% discount");
	}
	else
	{
		System.out.println("No discount");
	}
}
else
{
	System.out.println("50 RS delivery charge");
}
}
}
}
