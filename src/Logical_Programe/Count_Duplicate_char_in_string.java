package Logical_Programe;

public class Count_Duplicate_char_in_string 
{
	public static void main(String[] args) 
	{
		String s="bhushan patil";

		int count=0;
		System.out.print("Count Duplicate char : ");
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='h')
			{
				count++;
			}
		}	
		System.out.println(count);		
	}

}
