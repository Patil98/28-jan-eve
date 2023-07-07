package Generalization;

public class TestGeneralization 

{
	public static void main(String[] args)
	
	{
		System.out.println("Features of Jio simcard");
		Jio j=new Jio();
		j.sms();
		j.AudioCalling();
		j.data();
		j.featureA();
	
		System.out.println("......................");
		
		System.out.println("Features of vi simcard");
		VI v=new VI();
		v.sms();
		v.AudioCalling();
		v.data();
		v.featureC();
		
		System.out.println("......................");
		
		System.out.println("Features of Airtel simcard");
		Airtel a=new Airtel();
		a.sms();
		a.AudioCalling();
		a.data();
		a.featureB();
		
	}

}
