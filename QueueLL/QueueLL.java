
import java.util.ArrayList;
import java.util.Scanner;

class Node { 
	int data; 
	Node next; 

	public Node(int d) { 
		data=d; 
		next=null; 
	} 

}
public class QueueLL { 


	Node front; 
	Node rear; 
	LinkedList A;
	String s = " ";
	QueueLL() 
	{ 
		A=new LinkedList(); 
		front=null; 
		rear=null; 
	}
	public void enqueue(int item) 
	{ 
		Node newnode = new Node(item); 
		newnode.data=item; 
		newnode.next=null; 
		if(front==null && rear==null) 
		{ 
			rear=newnode; 
			front=newnode; 
		} 
		else
		{ 
			rear.next=newnode; 
			rear=newnode; 
		} 
	} 
	public void dequeue() 
	{ 
		if(front==null && rear==null) 
			System.out.println("Nothing to dequeue"); 
		else if(front==rear) 
		{ 
			front=null; 
			rear=null; 
		} 
		else
			front=front.next; 

	} 
	public boolean IsEmpty() 
	{ 
		if(front==null && rear==null) 
			return true; 
		else
			return false; 
	} 
	public int getfront() 
	{ 
		if(!this.IsEmpty()) 
			return front.data;
		else
			return -1; 
	} 

	public void show() 
	{ 
		QueueLL temp = new QueueLL();

		while(!this.IsEmpty())
		{ 
			System.out.print(this.getfront()+" ");
			temp.enqueue(this.getfront());
			this.dequeue();
		} 
		s = " ";
		while(!temp.IsEmpty())
		{ 
			this.enqueue(temp.getfront());
			String k =temp.getfront()+" ";
			s = s.concat(k);
			temp.dequeue();

		} 
		System.out.println();
	}

} 
