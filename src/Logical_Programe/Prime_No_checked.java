package Logical_Programe;

public class Prime_No_checked
{
	public static void main(String[] args) 
	{
		int no=3; 
		int count=0;
		
		if(no==1)
		{
			System.out.println(no+"-> is not prime no");
			return;
		}
		
		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(no+"-> is prime no");
		}
		else
		{
			System.out.println(no+"-> is not prime no");
		}
	}

}
