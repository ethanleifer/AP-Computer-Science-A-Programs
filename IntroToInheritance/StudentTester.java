// StudentTester.java

// February 15, 2018
// Ethan Leifer


/*

Tests the Student Heirarchy of Classes:

- Student
- Grad
- UnderGrad


*/



public class StudentTester 
{
	public static void main(String[] args) 
	{
		int[] scores1 = {60, 79, 79};
		int[] scores2 = {75,95,87};
		
		Student student1 = new UnderGrad("Dylan", scores1, "Pass");
		Student student2 = new Grad("Sergio", scores1, "Fail", 23);
		
		student1.computeGrade();
		student2.computeGrade();
		
		Student[] myStudents = new Student[2];
		myStudents[0] = student1;
		myStudents[1] = student2;
		
		for (Student s : myStudents) {
			System.out.println(s);
			if (s instanceof Grad)
			{
				System.out.println(" and has an ID  of " + ((Grad) s).getID()   );
			}
		}
		
		//System.out.println(student2.getGradID); // THIS WONT WORK BC A STUDENT OBJECT CANT ACCESS GRAD METHODS
		System.out.println(student1);
		System.out.println(student2);
	}
}