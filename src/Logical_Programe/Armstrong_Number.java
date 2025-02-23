package Logical_Programe;

public class Armstrong_Number
{
	public static void main(String[] args) 
	{
		int num=371;
		int temp=0;
		int rem;

		for(int i=num; i>0; i=i/10)
		{
			rem=i%10;
			temp=temp+(rem*rem*rem);	
		}
		if(num==temp)
		{
			System.out.println("no is armstrong number");
		}
		else
		{
			System.out.println("no is not armstrong number");
		}

	}


}
