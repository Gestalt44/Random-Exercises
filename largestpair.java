import static java.lang.Math.*;
import java.util.*;

class closestpair
{
	public static void main(String sss[])
	{
		Random robj=new Random();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements for the array:");
		int a[]=new int[in.nextInt()];
		
		for(int i=0;i<a.length;i++)
			a[i]=robj.nextInt(1000);
		
		Arrays.sort(a);
		double Largest_diff=a[a.length-1]-a[0];
		System.out.println("\nFor Array: " + Arrays.toString(a));
		System.out.println("Largest Difference is "+ Largest_diff+ " between the numbers:" + a[0]+" and "+ a[a.length-1] );										
													
	}
}	