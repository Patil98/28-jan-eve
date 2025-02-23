package Casting;

public class testUpCasting1 
{
	public static void main(String[] args) 
	{

		grand_father1  g1 = new son1();
		g1.car();
		g1.money();
		g1.home();
		//g1.bike();
		//g1.mobile();

		System.out.println(".................");

		father1 h1 = new son1();
		h1.bike();
		h1.car();
		h1.money();
		h1.home();
		//h1.mobile();



	}



}
