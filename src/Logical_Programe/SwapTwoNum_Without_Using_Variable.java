package Logical_Programe;

public class SwapTwoNum_Without_Using_Variable 

{
	public static void main(String[] args)
	{
		
		int num1=10;
		int num2=20;
		
		
		System.out.println("before swaping num : " + num1 + " and " + num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		
		System.out.println("after swaping num  : " + num1 + " and " + num2);
		
	}

}
