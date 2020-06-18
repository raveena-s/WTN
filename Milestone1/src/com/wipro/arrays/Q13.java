package com.wipro.arrays;

public class Q13 {
	public static void main(String[] args) {
		int n=args.length;
		int org[][]=new int[n/2][n/2];
		int rev[][]=new int[n/2][n/2];
		int i,j,k;
		k=0;
		for(i=0;i<n/2;i++)
		{
			for(j=0;j<n/2;j++)
			{
				org[i][j]=Integer.parseInt(args[k++]);
			}
		}
		k=n-1;
		for(i=0;i<n/2;i++)
		{
			for(j=0;j<n/2;j++)
			{
				rev[i][j]=Integer.parseInt(args[k--]);
			}
		}
		System.out.println("The given array is: ");
		for(i=0;i<n/2;i++)
		{
			for(j=0;j<n/2;j++)
			{
				System.out.print(org[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The reverse of the array is: ");
		for(i=0;i<n/2;i++)
		{
			for(j=0;j<n/2;j++)
			{
				System.out.print(rev[i][j]+" ");
			}
			System.out.println();
		}
	}

}
