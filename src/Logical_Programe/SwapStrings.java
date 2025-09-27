package Logical_Programe;

public class SwapStrings {

	public static void main(String[] args) throws Exception {

		String s1="bhushan";
		String s2="patil";

		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());

		System.out.println("s1-> "+s1);
		System.out.println("s2-> "+s2);

	}

}
