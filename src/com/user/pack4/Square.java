package com.user.pack4;

public class Square extends Shapes
{
	public void lines()
	{
		System.out.println("i require four line segment");
	}
	public static void main(String[] args)
	{
		Shapes s=new Square();
		s.lines();
	}

}
