package com.wipro.arrays;

public class Q12 {
	public static void main(String[] args) {
		
		int x=args.length;
		int n,i;
		n=3;
		int a[]=new int[n];
		int b[]=new int[x-n];
		int c[]=new int[2];
		for(i=0;i<n;i++)
		{
		 a[i]=Integer.parseInt(args[i]);
		}
		for(i=n;i<x;i++)
		{
			b[i-n]=Integer.parseInt(args[i]);
		}
		c[0]=a[1];
		c[1]=b[1];
		for(i=0;i<2;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
