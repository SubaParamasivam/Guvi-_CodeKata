import java.util.*;
/**
* <h1>Check Prime or not</h1>
* The Prime program implements an application
* that check whether the given integer is prime 
* or not and print the output on the screen.
*
* <p>
* 
* Sample input : 113
* Sample output: yes
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-03
*/
public class Prime
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
    public static void main(String args[]) 
	{
        int n;
        String res="yes";
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int len=n/2;
        for(int i=2;i<len;i++)
        {
          if(n%i==0)
		  {
			  res="no";
			  break;
		  }
		}
		System.out.println(res);       
        
    }
}
