// RecursionIntro.java
// By Ethan Leifer
// December 12, 2018 

//imports:
import java.util.Scanner;
import javax.xml.transform.*;


public class RecursionIntro 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a non-negative whole number: ");
        int num = keyboard.nextInt();
        
        //System.out.println(num + "! = " + factIterative(num));
        
        for (int i = 0; i <= num; i++) 
        {
            System.out.println("FiboIterative("+ i + ") = " + fiboIterative(i));
        }
        for (int i = 0; i <= num; i++) 
        {
            System.out.println("FiboRecursive("+ i + ") = " + fiboRecursive(i));
        }
    }

// factorial methods
    public static int factRecursive(int n)
    {
        // 0!= 1: base case
        if (n==0) 
            return 1;
        else
            return n* factRecursive(n-1);
    }
    
    public static int factIterative(int n)
    {
        //iterative version of the factorial function
    
        int result = 1;
        for (int k = n; k>=1;k--)
        {
            result *=k;
        }
        return result;
    }

    public static int fiboRecursive(int n)
    {
        //
        if (n<2)
            return n;
        return fiboRecursive(n-1) + fiboRecursive(n-2);

    }
    
    public static int fiboIterative(int n)
    {
        if (n<2)
            return n;
        int f0 = 0, f1 = 1;
        int f2 = f1 + f0;
        for (int i = 3; i <= n; i++) {
            f0 = f1; 
            f1 = f2; 
            f2 = f0+f1;
        }
        return f2;
    }
}