package methods;

public class sample24 

{

	public static void main(String[] args)
	
	{
		System.out.println("good evening");
		sample24 s24 = new sample24();
		s24.m8();
		s24.m9();
		s24.m9();
		
	}
	
	// non-static regular method call from same class
    
	public void m8()
	{
	System.out.println("running non-static regular method m8 from same class");
	
	}
	 public void m9()
	 {
		 System.out.println("running non-static regular method m9 from same class");
	 }
	
}


