// Student.java

// Ethan Leifer
// February 24, 2019




public class Student 
{
	// instance fields
	private String myName;
	private int[] myTests;
	private String myGrade;
	
	// class varible
	public final static int NUM_TESTS = 3;
	
	// constructors
	
	public Student()
	{
		myName = "";
		myTests = new int[NUM_TESTS];
		myGrade = "";
	}	
	
	public Student(String name, int[] tests, String grade)
	{
		myName = name;
		myTests = tests;
		myGrade = grade;
	}
	
	public String getName()
	{return myName;}
	
	public String getGrade()
	{return myGrade;}
	
	public void setGrade(String grade)
	{myGrade = grade;}
	
	public double getTestAverage()
	{
		double total = 0.0;
		for (int i = 0; i < myTests.length; i++) 
		{total += myTests[i];}
		return total/3;
	}
	
	public void computeGrade()
	{
		if (myName.equals(""))
		{myGrade = "No grade";}
		else if(getTestAverage() > 65)
		{myGrade = "Pass";}
		else
		{myGrade = "Fail";}
	}
	
	public String toString()
	{
		return "Student: " + myName + " has a test average of " + getTestAverage() + " and a grade of " + myGrade;
	}
}