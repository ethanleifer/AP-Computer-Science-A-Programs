// Grad.java extends Student

// February 14, 2019
// Ethan Leifer
// Part of Student Heirarchy (Undergrad, Grad, Student)




public class Grad extends Student
{
	private int myGradID;
	
	public Grad()
	{
		super();
		myGradID = 0;
	}
	public Grad(String name, int[] tests,String grade,int gradID)
	{
		super(name,tests,grade);
		myGradID = gradID;
	}
	
	public int getID()
	{ return myGradID;}
	
	public void computeGrade()
	{
		super.computeGrade();
		if(getTestAverage() >= 90)
		{
			setGrade("Pass with distinction");
		}
		
	}
}