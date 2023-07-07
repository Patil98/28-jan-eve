package polymorphism;

public class main_method_overloading 


{
	public static void main(int a ,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main()
	{
		System.out.println("non parameterize method");
	}
	
	public static void main(String name)
	{
	
		System.out.println(name);
		main(10,20);
		main();
	}
	
	public static void main(String args[])
	{
		
		main("bhushan");
	}
	
	
	
	
	
}
	


