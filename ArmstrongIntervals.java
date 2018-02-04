import java.util.*;
/**
* <h1>Print Armstrong numbers between intervals</h1>
* The ArmstrongIntervals program implements an application
* that prints the Armstrong number between two given integers
* as the output on the screen.
*
* <p>
* 
* Sample input : 100 400
* Sample output: 153 370 371
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-05
*/
public class ArmstrongIntervals
{
    /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
	public static void main(String args[])
	{
		int a,b,n,s,r;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a+1;i<b;i++)
		{
			s=0;
			n=i;
			while(n>0)
				{
					r=n%10;
					s=s+r*r*r;
					n=n/10;	
				}
				if(s==i)
					System.out.println(i);
		}	
		
	}
}