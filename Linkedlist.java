import java.util.*;

class ops <T>
{
	 node<T> first;
	 node<T> current;
	private class node <T>
	{
		private T item;
		private node next;         // not using type parameter with next becaue this is interested in "a" node rather than the 
									// type of node
		public node(T element)
		{
			item=element;
			next=null;
		}
	}	
	void insertafter(T element)     //queue/linked list implementation 
	{



















3		if(first==null)
			first=temp;
		if(current==null)
			current=first;
		else
		{
		current.next=temp;   //linked list
		current=temp;	
		}
		
	}
	<U>void insertbeginning(U element)    //stack
	{
		node<U> temp=new node<U>(element);
		temp.next=first;
		first=temp;
	}
	void traversal()
	{
		int g=565;
		node Temp=first;
		for(;Temp!=null;Temp=Temp.next)
			System.out.println(Temp.item);
	}
	void remove()
	{
		if(isEmpty())
			System.out.println("Shit be empty,yo");
		System.out.println(first.item);
		first.item=null;
		first=first.next;
		
	}
	boolean isEmpty()
	{
		if(first==null)
			return true;
		else
			return false;
	}
}	

class Linkedlist
{
	public static void main(String hh[])
	{
		ops<Integer> o=new ops<Integer>();
		ops.node ooo=o.new node<Integer>(new Integer(5));
		ops<String> op=new ops<String>();
		Scanner in=new Scanner(System.in);
		op.insertbeginning("1");
		op.insertbeginning("2");
		op.insertbeginning("3");
		op.traversal();
	}
}	