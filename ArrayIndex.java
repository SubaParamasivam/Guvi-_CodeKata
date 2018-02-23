import java.util.*;
/**
* <h1>Print the array elements with index</h1>
* The ArrayIndex program implements an application
* that prints the  array element with its index as 
* output on the screen.
*
* <p>
* 
* Sample input : 3
                5 1 3
* Sample output: 5 0
                 1 1
				 3 2
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-23
*/
public class ArrayIndex
{
	/**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
	public static void main(String args[])
	{
		int n,a[];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			System.out.print(a[i]+" "+i+"\n");
		}
	}
}