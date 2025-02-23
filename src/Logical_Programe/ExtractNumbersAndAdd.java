package Logical_Programe;

public class ExtractNumbersAndAdd
{ 
	public static void main(String[] args) 
	{
		String name = "123bhushan123";
		int sum =0;

		String num = name.replaceAll("\\D", "");
		Integer a = Integer.valueOf(num);    

		while(a!=0)
		{
			sum+=a%10;
			a=a/10;
		}

		System.out.println("Output: "+ sum); // Output: 12
	}
}

