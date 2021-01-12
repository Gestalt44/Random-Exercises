enum status
{
	FULL,EMPTY;
}	
class stack<T>
{
	T data[];
	int count=0;
	int capacity=10;
	status Status=status.EMPTY;
	stack()
	{
	data=(T[]) new  Object[capacity];	
	}	
	int push (T data)
	{
		if(isfull())
			return status.FULL;
		data[count++]=data;
		
	}
	T pop()
	{
		if(isempty())
			return status.EMPTY;
		return data[count--];
	}
	
	boolean isfull()
	{
		if(count==capacity)
			return true;
		else 
			return false;
	}	
	boolean isempty()
	{
		if(count==0)
			return true;
		else
			return false;
	}	
}
class stackarray
{
public static void main(String aaaaaaa[])
{
stack<Integer> obj=new <Integer> stack();
}
}
	