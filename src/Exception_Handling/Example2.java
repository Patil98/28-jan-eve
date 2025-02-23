package Exception_Handling;

public class Example2
{
	public static void main(String[] args)
	{
		int ar []= {40,20,30,10};
		
		try
		{
			System.out.println(ar[9]);              // risky code
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(ar[0]);
			
			System.out.println("exception handled");
			
		}
		
		System.out.println("bhushan");
		
	}

}
