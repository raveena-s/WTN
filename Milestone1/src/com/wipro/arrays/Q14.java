package com.wipro.arrays;

public class Q14 {
	public static void main(String[] args) {
		
		int n=args.length;
		if(n!=9)
		{
			System.out.println("Please enter 9 integer numbers");
			return;
		}
		int p=3;
		int i,j,q,max;
		i=p;j=p;
		q=0;
		int a[][]=new int[p][p];
		for(i=0;i<p;i++)
		{
			for(j=0;j<p;j++)
			{
					if(q<n)
					{
					a[i][j]=Integer.parseInt(args[q]);
					q++;
					}
				}
			}
		max=a[0][0];
		for(i=0;i<p;i++)
		{
			for(j=0;j<p;j++)
			{
				if(a[i][j]>max)
						max=a[i][j];
				
			}
		}
		System.out.println("The given array is: ");
		for(i=0;i<p;i++)
		{
			for(j=0;j<p;j++)
			{
	         	System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
		
		System.out.println("The biggest number in the given array is "+max);
	}

}
