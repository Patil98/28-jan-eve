package bhushan;

public class Patil 
{
	public static void main(String[] args) 
	{
		String s="bhushan";
		String s1=s+"patil";
		System.out.println(s1);
		System.out.println(s);


		StringBuffer s2 = new StringBuffer("bhushan");	
		StringBuffer append = s2.append(123);
		System.out.println(append);

	}

}
