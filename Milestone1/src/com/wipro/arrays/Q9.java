package com.wipro.arrays;

public class Q9 {
public static void main(String[] args) {
	
	int n=args.length;
	int arr[]=new int[n];
	int temp[]=new int[n];
	int i,j;
	for(i=0;i<n;i++)
	{
		arr[i]=Integer.parseInt(args[i]);
	}
	j=0;
	for(i=0;i<n;i++)
	{
		if(arr[i]!=10)
		{
			temp[j++]=arr[i];
		}
	}
	for(i=j;i<n;i++)
	{
		temp[i]=0;
	}
	for(i=0;i<n;i++)
	{
		System.out.print(temp[i]+" ");
	}
}
}
