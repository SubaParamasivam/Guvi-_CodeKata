import java.util.*;
/**
* <h1>sum of k numbers from n numbers.</h1>
* The SumK program implements an application
* that adds the value upto k from the n values
* in an array print  it as output on the screen.
* <p>
* 
* Sample input : 5 3
                 1 2 3 4 5
* Sample output: 6
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-01
*/
public class SumK
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */	
    public static void main(String args[])
    {
      int a[],n,k,s=0;
      Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  k=sc.nextInt();
         a=new int[n];
	  for(int i=0;i<n;i++)
	  {
	    a[i]=sc.nextInt();
		if(i<=k)
		 s=s+i;
	  }
	  System.out.println(s);
    }
}
