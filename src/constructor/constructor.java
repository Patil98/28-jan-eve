package constructor;

public class constructor
{
	constructor()
	{
		System.out.println("constructor overloading");
	}
	constructor(int a,int b)
	{
	   System.out.println(a+b);
	}
	constructor(String name)
	{
		System.out.println(name);
	}
	constructor(int a)
	{
		System.out.println(a*a);
	}
	
	public static void main(String[] args) 
	{
		constructor c=new constructor();
		constructor c1=new constructor("bhushan");
		constructor c2=new constructor(10);
		constructor c3=new constructor(10,20);
		
		
		
		
	}

}
