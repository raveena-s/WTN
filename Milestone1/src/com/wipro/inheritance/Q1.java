package com.wipro.inheritance;

class Animal{
	
	void eat()
	{
		System.out.println("An animal eats");
	}
	void sleep()
	{
		System.out.println("An animal sleeps");
	}
}
class Bird extends Animal{
	
	@Override
	void eat()
	{
		System.out.println("A bird eats");
	}
	
	@Override
	void sleep()
	{
		System.out.println("A bird sleeps");
	}
	
	void fly()
	{
		System.out.println("A bird flies");
	}
}
public class Q1 {
	
	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.eat();
		a.sleep();
		
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
