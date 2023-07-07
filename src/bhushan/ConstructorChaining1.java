package bhushan;

//  sub class

public class ConstructorChaining1 extends ConstructorChaining

{
	 ConstructorChaining1()
	 {
		 this(20);
		System.out.println("sub class constructor chaining"); 
		 
	 }
	 ConstructorChaining1(int a)
	 { 
		this(50,50);
		System.out.println(a*a);  
		
	 }
	 ConstructorChaining1(int a,int b)
	 {
		 super(10,20);
		 
		 System.out.println(a*b);	 
	 }
      
	 public static void main(String[] args) 
	 {
		 ConstructorChaining1 cc=new ConstructorChaining1();
		 
		 
	}

}
