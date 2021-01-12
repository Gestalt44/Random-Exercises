import java.util.*;

class temp
{
public static void main(String ssss[])
{
String s;
char array[]=new char[7];
char array1[]=new char[7];
array[0]='T';
array[1]='G';
array[2]='A';
array[3]='C';
array[4]='G';
array[5]='A';
array[6]='C';
int shift=2;        //Use this to control number of positions to circularlly shift  in the circular rotation
int terminator=7;   //length of char array,currently using constant for conveinence 
int i=0;            //iterator
int after_end_of_the_array_iterator=0;     //iterator for when the next position> length of array
while(i<terminator)
 {
	 
	if(i+shift<terminator)
		array1[i+shift]=array[i];
	else
	{
		
		array1[after_end_of_the_array_iterator++]=array[i];
	}
	i++;
 }	
System.out.println(new String(array1));
}
}