package polymorphism;

public class Example5    //this is overloaded main method

{
public static void main(String[] args) 

{
	main();
	main(10,20);
	main(10,10,10);
}

public static void main() 
{
	System.out.println("this is overloaded main method");
}

public  static void main(int a, int b) 

{
	System.out.println(a+b);
}


public static   void main(int a, int b , int c) 

{
	System.out.println(a+b+c);
}
	
}
