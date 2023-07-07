package methods;

public class sample21 
{
  // non-static regular method call from same class
	
	public static void main(String[] args)  //main method
	
	{
		 System.out.println("hello bhushan");
		                                     
		 sample21 s21=new sample21();       // STEP 1- CREATE AN OBJECT/INSTANCE OF CLASS
		   s21.m1();                                 //   classname objectname=new classname();     
		   s21.m2();                         //STEP 2 - METHOD CALL 
		  s21.m3();                                    //  object name.method name() ;  
		 
		 
		 
		 
		 //sample21->>classname-->as a datatype(object type)
		 //s21--> object name -->use to identify/refer object 
		 //new-->> keyword-->>use to create blank/empty object 
		 //sample21()-->>class name()-->> use to copy all the members of class into object
	}	 
	  //non static-->> regular method 
		public void m1()
		{	
		
			System.out.println(" running non-static regular method m1 from same class ");
	}
		//non static-->> regular method 
		public void m2()
		
		{ 
			System.out.println("running non-static regular method m2 from same class");
		}
	 	
		 //non static-->> regular method 
		
		public void m3()
		{
			System.out.println("running non-static regular method m3 from same class");
		}
		
		}
