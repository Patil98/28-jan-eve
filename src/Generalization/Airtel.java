package Generalization;

public class Airtel implements SimCard

{
	public void sms()
	{
		System.out.println("sms:200");
	}

	public void AudioCalling()
	{
		System.out.println("AC: 600");
	}

	public void data()
	{
		System.out.println("data: 2GB");
	}
	
	public void featureB()
	{
		System.out.println("Feature: B");
	}		

}
