package bhushan;

public class demo12   //print facto of 5

{
public static void main(String[] args)

{
	int num=5;
	int fact =1;
	
	for(int i=num; i>=1; i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
