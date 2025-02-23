package interface_ImplementationClass;

import Array.example10;

public class Example10 implements Example9 
{
	public void m1() 
	{

		System.out.println("patil");
	}

	public void m2() 
	{

		Example9.super.m2();
	}

	public void m3() 
	{

		System.out.println("bhushan");
	}

	public void m4() 
	{

	}

	public static void main(String[] args) 
	{
		Example10 e = new Example10();
		e.m1();
		e.m2();
	}






}
