import java.util.*;

class Node <T>
{
	T element;
	Node<T> next;
	static Node<t> first;
	static Node<t> current;    // in the current implementation it is also the last element
	
	static void insert(Node<t> Object)   //insert at end
	{
	 	if(first==null)
		{
			first=Object;
			current=Object;
		}	
		else
		{
		current.next=Object;
		Object.next=null;
		current=Object;
		}
	}
	void delete()              // delete at start
	{
	  if(current==null)
			System.out.println("List is empty");
		first.element=0;
		first=first.next;
	}
	static void traversal()
	{
		Node <t>temp=first;
		System.out.println();
		while(temp!=null)
		{
			System.out.println(temp.element);
			temp=temp.next;
		}	
	}	
	int ret_current()
	{
		return current.element;
	}		
	
}
class linkedlist
{
public static void main(String args[])
{
int input,i=0;
Node <Integer>[] array=new <Integer> Node[5];
Scanner in=new Scanner(System.in);
while(true)
{
	System.out.println();
	System.out.println("1. Insert");
	System.out.println("2. Delete");
	System.out.println("3. Traverse");
	System.out.println("4. exit");
	System.out.println();
	switch(in.nextInt())
	{
		case 1:
		System.out.println("Enter element:");
		array[i]=new Node();
		Node.insert(array[i++]);
		break;
		case 2:
		array[i-1].delete();
		break;
		case 3:
		Node.traversal();
		break;
		case 4:
		System.exit(0);	
	}
}//end while
} //end main
} // end class	
		
	