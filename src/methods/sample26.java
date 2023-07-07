package methods;

public class sample26 
  
//non-static regular method call from diff class  [ from class 27 to 30 ]
  
  
{
 
	public static void main(String[] args)
	
	{
	 sample27 s27 = new sample27(); //create an object of different class i.e sample 27
	 s27.m11();                    // method call
	 
	 
	 sample28 s28 = new sample28();   //create an object of different class i.e sample 28
	 s28.m12();                         // method call 
	 
	 sample29 s29 = new sample29();  //create an object of different class i.e sample 29
	  s29.m13();                    // method call
	
	  sample30 s30 = new sample30();   //create an object of different class i.e sample 30
	  s30.m14();                   // method call
	  
	}
	
	
	
}
