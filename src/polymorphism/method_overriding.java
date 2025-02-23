package polymorphism;

import bhushan.father;

public class method_overriding 
{
	public static void main(String[] args) 
	{
		Son s1 = new Son();
		s1.bike();
		s1.car();
		s1.home();
		s1.money();

		Son1 s2 = new Son1();
		s2.laptop();
		s2.car();
		s2.home();
		s2.money();

		Father f1 = new Father();
		f1.car();
		f1.money();
		f1.home();

		subclass_1 s11 = new subclass_1();
		s11.m1();
		s11.m2();
	}
}
