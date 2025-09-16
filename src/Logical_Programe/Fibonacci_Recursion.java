package Logical_Programe;

public class Fibonacci_Recursion
{		
	public static int Fibonacci(int n) 
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
	}
	
	public static void main(String[] args)
	{	
		for(int i=0; i<=10; i++)
		{
			System.out.print(Fibonacci(i)+" ");
		}
	}

}
