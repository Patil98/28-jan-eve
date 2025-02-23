package Logical_Programe;

public class ConvertFirstLatterOfStringCapital 
{

	public static void main(String[] args) 
	{
		String s="i love india";
		String[] ar =s.split(" ");

		for(int i=0; i<ar.length; i++)
		{
			// taking letter individually from sentences make first
			//letter uppercase using toUpperCase function
			String FirstLatter = ar[i].substring(0, 1).toUpperCase();
			String LeftLatter = ar[i].substring(1);

			ar[i]=FirstLatter+LeftLatter;

			System.out.print(ar[i]+" ");
		}

	}

}
