import java.util.*;
/**
* <h1>Check letter or not</h1>
* The Alphabet program implements an application that
* checks whether the given charcter is alphabet
* or number and prints it as output on the screen.
* <p>
* 
* Sample input : a 
* Sample output: Alphabet
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-28
*/
public class Alphabet
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */	
    public static void main(String args[])
    {
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        if(Character.isUpperCase(c) || Character.isLowerCase(c))
        System.out.println("Alphabet");
	    else
	    System.out.println("No");
    }
}
