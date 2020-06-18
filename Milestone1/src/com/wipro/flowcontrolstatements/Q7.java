package com.wipro.flowcontrolstatements;

public class Q7 {
	public static void main(String[] args) {
		
		char var='M';
		int asc=var;
		if(97<=asc&&asc<=122)
		{
			asc=asc-32;
		}
		else
		{
			asc=asc+32;
		}
		var=(char)asc;
		System.out.println(var);
	}

}
