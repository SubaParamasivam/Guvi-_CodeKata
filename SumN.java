import java.util.*;
/**
* <h1>sum of n numbers</h1>
* The SumN program implements an application
* that adds the value upto n
* print  it as output on the screen.
* <p>
* 
* Sample input : 5
* Sample output: 15
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-29
*/
public class SumN
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */	
    public static void main(String args[])
    {
        int n,s=0;
        Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
		s=s+i;
	    System.out.println(s);
    }
}
