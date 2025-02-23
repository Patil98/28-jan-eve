package Casting;

public class TestUpCasting  //(Father and son class)

// syntax of up casting
// parent p1 = new child();

{
	public static void main(String[] args)
	{
		// create object of sub class with reference to super class

		Father f1 = new son();
		f1.car();
		f1.home();
		f1.money();
		//f1.bike();



	}


}
