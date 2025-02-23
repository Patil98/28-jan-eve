package constructor;

public class Example1            // DEFAULT CONSTRUCTOR Example1 and Example2


//default constructor --->> provided by compiler
//use: to copy/load all the members of the class into object sample() 
{
	public static void main(String[] args)
	{
		Example1 s1=new Example1();             //default constructor call from same class
		s1.m1();
		s1.m2();

		//1. example1-->> classname-->> datatype 
		//2. s1-->> objectname -->>> to identify/ refer object
		// 3. new-->> keyword -->> use to create blank empty/blank object 
		//4. Example() -->> constructor call 

		Example2 s2 = new Example2();
		s2.m3();                                   //default constructor call from diff class


	}

	public void m1()
	{
		System.out.println("running method m1");
	}

	public void m2()
	{
		System.out.println("running method m2");
	}
}

