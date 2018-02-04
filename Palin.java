import java.util.*;
/**
* <h1>Check Palindrome or not</h1>
* The Palin program implements an application
* that check whether the given integer is palindrome 
* or not and print the output on the screen.
*
* <p>
* 
* Sample input : 252
* Sample output: yes
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-03
*/
public class Palin
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */	
    public static void main(String args[])
    {
      int n,s=0,tmp,r;
      Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
	tmp=n;
	  while(n>0)
	  {
		 r=n%10;
		 s=(s*10)+r;
		 n=n/10;
	  }
	  if(s==tmp)
		  System.out.println("yes");
          else
		  System.out.println("no");
    }
}
