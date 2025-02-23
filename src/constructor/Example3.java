package constructor;

public class Example3                //DEFAULT CONSTRUCTOR Example3 and Example4

{
	public static void main(String[] args)
	{
		Example3 s2 = new Example3();
		s2.m3();
		s2.m4();


		Example4 s4 = new Example4();
		s4.m5();

	}

	public void m3()
	{
		System.out.println("running method m3 from same class   ");
	}

	public void m4()
	{
		System.out.println("running method m4 from same class");
	}


}

