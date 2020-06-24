package com.wipro.classesandobjects;

class  Box{
	
	float width,height,depth;
	Box(float width,float height,float depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	float findVolume()
	{
		return width*height*depth;
	}
}

public class Q1
{
	public static void main(String[] args) {
		
		float w=10.5f;
		float h=42.0f;
		float d=65.4f;
		Box b=new Box(w,h,d);
		System.out.print("The volume of the box is: "+b.findVolume());
		
		
 }
}
