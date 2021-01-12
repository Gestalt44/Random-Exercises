import java.util.*;

class logarithmrecursion
{
		static int log(int number) 
		    {
             return log(number, 1);
            }

private static int log(int number, int current)
 {
   return current < number ? log(number, current * 2) + 1 : 0;

}
			
	public static void main(String s[])
	{
		System.out.println(log(32));
	}
}	
	