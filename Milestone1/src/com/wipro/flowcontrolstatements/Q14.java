package com.wipro.flowcontrolstatements;

public class Q14 {
public static void main(String[] args) {
	
	String var=args[0];
	int num=Integer.parseInt(var);
	int i;
	int sum=0;

	for(i=num;i>0;i/=10)
	{
		sum+=(i%10);
	}
	System.out.println(sum);
}
}
