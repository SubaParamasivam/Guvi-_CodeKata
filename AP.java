 import java.util.*;
/**
* <h1>Print the sum of n terms in AP</h1>
* The AP program implements an application
* that prints the sum of n terms from the given
* values N,D,A and print it as output on the screen.
*
* <p>
* 
* Sample input : 3 1 1
* Sample output: 6
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-02-17
*/
 class AP
 {
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
 public static void main(String args[])
 {
	 int N,A,D,s=0;
	 Scanner sc=new Scanner(System.in);
	 N=sc.nextInt();
	 A=sc.nextInt();
	 D=sc.nextInt(); 
	 s=N*(2*A+(N-1)*D)/2;
	 System.out.println(s); 
 }
 }