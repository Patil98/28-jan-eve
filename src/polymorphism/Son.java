package polymorphism;

public class Son extends Father   //SUB CLASS
// example of method overriding
{
	public void bike()
	{
		//super.car();
		//super.home();
		System.out.println("ktm");
	}
	public void home()
	{
		System.out.println("4 BHK");
	}
	public void car()
	{
		System.out.println("tata");
	}
}
