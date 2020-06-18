package com.wipro.arrays;

public class Q2 {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,100};
		int n=arr.length;
		int min=arr[0];
		int max=arr[0];
		int i;
		for(i=1;i<n;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			else if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("The minimum element of array is "+min);
		System.out.println("The maximum element of array is "+max);
		
	}

}
