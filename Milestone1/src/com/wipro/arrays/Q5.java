package com.wipro.arrays;
import java.util.*;
public class Q5 {
	public static void main(String[] args) {
		
		int n=args.length;
		int[] arr=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(arr);
		System.out.println("Largest 2 numbers in the array are "+arr[n-1]+"and"+arr[n-2]);
		System.out.println("Smallest 2 numbers in the array are "+arr[0]+"and"+arr[1]);
	}

}
