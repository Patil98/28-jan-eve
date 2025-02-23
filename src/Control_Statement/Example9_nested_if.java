package Control_Statement;

public class Example9_nested_if
{
	public static void main(String[] args) 
	{
		int SA=11000;


		if (SA>=500)
		{
			System.out.println("no delivery charge");

			if (SA>=10000)
			{
				System.out.println("10% additional discount");
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
