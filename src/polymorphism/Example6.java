package polymorphism;

public class Example6               // overload static method 


{
public static void m1()
{
	System.out.println("this is overloaded static method example");
}
public static void m1(int a, int b)
{
	System.out.println(a+b);
}
public static void m1(int a,int b,int c)
{
	System.out.println(a+b+c);
}

public static void main(String[] args) 

{
	m1();
	m1(10,10);
	m1(20,20,20);
	
}
	
}
