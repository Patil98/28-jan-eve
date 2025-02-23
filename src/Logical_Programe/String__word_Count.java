package Logical_Programe;

public class String__word_Count 
{
	public static void main(String[] args) 
	{
		
		String s = "welcome string java program";
		int count=1;
		
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)==' '))
			{
				count++;
			}
		}
		System.out.println( "total num of word in given string : "+ count);
		
	}

}
