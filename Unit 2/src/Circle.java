//© A+ Computer Science  -  www.apluscompsci.com
//Name - Kelly Zhong
//Date - 2-6-18
//Class - Period 1
//Lab  -

import java.lang.Math;

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = 3.14159 * Math.pow(radius, 2);
	}

	public void print( )
	{
		System.out.println("The area is:: " + area);
	}
}