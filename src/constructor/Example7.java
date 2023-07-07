package constructor;

public class Example7       //USER DEFINED CONSTRUCTOR WITH PARAMETER ( example 7 and example 8)

{
	//DECLARATION
	int num1;
	int num2;
	
	//INITIALIZATION
	//user defined constructor with 2 int ( int,int ) parameter
	//use 1 : to intialize global variable 
   // use 2 : copy all member into the class into object 
	
	Example7(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
	//USAGE
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) 
	{
	 Example7 s1 = new Example7(10,20);
	 s1.add();
	 s1.mul();
	 
	 System.out.println(".......");
	 
	 Example7 s2 = new Example7(5,6);
	 s2.add();
	 s2.mul();
		
	 System.out.println("..........");
	 
	 Example8 s3 = new Example8(20,10);
	 s3.sub();
	 
	 Example8 s4 = new Example8(50,30);
	 s4.sub();
		
	}
	
	
	
	
	
	
	
	
}
