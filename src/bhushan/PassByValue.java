package bhushan;

public class PassByValue {

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);

		int b=a;
		System.out.println(b);

		b=20;
		System.out.println(b);

		System.out.println(a);


	}

}
