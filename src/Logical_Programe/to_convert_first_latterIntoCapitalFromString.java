package Logical_Programe;

public class to_convert_first_latterIntoCapitalFromString 
{
	public static void main(String[] args)
	{
		String b="bhushan";

		String pa = b.substring(0, 1).toUpperCase()+b.substring(1);
		System.out.println(pa);	
	}
}