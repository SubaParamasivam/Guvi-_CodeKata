import java.util.*;
/**
* <h1>Check Greatest</h1>
* The Largestnumber program implements an application that
* prints the largest number as output on the screen from the
* given three integers as input.
* <p>
* 
* Sample input : 2 7 4 
* Sample output: 7
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-28
*/
public class Largestnumber
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */	
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        System.out.println(a);
		else if(b>c)
		System.out.println(b);
	    else
	    System.out.println(c);
    }
}
