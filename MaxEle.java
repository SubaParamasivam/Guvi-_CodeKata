import java.util.*;
/**
* <h1>print maxmimum element from given array</h1>
* The MaxEle program implements an application
* that prints the maximum element from the given 
* given array of integers and print it as 
* output on the screen.
*
* <p>
* 
* Sample input : 4
* Sample output: 1 7 4 2 
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-17
*/
class MaxEle
{
	/**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
	public static void main(String args[])
	{
		int n,a[],tmp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		System.out.println(a[n-1]);
	}
}