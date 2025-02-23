package Control_Statement;

public class Example7_else_if 
{
	public static void main(String[] args) 

	{

		int marks=60;

		if(marks>=65)
		{
			System.out.println("distiction");
		}
		else if(marks>=60 & marks<=65)
		{
			System.out.println("1st class");
		}
		else if(marks>=50 & marks<=60)
		{
			System.out.println("2nd class");
		}
		else if(marks>=35 & marks<=50)
		{
			System.out.println("pass");
		}
	}

}
