package constructor;

public class Example8 
{
	int num3;
	int num4;
	
		
	Example8(int c,int d)
	{
		num3=c;
		num4=d;
	}
	
	public void sub()
	{
		System.out.println(num3-num4);
	}
	public static void main(String[] args) 
	{
		Example8 s8 = new Example8(20,10);
		s8.sub();
	}
	

}
