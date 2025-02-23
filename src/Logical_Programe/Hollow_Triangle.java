package Logical_Programe;

public class Hollow_Triangle 
{
	public static void main(String[] args)
	{
		//*
		//**
		//* *
		//*  *
		//*   *
		//******
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==6 || j==1 || j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
