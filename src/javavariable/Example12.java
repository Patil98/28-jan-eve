package javavariable;

public class Example12
{
	int a= 10;

	public static void call() 
	{
		int a=20;
		System.out.println(a);
		
	}

	public static void main(String[] args)
	{
		Example12 ex = new Example12();
		ex.call();

		System.out.println(ex.a);

	}
}
