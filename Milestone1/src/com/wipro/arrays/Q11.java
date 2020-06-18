package com.wipro.arrays;

public class Q11 {
	public static void main(String[] args) {
		int n=args.length;
		int arr[]=new int[n];
		int i;
		boolean flag=true;
		for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			
		}
		for(i=0;i<n;i++)
		{
			if((arr[i]!=1)&&(arr[i]!=4))
				{
				flag=false;
				break;
				}
		}
		System.out.print(flag);
	}

}
