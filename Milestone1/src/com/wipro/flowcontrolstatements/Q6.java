package com.wipro.flowcontrolstatements;

public class Q6 {
	public static void main(String[] args) {
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		float poi=0.0f;
		if(gender.equals("Female"))
		{
			if(1<=age&&age<=58)
			{
			poi=8.2f;
			}
			else if(59<=age&&age<=100)
			{
			poi=9.2f;
			}
			
		}
		else if(gender.equals("Male"))
		{
			if(1<=age&&age<=58)
			{
			poi=8.4f;
			}
			else if(59<=age&&age<=100)
			{
			poi=10.5f;
			}
				
		}
		System.out.println("The percentage of interest is "+poi);
	}

}
