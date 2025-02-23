package Logical_Programe;

interface demo
{
	int m1(int a,int b);  //method with return type with parameter
	//void m2();            //normal method
	//void m3(int c,int d);  //method with no return type with parameter
	// int m4();               //method with return type without parameter
}

public class LambdaExpression 
{
	public static void main(String[] args) 
	{ 
		//method with return type with parameter
		demo d=(a,b)->(a*b);
		int result = d.m1(10, 10);
		System.out.println(result);

		/*//normal method
		demo b=()->System.out.println("bhushan");
		b.m2();*/

		/*//method with no return type with parameter
		demo e=(c,d)->System.out.println(c*d);
		e.m3(10, 20);*/

		/* //method with return type without parameter
		demo a=()->(10+20);
		int re = a.m4();
		System.out.println(re);*/

	}

}

