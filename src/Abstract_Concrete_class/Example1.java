package Abstract_Concrete_class;

//super class 
// abstract class
public abstract class Example1
{
	public int a;

	Example1()
	{
		a=10;
	}

	//complete method 	
	public  void m1()        // method declaration
	{
		System.out.println("method m1 complete in abstract class ");     // method definition
	}

	// complete method 
	public void m2()         // method declaration
	{
		System.out.println("method m2 complete in abstract class");  // method definition
	}

	// incomplete method or abstract method 
	abstract public  void m3();                           // method declaration

	//incomplete method or abstract method 
	abstract public void m4();                            // method declaration

}
