package Logical_Programe;

public class Count_Duplicate_char_in_string 

{
	public static void main(String[] args) 
	{
		String s="bhushan patil";
		char c='a';
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}	
		System.out.println(count);		
	}

}
