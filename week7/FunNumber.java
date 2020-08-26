// FunNumber.java

// Ethan Leifer
// October 15, 2018

public class FunNumber
{


  /**
    Returns true if n is perfect
    and false otherwise.
    precondition: none

    @param n whole number being tested for perfect quality
    @return true if n is perfect and false otherwise
    */
  public static boolean isPerfect(int n)
  {

    //varibles:

    // 1. intialize a int varible called i set to 0
    int i;
    // 2. intialize a int varible called total set to 0
    int total = 0;


    // 3. for each number in i < n
    for(i = 1; i < n; i++)
    {
      //System.out.println("for");

      // 3a. if n does  divde evenly into 1
      if(n%i == 0)
      {
        //System.out.println("if");

        // 3aa. add i to total
        total += i;
      }
    }

    // 4. return if total is equal to n return true otherwise false
    if (total == n)
      {
        return true;
      }
      else
      {
        return false;
      }
  }


  /**
  Returns true if n is prime
  and false otherwise.
  precondition: n > 1

  @param n whole number being tested for prime quality
  @return true if n is prime and false otherwise.
  */
  public static boolean isPrime(int n)
  {
    //varibles:

    /* 1. create a varible called factor and seet it = to the
    largest whole number less than or equal to the Math.sprt of n */
    int factor = (int)Math.sqrt(n);
    // 2 .  If factor doesnt divide evenly into n, factor-1
    while (n%factor != 0)
    {
      factor--;
    }
    // check if factor is = to 1
    if (factor == 1)
    {
      // if it is return true
      return true;
    }
    //otherwise return false
    return false;
  }


  /**
    returns true if n is a perfect square
    and false otherwise
    precondition:

    @param n a whole number int being tested to see if it is a perfect square
    @return true if n is a perfect square and false otherwise
  */
  public static boolean isSquare(int n)
  {
    // 1. define a varible perfect square and set it equal to the square root of n
    double square = (double)Math.sqrt(n);

    // 2. if square is divisable by 1 then it is a perfect square return false otherwise
    if(square %1 == 0)
    {
      return true;
    }
    return false;

  }


  /**
    Returns true if n is abundant
    and false otherwise.
    precondition: none

    @param n whole number being tested for abundancy quality
    @return true if n is perfect and false otherwise
    */
  public static boolean isAbundant(int n)
  {

    //varibles:

    // 1. intialize a int varible called i set to 0
    int i;
    // 2. intialize a int varible called total set to 0
    int total = 0;


    // 3. for each number in i < n
    for(i = 1; i < n; i++)
    {
      //System.out.println("for");

      // 3a. if n does  divde evenly into 1
      if(n%i == 0)
      {
        //System.out.println("if");

        // 3aa. add i to total
        total += i;
      }
    }

    // 4. if total is greater than to n return true otherwise false
    if (total > n)
      {
        return true;
      }
      else
      {
        return false;
      }
  }


  /**
    Returns true if n is perfect
    and false otherwise.
    precondition: none

    @param n whole number being tested for perfect quality
    @return true if n is perfect and false otherwise
    */
  public static boolean isDeficient(int n)
  {

    //varibles:

    // 1. intialize a int varible called i set to 0
    int i;
    // 2. intialize a int varible called total set to 0
    int total = 0;


    // 3. for each number in i < n
    for(i = 1; i < n; i++)
    {
      //System.out.println("for");

      // 3a. if n does  divde evenly into 1
      if(n%i == 0)
      {
        //System.out.println("if");

        // 3aa. add i to total
        total += i;
      }
    }

    // 4.  if total is less than n return true otherwise false
    if (total < n)
      {
        return true;
      }
      else
      {
        return false;
      }
  }

  /**
  returns the sums of all of the intger

  @param n whole number where the digits are being added together
  @return the sum of the numbers
  */
  public static int sumDigits(int n)
  {
    // intialize a varible for the sum of the digits
    int sum;
    // while n is greater than 0
    while(n!=0)
    {
      System.out.println("while");
      // take the modulo of n and add it to sum
      sum = sum + n%10;
      // divide n by 10
      System.out.println(n);
      n = (int)n/10;
      System.out.println(n);
    }
  }
  //return sum
  System.out.println(sum);
  return 1;
}
