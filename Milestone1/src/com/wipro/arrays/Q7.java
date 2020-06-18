package com.wipro.arrays;

import java.util.Arrays;

public class Q7 {
	public static void main(String[] args) {
	     
		int n=args.length;
		int i,j;
		int arr[]=new int[n];
		int t[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
	   Arrays.sort(arr);
	  j=0;
	  for(i=0;i<n-1;i++)
	  {
		  if(arr[i]!=arr[i+1])
		  {
			  t[j++]=arr[i];
		  }
	  }
	  t[j++]=arr[n-1];
	  for(i=0;i<j;i++)
	  {
		  System.out.print(t[i]+" ");
	  }
	
	}

}
