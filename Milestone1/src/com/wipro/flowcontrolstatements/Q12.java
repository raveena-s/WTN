package com.wipro.flowcontrolstatements;

public class Q12 {
	public static void main(String[] args) {
		
		int num=Integer.parseInt(args[0]);
		int i;
		int max=num/2;
		if(num==1||num==0)
		{
			System.out.println("The given number,"+num+" is not prime");
			return;
		}
		for(i=2;i<=max;i++)
		{
			if((num%i)==0)
			{
				System.out.println("The given number,"+num+" is not prime");
				return;
			}
		}
		System.out.println("The given number,"+num+" is prime");
	}

}
