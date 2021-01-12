//checks emails for validity and throws exception otherwise

import java.util.*;

class emailformatexception extends RuntimeException
{
public String toString()
{
return "Invalid format Email Entered.";
}		
}	

class emailformat
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String email,temp;
		boolean flag=false;
		int location1,location2,length;
		try
		{
			System.out.println("Enter Email:");
			email=input.nextLine();
			length=email.length();
			if((location1=email.indexOf('@'))==-1)
				throw new emailformatexception();
			if((location2=email.indexOf('.'))==-1)
			throw new emailformatexception();
			temp=email.substring(location2+1,length);
			if(!(temp.equalsIgnoreCase("com")))
				throw new emailformatexception();
			System.out.println("Valid Email.");
		
		}
		catch(emailformatexception e)
		{
         e.printStackTrace();		
		}
				
	}
}	
