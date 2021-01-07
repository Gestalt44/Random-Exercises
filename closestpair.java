/*Q 1.4.16 Closest pair (in one dimension). Write a program that, given an array a[] of N
double values, finds a closest pair: two values whose difference is no greater than the
the difference of any other pair (in absolute value). The running time of your program
should be linearithmic in the worst case.*/

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
			diff=abs(a[i+1]-a[i]);    // integer than that element a, so the difference is the smallest possible number for a given number.
			if(diff<smallest_diff)    // as index distance from an element increases, the difference between the element
			{		          // any element further along the array index, also becomes larger, largest difference being the difference between the first and the last elements   
			   smallest_diff=diff;		
		           temp=i;	
			}										
		}
		System.out.println("\nFor Array: " + Arrays.toString(a));
		System.out.println("Smallest Difference is "+ smallest_diff+ " between the numbers:" + a[temp]+" and "+ a[temp+1] );										/*for(;i<a.length;i++)
												
		/* brute force method,double loops
		for(j=i+1;j<a.length;j++)
		{
		    diff=abs(a[j]-a[i]);
			if(diff<smallest_diff)
			smallest_diff=diff;
		}*/			
	}
}	
