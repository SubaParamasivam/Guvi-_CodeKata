import java.util.*;
/**
* <h1>Check Number </h1>
* The Number program implements an application that
* simply checks whether the given number is positive 
* or negative or zero and prints it as output on the screen.
* <p>
* 
* Sample input : 25
* Sample output: Positive
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-26
*/
public class Number
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */	
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==0)
        System.out.println("Zero");
        else if(n>0)
        System.out.println("Positive");
        else if(n<0)
        System.out.println("Negative");
    }
}
