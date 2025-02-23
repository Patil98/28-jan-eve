package PassByReferanceAndPassByValue;

public class PassByValue 
{
	public static void main(String[] args)
	{
		int a=1000;
		System.out.println(a);
		
		int b;
		b=a;
		System.out.println(b);
		
		b=2000;               //change made in another variables will not reflect with original variables.
		System.out.println(b);

		System.out.println(a);
	
   }

}
