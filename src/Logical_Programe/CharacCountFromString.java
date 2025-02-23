package Logical_Programe;

public class CharacCountFromString
{
	public static void main(String[] args) 
	{
		String s="bhushan patil civil Engineer";

		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("total num of char in given string : "+ count);
	}

}


