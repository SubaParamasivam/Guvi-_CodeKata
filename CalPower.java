import java.util.*;
/**
* <h1>Calculate power value.</h1>
* The CalPower program implements an application
* that calculate the power value of an integer where
* base and power integers are input and print the 
* calculated power value as output on the screen.
* <p>
* 
* Sample input :2 4
* Sample output: 16
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-01
*/
public class CalPower
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */	
    public static void main(String args[])
    {
      int base,power,tmp=1;
      Scanner sc=new Scanner(System.in);
	  base=sc.nextInt();
	  power=sc.nextInt();
	  if(power==0)
		  tmp=1;
	  else
	  {
	  for(int i=1;i<=power;i++)
		  tmp=tmp*base;
	  }	  
	  System.out.println(tmp);
    }
}
