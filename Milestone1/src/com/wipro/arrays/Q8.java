package com.wipro.arrays;

public class Q8 {
public static void main(String[] args) {
	
	int n=args.length;
	int arr[]=new int[n];
	int i,x,y;
	int sum=0;
	x=0;y=0;
	for(i=0;i<n;i++)
	{
		arr[i]=Integer.parseInt(args[i]);
		if(arr[i]==6)
		{
			x=i;
		}
		else if(arr[i]==7)
		{
			y=i;
		}
	}
	for(i=0;i<n;i++)
	{
		sum+=arr[i];
	}
	if(y>x)
	{
		for(i=x;i<=y;i++)
		{
			sum-=arr[i];
		}
	}
	System.out.println(sum);
	
}
}
