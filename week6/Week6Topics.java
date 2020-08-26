// Week6Topics.java

// Ethan Leifer
// October 8, 2018

public class Week6Topics
{
  public static void main(String[] args)
  {
    /*
    System.out.println("Ho there, World!");
    System.out.println(Week6Utils.sayHelloWorld("How are you?"));
    */
    int y = 18, d = 198;
    double age = Week6Utils.getExactAge(y,d);
    System.out.printf("You are exactly %4.1f years old EXACTLY!\n", age);
    System.out.println("Colloquially, you are " + y + "  years old.");
  }

}
