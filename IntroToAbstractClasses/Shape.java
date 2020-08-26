// shape.java 

// Ethan Leifer
// February 22, 2019

// an abstract class to implement a shape

public abstract class Shape implements Comparable
{
	// instance fields
	private String myType;
	
	// constructor
	public Shape(String type)
	{myType = type;}
	
	public int compareTo(Object other)
	{
		
		// point of percsion
		final double EPSILON = 1.0e-15;
		
		Shape othershape = (Shape) other;
		
		// difference between Shape Areas
		double diff = getArea()- othershape.getArea();
		
		if (Math.abs(diff) <= EPSILON) 
			{return 0; } 
			
		else if (diff > 0)
		
			{return 1;}
			
		else 
			{return -1;}
		
	}
		public String getType()
	{return myType;}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}