package Generalization;

public class testGeneralization_animal 
{
	public static void main(String[] args) 	
	{
		System.out.println("Features of cat");
		cat c=new cat();
		c.colour();
		c.weight();
		c.size();
		c.quality();
		
		System.out.println("Features of dog");
		dog d=new dog();
		d.colour();
		d.weight();
		d.size();
		d.quality();		
	}

}
