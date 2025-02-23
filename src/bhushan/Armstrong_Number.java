package bhushan;

public class Armstrong_Number 
{
	public static void main(String[] args) 
	{
		int num=154;
		int sum=0;
		int rem;
		
		for(int i=num; i>0; i=i/10)
		{
			rem=i%10;
			sum+=(rem*rem*rem);
			
		}

		if(num==sum)
		{
			System.out.println("it is a armstrong num");
		}
		else
		{
			System.out.println("it is not armstrong num");
		}
		
	}
	
	

}
