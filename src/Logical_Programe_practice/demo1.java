package Logical_Programe_practice;

public class demo1 
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
				temp+=ch;
			}
			else
			{
				sum+=Integer.valueOf(temp);
				temp="0";
			}
		}
		System.out.println(sum);

	}

}
