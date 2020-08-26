// StringDiffing.java

// By Ethan Leifer
// ACSL Problem 2

//imports:
import java.util.Scanner;

public class StringDiffing {
	
	// First algorithm A to B
	public static String firstAlgoBtoA(String firstString, String secondString)
	{
	 	String[] splitString1 = firstString.split(" ");
		String[] splitString2 = secondString.split(" ");
		String result = "";
		//for each word in firstString
		for (int i = 0; i < splitString2.length; i++) {
			if (firstString.contains(splitString2[i]))
			{
				result += splitString2[i] + " ";
				secondString.replace(splitString2[i], "");
			}	
		}
		return result;

	}

	// First algorithm A to B
	public static String firstAlgoAtoB(String firstString, String secondString)
		{
		 	String[] splitString1 = firstString.split(" ");
			String[] splitString2 = secondString.split(" ");
			String result = "";
			//for each word in firstString
			for (int i = 0; i < splitString2.length; i++) {
				if (firstString.contains(splitString2[i]))
				{
					result += splitString2[i] + " ";
					secondString.replace(splitString2[i], "");
				}	
			}
			return result;

		}
		
	public static String secondAlgo(String firstString,String secondString)
	{
		String AtoB = firstAlgoAtoB(firstString, secondString);
		String BtoA = firstAlgoAtoB(firstString, secondString);
		String result = "";		
		int counter = 0;
		
//		int length = 0;
//		if AtoBList.length() > BtoA.length()
//			{length = AtoBList.length();}
//		else {length = BtoAList.length();}
//		
		/*for (int i = 0; i < BtoAList.length(); i++) {
			if (AtoB.contains(BtoAList[i]))
			{
				result += BtoAList[i];
				AtoB.replaceAll(BtoAList[i],);
				// have to remvoe the element in BtoaList but to do that I have to convert all the convert to list function to an array list as well as this function
				
			}
		} */
		System.out.println(BtoA.length());
		while (BtoA.length()>0 || counter <= AtoB.length())
		{
			System.out.print(counter);
			char lookingfor = AtoB.charAt(counter);
			System.out.println(BtoA);
			for (int i = 0; i < AtoB.length()-1; i++) {
				if (lookingfor == (BtoA.charAt(i)))
					{
						result += lookingfor;
						BtoA = BtoA.substring(i);
					}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("String 1:");
		String userinput1 = keyboard.nextLine();
	
		System.out.print("String 2: ");
		String userinput2 = keyboard.nextLine();
		System.out.println("Result of B to A: "+ firstAlgoAtoB(userinput1, userinput2));
		System.out.println("Result of A to B: "+ firstAlgoAtoB(userinput2, userinput1));
		
		System.out.println("Second Algorithum Produces: " + secondAlgo(userinput1,userinput2));		
	}
}