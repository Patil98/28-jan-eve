package StringClass;

public class Example4


{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="";
		String s3="abcd";
		String s6="abcd";
		String s4="ABCD";
		String s5="my name is bhushan";


		System.out.println(s3.equals(s6));

		System.out.println("..................");	
		System.out.println(s1.charAt(6)); // t

		System.out.println("----------------------");

//		s1=s1.toUpperCase();
//		System.out.println(s1);

		System.out.println(s1.toUpperCase());       //VELOCITY


//		s4=s4.toLowerCase();
//		System.out.println(s4);

		System.out.println(s4.toLowerCase());        //abcd

		System.out.println("-------------------------");

		System.out.println(s3.equals(s4));            // false

		System.out.println(s3.equalsIgnoreCase(s4));   // true

		System.out.println("--------------------------------");

		System.out.println(s5.contains("bhu"));




	}


}
