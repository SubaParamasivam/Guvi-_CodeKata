import java.util.*;
/**
* <h1>count the number of digits in an integer.</h1>
* The CountInteger program implements an application
* that counts the number of digits in a given 
* integer and print  it as output on the screen.
* <p>
* 
* Sample input :1000
* Sample output: 4
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-01
*/
public class CountDigits
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */	
    public static void main(String args[])
    {
      int n,l;
      Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  l=String.valueOf(n).length();
	  System.out.println(l);
    }
}
