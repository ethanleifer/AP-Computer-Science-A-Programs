//Week6Utils.java

// Ethan Leifer
// October 9, 2018

public class Week6Utils
{
  /**
    A method to compute an exact age as a double precision number
    from age in years and number of days since last birthday.
    Precondition: years > 0, days >= 0

    @return age as a double precision number
    @param years whole number age in years
    @param days the number of days in years since last birthday
    */
  public static double getExactAge(int years, int days)
  {

  // 1. Create a constant for the number of days in a year
  final int DAYS_IN_YEARS = 365;

  // 2. Create a varible for the exact age
  double exactAge;

  // 3. Assign the varible for its value
  exactAge = years + (double)days/DAYS_IN_YEARS;

  // 4. return the variable
  return exactAge;

  }

  public static String sayHelloWorld(String greeting)
  {
    return "Hello, World! " + greeting;
  }
}
