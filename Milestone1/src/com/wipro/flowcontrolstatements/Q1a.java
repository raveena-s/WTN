package com.wipro.flowcontrolstatements;

public class Q1a {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a<0)
		{
			System.out.println("Given integer, "+a+" is negative");
		}
		else if(a==0)
		{
			System.out.println("Given integer, "+a+" is zero");
		}
		else
		{
			System.out.println("Given integer, "+a+" is positive");
		}
	}

}
