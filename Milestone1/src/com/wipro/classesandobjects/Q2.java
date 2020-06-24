package com.wipro.classesandobjects;

class Calculator
{
	Calculator()
	{
		
	}
	static double powerInt(int num1,int num2)
	{
		return Math.pow((double)num1, (double)num2);
	}
    static double powerDouble(double num1,double num2)	
    {
    	return Math.pow(num1, num2);
    }
}
public class Q2 {
	
	public static void main(String[] args) {
		
		int a=3;
		int b=2;
		double x=2.5;
		double y=2;
		System.out.println("integers num1 raised to power num2: "+Calculator.powerInt(a, b));
		System.out.println("doubles num1 raised to power num2: "+Calculator.powerDouble(x, y));
	}

}
