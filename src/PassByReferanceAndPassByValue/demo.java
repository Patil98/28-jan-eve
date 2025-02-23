package PassByReferanceAndPassByValue;

public class demo 
{
	public static void main(String[] args) 
	{
		car a=new car();
		a.name="BMW";
		a.mileage=5.5f;
		a.cost=75;

		System.out.println(a.name);
		System.out.println(a.mileage);
		System.out.println(a.cost);

		car b;      //that is a referance because "new" is not there 
		b=a;
		System.out.println(b.name);    //change made by b will affect a and vice-versa, because a and b are the same
		System.out.println(b.mileage);
		System.out.println(b.cost);

		b.name="TATA";
		b.mileage=15.8f;
		b.cost=13;
		System.out.println(b.name);
		System.out.println(b.mileage);
		System.out.println(b.cost);


		System.out.println(a.name);
		System.out.println(a.mileage);
		System.out.println(a.cost);

	}

}
