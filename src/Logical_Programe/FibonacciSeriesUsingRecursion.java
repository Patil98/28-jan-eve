package Logical_Programe;

public class FibonacciSeriesUsingRecursion
{	
	public static void main(String[] args)
	{
		int num=10;
		
		for(int i=0; i<num; i++)
		{
			System.out.println(Fibonacci(i)+" ");
		}
		
	}
	public static int Fibonacci(int n) 
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
	}

}
