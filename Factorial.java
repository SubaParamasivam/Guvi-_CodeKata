import java.util.*;
/**
* <h1>Find factorial for given integer</h1>
* The Factorial program implements an application
* that calculates the factorial of given integer
*  and print it as output on the screen.
*
* <p>
* 
* Sample input : 6
* Sample output: 720
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-05
*/
public class Factorial
{
	/**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
	public static void main(String arggs[])
	{
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println(fact);
	}


}