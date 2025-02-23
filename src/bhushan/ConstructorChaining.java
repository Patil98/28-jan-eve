package bhushan;
         // Super class

public class ConstructorChaining 
{
	 ConstructorChaining()
	 {
		 System.out.println("super class constructor chaining");
	 }
	
	 ConstructorChaining(int a, int b)
	 {
		 this();
		 System.out.println(a+b);
	 }
	 
	
	
}
