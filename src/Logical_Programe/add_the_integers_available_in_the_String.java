package Logical_Programe;

public class add_the_integers_available_in_the_String 
{
	
	public static void main(String[] args)
	{
		String s="10value8with20value";
		String temp="0";
		int sum=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				temp=temp+ch;
			}
			else
			{
			  sum=sum+Integer.parseInt(temp);
			 temp="0";
			}
		}
		System.out.println(sum);
	
		
	}

	
	
}
