// CircleTester.java

// Ethan Leifer
// December 3, 2018

// Tests the Circle Class

public class CircleTester
{
  public static void main(String[] args)
  {
    Circle c = new Circle();
    Circle c2 = new Circle(1,0,2);
    System.out.println("Tests the Circle.containsPoint method:");
    System.out.println("Point (1,0) is " + c.containsPoint(1,0));  // should print true
    System.out.println("Point (0,1) is " + c.containsPoint(0,1)); // should print true
    System.out.println("Point (1,1) is " + c.containsPoint(1,1)); // should print false
    System.out.println("Point (.2,.2) is " + c.containsPoint(.2,.2)); // should print true
    
    System.out.println("\nTests the Circle.overlaps method");
    System.out.println(c.overlaps(c2)); //should print true
    Circle c3 = new Circle(1,0,3);
    System.out.println(c.overlaps(c3)); // should print false
    
    
    System.out.println("\nTests the Cirle.getCoordiantes and getters for x and y Coordinates method:");
    
    System.out.println(c2.getCoordiantes()); // should print a weird value
    System.out.println("The coordiantes for c2 are ("+ c2.getXCenter() + "," + c2.getYCenter() + ")"); // should print 0,2
    c2.move(2,2);
    System.out.println("The NEW coordiantes for c2 are ("+ c2.getXCenter() + "," + c2.getYCenter() + ")"); // should print 2,4
    c2.moveTo(2, 2);
    System.out.println("The coordiantes for c2 are ("+ c2.getXCenter() + "," + c2.getYCenter() + ")"); // should print 2,2
    
    System.out.println("\nTests the circle.distancefrom method:");
    
    System.out.println(c2.distancefrom(c)); // should print 0.8284271247461903
    c2.moveTo(1,1);
    System.out.println(c2.distancefrom(c)); // should print 0
    
    system.out.println("\n\n\n" + c.getArea());
  }

}