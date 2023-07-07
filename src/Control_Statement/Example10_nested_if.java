
package Control_Statement;

public class Example10_nested_if 

{
public static void main(String[] args)
{
	
	int PEM=500;
	int MEM=900;
	
	if(PEM>=350)
	{
		System.out.println("eligible for main exam ");
		
		if(MEM>=800)
		{
			System.out.println("got selected");
		}
		else
		{
			System.out.println("rejected from mains exam ");
		}
	}
	
	else
	{
		System.out.println("not eligible for mains exam ");
	}
}
	
}
