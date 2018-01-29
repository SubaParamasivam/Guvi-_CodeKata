import java.util.*;
/**
* <h1>Check Leap year</h1>
* The Leapyear program implements an application that
* checks whether the given year is leap year or not and
* print  it as output on the screen.
* <p>
* 
* Sample input : 2016
* Sample output: yes
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-29
*/
public class Leapyear
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */	
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%4==0 && a%100!=0 || a%400==0)
        System.out.println("yes");
		else
	    System.out.println("no");
    }
}
