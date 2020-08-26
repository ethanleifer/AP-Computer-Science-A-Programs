public class Rectangle {
	private double length,width;
	private double xCenter,yCenter;
	
	public Rectangle()
	{
		length = 1;
		width = 1;
		xCenter = 0;
		yCenter = 0;
	}
	public Rectangle(double l, double w, double x, double y)
	{
		length = l;
		width = w;
		xCenter = x;
		yCenter = y;
	}
	
	//getters
	public double getWidth()
	{return width;}
	
	public double getLength()
	{return length;}
	
	public double[] getCoordinates()
	{
		double[] coords = {xCenter,yCenter};
		return coords;
		
	}
	
	public String toString()
		{
			String result = "A Rectangle has a length of " + length + " and a width of " + width + ". It is centered at (" + xCenter + "," + yCenter + ")";
			return result;
		}

	
	
}