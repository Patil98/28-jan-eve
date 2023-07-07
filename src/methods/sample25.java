package methods;

public class sample25 

{
  public static void main(String[] args) 
  
  {
	
	  System.out.println("goog morning");
	  sample25 s25 = new sample25();    // create an object 
	                                        
		s25.m10();  
		s25.m10();                   // call method from same class
		s25.m10();
		s25.m10();
	  
}
	
//non-static regular method call from same class
  
  public void m10()
  {
	  System.out.println("running non-static regular method m10 from same class");
 
  
  }
  
  
}
