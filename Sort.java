import java.util.*;
/**
* <h1>print sorted array</h1>
* The Sort program implements an application
* that prints the sorted array from the  
* given array of integers and print it as 
* output on the screen.
*
* <p>
* 
* Sample input : 4
                 1 4 7 2
* Sample output: 1 2 4 7
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-17
*/
class Sort
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
		for(int i=0;i<n;i++)
		System.out.print(a[i]);
	}
}