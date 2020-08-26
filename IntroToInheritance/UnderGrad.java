// UnderGrad.java extends Student. java


// February 14, 2019
// Ethan Leifer



public class UnderGrad extends Student 
{
	// constructor
	public UnderGrad()
	{ super();}
	
	public UnderGrad(String name, int[] tests, String grade)
	{super(name,tests,grade);}	
	
	// overrides the inheritied computeGrade method
	public void computeGrad()
	{
		if(getTestAverage() > 70)
		{setGrade("Pass");}
		else
		{setGrade("Fail");}
	}
}