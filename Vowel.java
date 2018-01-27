import java.util.*;
/**
* <h1>Check vowel</h1>
* The Vowel program implements an application that
* checks whether the given charcter is vowel
* or consonant and prints it as output on the screen.
* <p>
* 
* Sample input : a 
* Sample output: Vowel
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-28
*/
public class Vowel
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
        if(c=='a' ||c=='e' ||c=='i' || c=='o' || c=='u')
        System.out.println("Vowel");
        else 
        System.out.println("Consonant");
    }
}
