import java.util.*;
/**
* <h1>Check Even or Odd </h1>
* The Evenodd program implements an application that
* simply checks whether the given number is even
* or odd and prints it as output on the screen.
* <p>
* 
* Sample input : 4
* Sample output: Even
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-28
*/
public class Evenodd
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
        if(n%2==0)
        System.out.println("Even");
        else 
        System.out.println("Odd");
    }
}
