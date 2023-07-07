package bhushan;

public class mock2 
{

	public static void main(String[] args) 
	{
		String org ="Words java";
		String rev =" ";
		
	
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
			
		}
		
		System.out.println("original String :"+ org);
		System.out.println("revers string :"+ rev);		
		
		
	}
	
}
