package Logical_Programe;

public class Count_the_sum_of_number_in_a_string 
{
	
	public static void main(String[] args) 
	{
		String s ="1PREP2INSTAA6";
		int sum=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
			 sum=sum+Character.getNumericValue(s.charAt(i));
			}
		}
        System.out.println("Sum of all the digit present in String : "+sum);
		
	}

}
