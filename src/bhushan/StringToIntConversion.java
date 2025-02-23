package bhushan;

public class StringToIntConversion 
{
	public static void main(String[] args) 
	{

		//convert String to int 
		String StringNumber="123";
		int intValue = Integer.parseInt(StringNumber);
		System.out.println("string: "+ StringNumber);
		System.out.println("int: "+ intValue);

		System.out.println("------------------------");

		//convert int to String
		int intNumber=456;
		String StringValue=String.valueOf(intNumber);
		System.out.println("int: "+ intNumber);
		System.out.println("string: "+ StringValue);

		System.out.println("--------------------------");

		//IntegerToStringConversion
		Integer integerValue=123;
		String StringValues = integerValue.toString();
		System.out.println("integer: "+integerValue); 
		System.out.println("string: "+ StringValues);
		
		System.out.println("--------------------------");
		
		//convert String to int 
		String StringNumbe="123";
		int intValu = Integer.valueOf(StringNumbe);
		System.out.println("string: "+ StringNumbe);
		System.out.println("int: "+ intValu);
		
		
		
		
		
		
	}
}
