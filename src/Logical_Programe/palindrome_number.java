package Logical_Programe;

public class palindrome_number 

{
	public static void main(String[] args) 
	{
		int no=121;        //12321
		int temp=no;  
		int rev=0; 
		int rem;
		
		while(temp!=0)
		{
		    rem=temp%10;             
			rev=rev*10+rem;        
			temp=temp/10;
			
		}
		
		if(no==rev)
		{
			System.out.println(no +" is palindrome number");
			
		}
		else
		{
			System.out.println(no +" is not palindrome number");
		}
		
		
		
	}
	

}
