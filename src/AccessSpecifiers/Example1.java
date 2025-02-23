package AccessSpecifiers;

 public class Example1          //Example 1 and Example 2 : private access specifiers  
{
	
	private int a;           //  private --->>> access specifiers  

	
	private Example1()        //  private --->>> access specifiers  
	{
		a=10;
	}
	
	 private void printsqaureofnum()     //  private --->>> access specifiers  
	{
		System.out.println(a*a);
	}

	public static void main(String[] args)
	{
		Example1 s1 = new Example1();
		System.out.println(s1.a);
		s1.printsqaureofnum();
	}
}
