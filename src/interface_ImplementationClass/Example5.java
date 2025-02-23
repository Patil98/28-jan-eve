package interface_ImplementationClass;

// implementation class
// sub class

// Example of multiple inheritance using interface 

public class Example5 implements Example3,Example4
{
	public void m1()
	{
		System.out.println("method m1 from interface 1 completed in implementation class");
	}

	public void m2()
	{
		System.out.println("method m2 from interface 1 completed in implementation class");
	}


	public void m3()
	{
		System.out.println("method m3 from interfac 2 completed in implementation class");

	}


	public void m4()
	{
		System.out.println("method m4 from interfac 2 completed in implementation class");
	}
}
