package Logical_Programe;

public class Swap_3_Num 
{

	public static void main(String[] args)
	{ 
		int a=10;   //30
		int b=20;   //10
		int c=30;   //20

		a=a+b+c;      //60
		b=a-(b+c);    //10
		c=a-(b+c);    //20
		a=a-(b+c);    //30


		System.out.println(a+"  "+b+"  "+c);
	}

}
