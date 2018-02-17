import java.util.*;
/**
* <h1>print median element</h1>
* The Median program implements an application
* that prints the median element from the  
* given array of integers and print it as 
* output on the screen.
*
* <p>
* 
* Sample input : 3
                 1 7 2
* Sample output: 2
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-17
*/
class Median
{
	/**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
	public static void main(String args[])
	{
		int n,a[],tmp,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=n/2;
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
		
		System.out.print(a[m]);
	}
}