package AccessSpecifiers1;

import AccessSpecifiers.Example6;            // protected access specifier


public class Example8 extends Example6

{
	public static void main(String[] args) 
	{
		Example8 s8 = new Example8();
		System.out.println(s8.c);
		s8.printsquarenum();
	}
}
