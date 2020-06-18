package com.wipro.flowcontrolstatements;

public class Q5 {
public static void main(String[] args) {
	char var='i';
	int asc=var;
	if((65<=asc&&asc<=90)||(97<=asc&&asc<=122))
	{
		System.out.println("Alphabet");
	}
	else if(48<=asc&&asc<=57)
	{
		System.out.println("Digit");
	}
	else
	{
		System.out.println("Special Character");
	}
}
}
