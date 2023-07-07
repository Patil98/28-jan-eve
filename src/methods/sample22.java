package methods;

public class sample22 


{
	public static void main(String[] args)
	
	{
	  System.out.println("Good morning");	
	  sample22 s22=new sample22();   //create object
	 s22.m4();                      //call  the method
	 s22.m5();
	  
	}
	
	// non-static regular method call from same class
	
	public void m4()
	
	{
		System.out.println( " running non-static regular method m4 from same class");
		
		
	}
	// non-static regular method call from same class
	
	public void m5()
	{
		System.out.println("running non-static regular method m5 from same class");
	}
}

