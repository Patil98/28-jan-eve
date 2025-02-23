package bhushan;

public class duplicate_char_in_string
{

	public static void main(String[] args)
	{

		String s="bhushan patil";

		System.out.print("duplicate char in String : " );

		char[]ar=s.toCharArray();

		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				if(ar[i]==ar[j])
				{

					System.out.print(ar[j]+" ");

				}
			}

		}










	}

}
