package methods;

public class sample31

{
	// COMBINE ALL METHODS
   //method without/zero parameter [ included sample 32 ]
	
	public static void main(String[] args)
	
	{
		// 1 static regular method call from same class-->> methodname();
		    m15();
		
		//2. static regular method call from diff class -->> classname.methodname();
		     sample32.m17();
		
		//3.non-static regular method call from same class
             sample31 s31 = new sample31();  // create an object of same class
		     s31.m16();                                                // method call
		
		//4. non-static regular method call from diff class
		      sample32 s32 = new sample32();  // create an object of diff class
	           s32.m18();                                          //method call
		
		
	
	}
	
	public static void m15()
	{
	System.out.println("running static regular method call m15");
	}
	
	
		public void m16()
		{
			System.out.println("running non-static regular method call m16");
			
	}
	
	
}
