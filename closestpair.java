import static java.lang.Math.*;
import java.util.*;

class closestpair
{
	public static void main(String sss[])
	{
		int i=0,temp=0;
		Random robj=new Random();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements for the array:");
		double a[]=new double[in.nextInt()];
		
		for(int l=0;l<a.length;l++)
			a[l]=robj.nextDouble()*10;
		
		double diff,smallest_diff=abs(a[1]-a[0]);
		Arrays.sort(a);
		
		for(;i<a.length-1;i++)             // sorting imparts the property on the array that
		{                                 // each element a is next to an element which is either equal or the smallest larger
			diff=abs(a[i+1]-a[i]);       // integer than that element a, so the difference is the smallest possible number for a given number.
			if(diff<smallest_diff)     // as index distance from an element increases, the difference between the element
			{		                   // any element further along the array index, also becomes larger, largest difference being   
				smallest_diff=diff;		// the difference between the first and the last elements
				temp=i;	
			}										
		}
		System.out.println("\nFor Array: " + Arrays.toString(a));
		System.out.println("Smallest Difference: "+ smallest_diff+ " between the numbers:" + a[temp]+" and "+ a[temp+1] );										/*for(;i<a.length;i++)
												
		/* brute force method
		for(j=i+1;j<a.length;j++)
		{
		    diff=abs(a[j]-a[i]);
			if(diff<smallest_diff)
			smallest_diff=diff;
		}*/			
	}
}	