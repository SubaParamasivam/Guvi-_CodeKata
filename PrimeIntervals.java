import java.util.*;
/**
* <h1>Print Prime numbers between intervals</h1>
* The PrimeIntervals program implements an application
* that prints the prime numbers between the 
* given two integers.
*
* <p>
* 
* Sample input : 2 10
* Sample output: 3 5 7
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-04
*/
public class PrimeIntervals
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
    public static void main(String args[]) 
	{
        int a,b,flag=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
		b=sc.nextInt();
    	for(int i=a+1;i<b;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				else
					flag=0;
			} 
		if(flag==0)
			System.out.print(i+" ");
		}		
    }
}
