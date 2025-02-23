package constructor;

public class Overloading 
{
	int a;
	int b;
	int c;
	
	Overloading()
	{
		a=10;
	    b=20;
	}
	
	Overloading(int x)
	{
		a=x;
	}
	
	Overloading(int x,int y)
	{
		a=x;
		b=y;	
	}
	
	Overloading(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	void display()
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args)
	{
//		Overloading o = new Overloading();
//		o.display();
	
//		Overloading ov = new Overloading(10);
//		ov.display();
		
//		Overloading ove = new Overloading(20, 30);
//		ove.display();
		
		Overloading over = new Overloading(50, 50, 50);
		over.display();
		
	}
	
	



}
