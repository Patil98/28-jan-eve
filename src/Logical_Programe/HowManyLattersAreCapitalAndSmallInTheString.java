package Logical_Programe;

public class HowManyLattersAreCapitalAndSmallInTheString
{

	public static void main(String[] args) 
	{
		String s="bhUsHan PaTIl";

		int capitalCount=0;
		int SmallCount=0;

		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
			{	
				//System.out.println("uppercase: "+ch);
				capitalCount++;
			}
			else if (Character.isLowerCase(ch))
			{
				//System.out.println("lowercase: "+ch);
				SmallCount++;
			}

		}

		System.out.println("capitals Latters --> "+ capitalCount);
		System.out.println("Small Latters --> "+ SmallCount);
	}

}
