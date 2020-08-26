//circle.java

// Ethan Leifer
// November 28, 2018

/**
	Implements a Cirlce that constists of a radius and a center point
*/
public class Circle
{
	//define the state of a circle
	private double xCenter,yCenter;
	private double radius;


//constructors of a Circle

	/**
		Default constructor sets this circle to the unit circle centered at the orgin
	*/
	public Circle()
	{
		xCenter = 0.0;
		yCenter = 0.0;
		radius = 1.0;
	}

	/**
		Constructor allowing user to specify radius and center.
		Precondition: r>=0

		@param r the radius of the cirlce
		@param x the x coordinate of the center of the circle
		@param y the y coordinate of the center of the circle
	*/
	public Circle(double r, double x, double y)
	{
		xCenter = x;
		yCenter = y;
		radius = r;
	}


//behaviors or methods:


//getters

	/**
		returns the radius of the Circle.
		Precondition = none

		@return radius
	*/
	public double getRadius()
	{return radius;}

	/**
		returns the coordinates of the center of the Circle.
		Precondition = none

		@return double[] of the two coordiantes in (x,y)
	*/
	public double[] getCoordiantes()
	{
		double[] coords = {xCenter,yCenter};
		return coords;
	}
	
	/**
		returns the X coordinate of the Circle.
		Precondition = none
		
		@return x coordinate
	*/
	public double getXCenter()
	{return xCenter;}
	
	/**
		returns the X coordinate of the Circle.
		Precondition = none
		
		@return x coordinate
		*/
	public double getYCenter()
	{return yCenter;}
	
	
//setters

	/**
		sets the radius to a new value.
		Precondition: newRadius >= 0

		@param newRadius the new radius
	*/
	public void setRadius(double newRadius)
	{radius = newRadius;}
		
			
	//toString
	/**
		Returns the Circle as a String
		Precondition = None

		@return the Circle in a String
	*/
	public String toString()
	{
		String result = "A circle of radius " + radius + " centered at (" + xCenter + "," + yCenter + ")";
		return result;
	}


//methods

	/**
		Returns the Area of the Circle using formula area = PI * radius^2.
		Precondition = none

		@return the area of the Circle
	*/
	public double computeArea()
	{
		double area = Math.PI * radius * radius;
		return area;
	}


	/**
		Returns the circumference of the Circle using formula circumference = 2 * PI * radius.
		Precondition = none

		@return the area of the Circle
	*/
	public double computeCircumference()
	{
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}

	private double getDistanceBetween(double x1, double x2, double y1, double y2)
	{
		return Math.sqrt( (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2) );
	}
	
	/**
		returns if point (x,y) is in the circle.
		Precondition = None

		@param x the x coordinate that is check if it is in the circle.
		@param y the y coordinate that is check if it is in the circle.
		@return true if (x,y) within this circle and fasle otherwise
	*/
	public boolean containsPoint(double x,double y)
	{
		// compute the distance formula for the new point and the center of the Circle
		double distance = getDistanceBetween(x, xCenter, y, yCenter);
		// check if the distance is less than or equal to the radius return true else return false
		return distance <= radius;
	}
	
	/**
	checks if the Circle overlaps
	
	@param A Circle to see if they over
	*/
	public boolean overlaps(Circle otherCircle)
	{
		// if the distance between the two centers is less than or equal to the sum of the two radius
		
		// calculate the sum of the two radius
		double sumofradi = radius + otherCircle.radius;
		
		// calculate the distance between the two centers
		double distance = getDistanceBetween(xCenter, otherCircle.xCenter, yCenter, otherCircle.yCenter);
		
		// check if the distance between the centers neis less than the sum of the radi
		return distance <= sumofradi;
	}
	
	/**
		moves the (x,y) coordiants by the two parameters amt.
		Precondition: None
		
		@param deltaX the amt to move the x coordinate by.
		@param deltaY the amt to move the y coordinate by.
	*/
	public void move(double deltaX, double deltaY)
	{
		xCenter += deltaX;
		yCenter += deltaY;
	}
	
	/**
		moves the center of the coordinates to the parameters.
		Precondition: None
		
		@param the new Xcenter value.
		@param the new Ycenter value.
	*/
	public void moveTo(double newX, double newY)
	{
		xCenter = newX;
		yCenter = newY;
	}
	
	public double distancefrom(Circle otherCircle)
	{
	//check if the cirlces overlap (return 0 if true)
	if (overlaps(otherCircle))
		return 0;
	// compute distance formula between each circle
	double distance = getDistanceBetween(xCenter, otherCircle.xCenter, yCenter, otherCircle.yCenter);
	
	// subtract each radius
	distance = distance - radius - otherCircle.radius;
	//return that value
	return distance;
	}
}
