package typeofvariables;

public class Example2             //static global variable Example

{
     
	 static int a=10;               //static- Global variable 
	
	public static void main(String[] args) 
	
	{
		     //1. static global variable call from same class --->> variable name
		
		System.out.println(a);
		
		// 2. static Global variable call from Different class-->> Diffclassname.variablename
		
		System.out.println(Example3.b);
	}
	
	
	
	public static void m1()
	{
		System.out.println(a);
	}
	
	public void m2()
	{
		System.out.println(a);
	}
}


