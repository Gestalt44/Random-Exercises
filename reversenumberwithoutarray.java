import java.util.Scanner;

class reversenumberwithoutarray
{
	public static void main(String args[])
	{
		
		int number,reversed_number=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number to be reversed:");
		number=input.nextInt();
		int divisor=1;
		int multiplyer=0;
		if(number/10==0)
			multiplyer=1;
		else if(number/100==0)
			multiplyer=10;
		else if(number/1000==0)
			multiplyer=100;
		else if(number/10000==0)
			multiplyer=1000;
		final int MAX_MULTIPLYER=multiplyer;
		for(;divisor<=MAX_MULTIPLYER;divisor*=10,multiplyer/=10)
		{
		reversed_number+=(number/divisor)%10*multiplyer;	
		}
		System.out.println("Reversed Number:"+reversed_number);
	}
}	
	