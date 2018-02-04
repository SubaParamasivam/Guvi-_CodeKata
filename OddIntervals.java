import java.util.*;
/**
* <h1>Print odd numbers between two numbers</h1>
* The OddIntervals program implements an application
* that prints the odd integers between the given two integers.
*
* <p>
* 
* Sample input : 2 10
* Sample output: 3 5 7 9
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-04
*/
public class OddIntervals
{
    /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
	}
}