// ShapeTester.java

// Ethan Leifer
// February 22, 2019

// Tests shape.java and Circle.java


public class ShapeTester 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle(2,0,0);
		Circle c2 = new Circle(5,3,7);
		
		Rectangle r1 = new Rectangle(2, 2);
		Rectangle r2 = new Rectangle(2, 2);

		if (c1.compareTo(r1) < 0)
			System.out.println(c1 + " is less than " + r1);
		else 
			System.out.println(c1 + " is greater than or equal to " + r1);
 
	}
}