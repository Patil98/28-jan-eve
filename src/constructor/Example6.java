package constructor;

public class Example6 

{
  //STEP 1 : declaration 
	int num3;
	int num4;
	
	//STEP 2 : initialization
	// use 1 : initialize global variable 
	// use 2 : copy all the members of class into objects	
	
	Example6()
	{
		num3=50;
		num4=30;
		
	}
	
	// STEP 3 : usage
	public void sub()
	{
		System.out.println(num3-num4);
	}
	
	public void division()
	{
		System.out.println(num3/num4);
	}
}
