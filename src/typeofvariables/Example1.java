package typeofvariables;

public class Example1          // Example of global and Local variables

{
	int b=20;           // Global variable -->> permanent variable 
	
	
	public static void main(String[] args) 
	
	{
		 Example1 Exa1 = new Example1();
		 Exa1.m1();
		 Exa1.m2();
		
	}
	
	
	public  void m1()
	{
		int a=10;             // Local variable -->> temporary variable 
		
		System.out.println(a);
		System.out.println(b); 
	
	}
	
	
	public void m2()
	{
		System.out.println(b);
	}
}

