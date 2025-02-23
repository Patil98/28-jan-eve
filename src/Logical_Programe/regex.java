package Logical_Programe;

public class regex 
{
	public static void main(String[] args) 
	{
		String s="java123is456fun";

		String all = s.replaceAll("\\d+"," ");
		System.out.println(all);          //java is fun

		System.out.println("----------");

		String al = s.replaceAll("\\D","");
		System.out.println(al);            //123456


	}
}