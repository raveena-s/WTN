package com.wipro.overridingandpolymorphism;

class Fruit
{
	String name;
	String taste;
	String size;
	
	void eat()
	{
		System.out.println("Name of the fruit is: "+name);
		System.out.println("Taste of the fruit is: "+taste);
	}
}

class Apple extends Fruit
{
	Apple()
	{
		super.name="apple";
		super.taste="sweet";	
	}
	
	@Override
    void eat()
	{
		System.out.println("Name of the fruit is apple");
		System.out.println("Taste of apple is sweet");
	}
	
}

class Orange extends Fruit
{
	Orange(){
	super.name="orange";
	super.taste="sweet but sour";
	}
	
	@Override
	void eat()
	{
		System.out.println("Name of the fruit is orange");
		System.out.println("Taste of orange is sweet but sour");
	}
}
public class Q1 {
	
	public static void main(String[] args) {
		
		Apple a=new Apple();
		a.eat();
		Orange o=new Orange();
		o.eat();
	}

}
