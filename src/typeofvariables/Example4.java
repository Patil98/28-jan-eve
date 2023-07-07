package typeofvariables;

public class Example4 // Example of non-Static global variable 

{
     int a=10;              // non static global variable 
     
     public static void main(String[] args) 
     
     {
		//1. non- Static global variable call from same class
    	 //    step 1) create object of same class
    	 //step 2) objectname.variablename
    	 
    	 Example4 d3 = new Example4();  //--->> create object of same class
    	 System.out.println(d3.a);         //  -->> objectname.variablename
    	 
    	 //2. non-static global variable call from diff class
    	 // step1) create object of diff class
    	 // step 2) objectname.variablename
    	 
    	 Example5 d6 = new Example5();
    	 System.out.println(d6.d);
    	 
	}
     
   	public static void m3()
	{
		 Example4 d4 = new Example4();
		 System.out.println(d4.a);
		 
	}
	
	public void m4()
	{
		System.out.println(a);
	}
}
