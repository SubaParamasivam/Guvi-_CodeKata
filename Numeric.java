import java.util.*;
/**
* <h1>Check the string is Numeric</h1>
* The Numeric program implements an application
* that checks the given string is numeric  
* or not and print it as output on the screen.
*
* <p>
* 
* Sample input : 52
* Sample output: Yes
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-23
*/
class Numeric
{
	
	/**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
	public static void main(String args[])
	{
		String n;
		char a[];
		boolean b=true;
		Scanner sc=new Scanner(System.in);
		n=sc.next();
		a=n.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(Character.isDigit(a[i]))
				b=true;
		    else
			{
				b=false;
				break;
			}
       	}
		if(b==true)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}