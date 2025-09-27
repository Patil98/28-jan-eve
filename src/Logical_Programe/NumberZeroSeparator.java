package Logical_Programe;

public class NumberZeroSeparator
{
	public static void main(String[] args) 
	{
		int[] arr = {2, 3, 0, 5, 0, 9, 0, 6, 0, 4, 0, 7, 0, 5, 0};

		// Separate numbers and zeros
		String numbers = "";
		String zeros = "";

		for(int num : arr) 
		{
			if (num!=0)
			{
				numbers=numbers+num;
			}
			else 
			{
				zeros=zeros+num;
			}
		}

		// Display the separated numbers and zeros
		System.out.println(numbers+zeros);

	}
}
