package Logical_Programe;

public class String__word_Count 
{
	public static void main(String[] args) 
	{	
		String s="bhushan patil software tester";
		String[] ar = s.split(" ");

		for(int i=0; i<ar.length; i++)
		{
			String word=ar[i];
			String rev="";

			if(i%2==0)
			{
				for(int j=word.length()-1; j>=0; j--)
				{
					rev+=word.charAt(j);	
				}
				System.out.print(rev+" ");

			}
			else
			{
				System.out.print(word+" ");
			}

		}

	}

}
