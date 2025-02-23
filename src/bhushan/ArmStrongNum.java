package bhushan;

public class ArmStrongNum 
{

	public static void main(String[] args) 
	{
		int num=123;
		int rem;
		int sum=0;
		
		
		for(int i=num; i>0; i=i/10)
		{
			rem=i%10;
			sum+=(rem*rem*rem);
		}
		
		if(num==sum)
		{
			System.out.println("arm");
		}
		else
		{
			System.out.println("not arm");
		}
	}

}
