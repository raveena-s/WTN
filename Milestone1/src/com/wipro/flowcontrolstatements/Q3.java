package com.wipro.flowcontrolstatements;

public class Q3 {
	public static void main(String[] args) {
		
		int n=args.length;
		int i;
		if(n==0)
		{
			System.out.println("No values");
		}
		else
		{
			for(i=0;i<n-1;i++)
			{
				System.out.print(args[i]+",");
			}
			System.out.print(args[n-1]);
		}
	}

}
