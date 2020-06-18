package com.wipro.arrays;

public class Q1 {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3};
		int n=arr.length;
		int i;
		int sum=0;
		float avg=0.0f;
		for(i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		avg=sum/n;
		System.out.println("Sum of array elements is "+sum);
	   System.out.println("Average of array elements is "+avg);
	}
	

}
