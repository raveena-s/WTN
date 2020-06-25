package com.wipro.abstraction;

import java.util.Random;

abstract class Compartment
{
	abstract String notice();
}
class FirstClass extends Compartment
{
	@Override
	String notice()
	{
		return "Firstclass compartment is more comfortable.";
	}
}
class Ladies extends Compartment
{
	@Override
	String notice()
	{
		return "Ladies compartment is only for ladies.";
	}
}
class General extends Compartment
{
	@Override
	String notice()
	{
		return "General compartment ticket costs less and is affordable.";
	}
}
class Luggage extends Compartment
{
	@Override
	String notice()
	{
		return "Luggage compartment has all passengers luggage packed in for their safe journey.";
	}
}
public class TestsCompartment {
	public static void main(String[] args) {
		
		Compartment c[]=new Compartment[10];
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			int rand=r.nextInt(5);
			if(rand==1)
			{
				c[i]=new FirstClass();
			}
			else if(rand==2)
			{
				c[i]=new Ladies();
			}
			else if(rand==3)
			{
				c[i]=new General();
			}
			else if(rand==4)
			{
				c[i]=new Luggage();
			}
			else
			{
			i--;
			}
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(c[i].notice());
		}
	}

}
