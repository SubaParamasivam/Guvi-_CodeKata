import java.util.*;
/**
* <h1>Check Armstrong number or not</h1>
* The Armstrong program implements an application
* that checks whether the given integer is 
* Armstrong or not and print it as an
* output on the screen.
*
* <p>
* 
* Sample input : 153
* Sample output: yes
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-05
*/
public class Armstrong
{
    /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
	public static void main(String args[])
	{
		int n,tmp,s=0,r;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		tmp=n;
		while(n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;			
		}
		if(s==tmp)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}