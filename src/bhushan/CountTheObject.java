package bhushan;

public class CountTheObject 
{
	static int count=0;

	public CountTheObject()
	{
		count++;
	}

	public static void main(String[] args) 
	{
		CountTheObject c1 = new CountTheObject();
		CountTheObject c2 = new CountTheObject();

		System.out.println("number of objects: "+count);
	}

}
