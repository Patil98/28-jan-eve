package interface_ImplementationClass;

public interface Example9 
{

	default void m1()
	{
		System.out.println("bhushan");
	}
	
	default void m2()
	{
		System.out.println("kuldeep");
	}

	private void m3()
	{
		System.out.println("m3 from interface");

	}
	
	void m4();
	
}
