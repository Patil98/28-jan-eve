package constructor;

public class Example5                // USER DEFINED CONSTRUCTOR  ( example5 and example6 )    

{
	 //STEP 1: declaration 
	 int num1;
	 int num2;
	 
	 //STEP 2: initialization 
      // use 1: initialize global variable 
	 // use 2 : copy/load  all members of class into object 
	  
	 Example5()  // user defined constructor -->> provided by user
	 {
		 num1=10;
		 num2=20;
	 }
	 
	 //  STEP 3: usage 
	 public void addition()
	 {
		 System.out.println(num1+num2);
	 }
	 
	 public void multiplication()
	 {
		 System.out.println(num1*num2);
	 }
	 
	 public static void main(String[] args) 
	 {
		Example5 s1 = new Example5();       //user defined constructor call from same method
		s1.addition();
		s1.multiplication();
	
		System.out.println("...........");
		
		
		Example6 s2 = new Example6();      // user defined constructor call  from different  method 
		s2.sub();
		s2.division();
	}
}
