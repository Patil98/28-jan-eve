package Logical_Programe;

public class vowel_and_Consonant
{
	public static void main(String[] args) 
	{
		String s="bhushan patil";

		System.out.println("vowel in the String is : ");

		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				System.out.print(s.charAt(i)+" ");
			}
		}	

	}
}
