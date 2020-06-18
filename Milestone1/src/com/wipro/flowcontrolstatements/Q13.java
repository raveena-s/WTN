package com.wipro.flowcontrolstatements;

public class Q13 {
	public static void main(String[] args) {
		int i,j;
		int flag;
		for(i=10;i<=99;i++)
		{
			flag=1;
			for(j=2;j<=(i/2);j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println(i);
		}
	}

}
