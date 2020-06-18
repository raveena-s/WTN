package com.wipro.flowcontrolstatements;

public class Q1b {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a%10==b%10)
		{
			System.out.println("The given integers, "+a+" and "+b+" have the same last digit");
		}
		else
		{
			System.out.println("The given integers, "+a+" and "+b+" do not have the same last digit");
		}
	}

}
