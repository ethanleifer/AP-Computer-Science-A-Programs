// ArrayListIntro.java

// Ethan Leifer
// November 12, 2018

//imports:
import java.util.ArrayList;


public class ArrayListIntro
{
	public static void main(String[] args) 
	{
		// this creates and intializes an array list of Strings
		ArrayList<String> names = new ArrayList<String>();
		
		//String[] arr = new String[10];		
		
		names.add("Rohan");
		names.add("Emily");
		names.add("Neelan");
		names.add("Emily");
		
		names.add(1, "Reed");
		
		
		System.out.println("ArrayList: " + names);
		//System.out.println("Standard Array: " + arr);
		
		names.remove("Parth");
		System.out.println("ArrayList: " + names);
		
		names.add("Matt");
		names.add("Mena");
		names.add("Helen");
		names.add("Jenny");
		
		
		//regular for loop
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		//for each loop!!
		for(String name: names)
		{
			System.out.print(name + " ");
		}
		System.out.println("\n");
		names.add("Jenny");
		names.add("Emily");
		names.add("Emily");
		names.add("Jenny");
		
		System.out.println(names);
		
		for (int i = 0; i < names.size(); i++)
		{
			if(names.get(i).equals("Emily"))
			{
				names.remove(i);
			}
		}
		System.out.println(names);
	}
}