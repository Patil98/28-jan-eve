package interface_ImplementationClass;

public class Example11_imple implements Example11
{

	public void m1()
	{
		System.out.println("bhushan");
	}
	
	public void m2()
	{
		System.out.println("patil");
	}
	
	public static void main(String[] args) 
	{
		Example11_imple ex = new Example11_imple();
		ex.m1();
		ex.m2();
		ex.m3();
	

	}

	@Override
	public void m3()
	{
		
		
	}

	

}
