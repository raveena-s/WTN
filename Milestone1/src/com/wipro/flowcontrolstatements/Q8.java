package com.wipro.flowcontrolstatements;

public class Q8 {
	public static void main(String[] args) {
		
		char var=args[0].charAt(0);
		String msg;
		switch(var)
		{
		case 'R':
			msg="Red";
			break;
		case 'B':
			msg="Blue";
			break;
		case 'G':
			msg="Green";
			break;
		case 'O':
			msg="Orange";
			break;
		case 'Y':
			msg="Yello";
			break;
		case 'W':
			msg="White";
			break;
		default:
			msg="Invalid Code";
		}
		System.out.println(msg);
		
	}

}
