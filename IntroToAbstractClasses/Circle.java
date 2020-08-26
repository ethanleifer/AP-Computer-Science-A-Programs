// Circle.java

// Ethan Leifer
// February 22, 2019

// extends Shape.java
public class Circle extends Shape
{
	//instance fields
	private double myRadius;
	private double xCtr, yCtr;
	
	
	//constructor
	public Circle(double radius, double x, double y)
	{
		super("Circle");
		myRadius = radius;
		xCtr = x;
		yCtr = y;
	}
	

	public double getArea()
	{return myRadius * myRadius * Math.PI;}
	
	
	public double getPerimeter()
	{return 2 * myRadius * Math.PI;}
	
	
	//getters
	public double getRadius()
	{return myRadius;}
	
	public double getXCenter()
	{return xCtr;}
	
	public double getYCenter()
	{return yCtr;}
	
	
	//toString
	public String toString()
	{
		return getType() + " with a radius of " + myRadius;
	}
	
}