//

// October 30, 2018

//imports:
import java.util.Scanner;



public class ArrayIntro
{
	public static void main(String[] args)
	{
		/*String[] names = new String[5];
		
		names[0] = "Mena";
		names[1] = "Rohan";
		names[2] = "Helen";
		names[3] = "Matteo";
		names[4] = "Greg";

		String[] names2 = {"Emily","Parth","Reed","Matt","Polina","Jackie"};
		
		for (int i = names2.length-1; i >= 0; i--) {
			System.out.println(names2[i]);
		}*/
		
		
		Scanner keybaord = new Scanner(System.in);
		
		String[] names;
	
		System.out.print("How many names? ");
		int numNames = keyboard.nextInt();
		
		names = new String[numNames];
		System.out.print("Please enter a name: ");
		String newName = keyboard.nextLine();
		
		int currentIndex = 0;
		while(currentIndex<numNames)
		{
			names[currentIndex] = newName;
			currentIndex +=1;

			
			System.out.print("Please enter a name: ");
			newName = keyboard.nextLine();
			
		}
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
