import java.util.*;
/**
* <h1>print 5 multiples of given integer</h1>
* The Multiples program implements an application
* that prints the first 5 multiples of given integer
* and print it as output on the screen.
*
* <p>
* 
* Sample input : 4
* Sample output: 4 8 12 16 20
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-05
*/
public class Multiples
{
	/**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
	public static void main(String arggs[])
	{
		int n,m=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			m=n*i;
			System.out.print(m+" ");
		}
	}


}