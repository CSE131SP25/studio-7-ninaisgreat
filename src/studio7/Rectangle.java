package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width)
	{
	this.length = length;
	this.width = width;

	}
	public void draw()
	{
		StdDraw.rectangle(0.5, 0.5, length/2, width/2);
	}
public double area()
{
	double area = length * width;
	return area;
}

public double perimeter()
{
	double perimeter = 2* length + 2*width;
	return perimeter;
}
public boolean compareShape(Rectangle other)
{
	return this.area()>other.area();
}
public boolean isSquare()
{
	return length==width;
}
public static void main (String [] args)
{
	Rectangle one = new Rectangle(4,5);
	Rectangle two = new Rectangle(3,8);
	System.out.println("Area: " + one.area());
	System.out.println("Perimeter: " + one.perimeter());
	System.out.println("Is it smaller than rectangle 2?: " + one.compareShape(two));
	System.out.println("Square: " + one.isSquare());
	
	
}
}
