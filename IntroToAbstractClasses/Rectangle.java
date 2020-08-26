// Rectangle.java

// Ethan Leifer
// february 22, 2019

// extends Shape.java

public class Rectangle extends Shape
{
	public double myWidth;
	public double myLength;
	
	public Rectangle(double width, double length)
	{
		super("Rectangle");
		myWidth = width;
		myLength = length;
	}	
	
	public double getArea()
		{return myWidth*myWidth;}
		
		
	public double getPerimeter()
	{return 2*myWidth + 2*myWidth;}
		
	//getters
	public double getLength()
	{return myLength;}
		
	public double getWidth()
	{return myWidth;}
		
		
	//toString
	public String toString()
	{
		return getType() + " with a width of " + getWidth() + " and a length of " + getLength();
	}

}