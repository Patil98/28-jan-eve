package Logical_Programe;

public class String1stAndLastSwap 
{
	public static void main(String[] args)
	{
		String s="java is object oriented";	
		char[] ar = s.toCharArray();

		for(int i=0; i<ar.length; i++)
		{
			int k=i;

			while(i<ar.length && ar[i]!=' ')
			{
				i++;
			}
			char temp=ar[k];  
			ar[k]=ar[i-1];
			ar[i-1]=temp;
		}
		System.out.println(ar);

	}
}
