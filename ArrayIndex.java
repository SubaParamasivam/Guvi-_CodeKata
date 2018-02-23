import java.util.*;
public class ArrayIndex
{
	public static void main(String args[])
	{
		int n,a[];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			System.out.print(a[i]+" "+i);
	}
}