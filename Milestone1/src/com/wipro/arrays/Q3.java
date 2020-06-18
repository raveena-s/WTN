package com.wipro.arrays;

public class Q3 {
	public static void main(String[] args) {
		
		int key=Integer.parseInt(args[0]);
		int[] arr= {3,2,78,90,12,11,45};
		int i;
		int n=arr.length;
		for(i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
	}

}
