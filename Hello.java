import java.util.*;
/**
* <h1>Print Hello n times</h1>
* The Hello program implements an application that
* checks whether the given year is leap year or not and
* print  it as output on the screen.
* <p>
* 
* Sample input : 3
* Sample output: Hello 
*                Hello
*				 Hello
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-29
*/
public class Hello
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
		for(int i=0;i<n;i++)
	    System.out.println("Hello");
    }
}
