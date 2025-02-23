package Casting;

public class explicitCasting 
{

	double a=2.5d;   //(memory size of double is 8 byte)

	float b=(float)a;     // (memory size of int 4 byte)

	public static void main(String[] args)
	{
		explicitCasting e=new explicitCasting();
		System.out.println(e.a);
		System.out.println(e.b);

		System.out.println("..........");	
		
		double d=131.0;
		byte b=(byte)d;
		System.out.println(b);

	}
}
