
public class LinkedList { 

	Node head; 
	int sum; 
	int count=0; 

	void insert_at_head(int val) { 
		Node newnode=new Node(val); 	
		newnode.next=head; 
		head=newnode; 
	} 

	void traversal() { 
		if(head==null) { 
			System.out.println("list is empty"); 
		} else{ 
			Node temp=head; 
			while(temp!=null) { 
				System.out.print(temp.data+" "); 
				temp=temp.next; 
			} 
		} 
		count=count+1; 
	}  

	void insert_at_tail(int value) { 
		Node s = new Node(value); 
		if(head==null) { 
			head = s; 
		} 
		else { 
			Node temp = head; 
			while(temp.next!=null) { 
				temp=temp.next; 
			} 
			temp.next = s; 
		} 
	} 

	void insert_at_middle(int value,int pos) { 
		Node temp=head;  Node newnode = new Node(value); 
		newnode.data=value; 
		newnode.next=null; 
		if(temp!=null) 
			for(int i=0;(i<pos-1&&temp.next!=null);i++) 
				temp=temp.next; 
		if(temp.next!=null) 
			newnode.next=temp.next.next; 
		temp.next=newnode; 
	}

	void delete_node(int data) { 
		Node temp=head; 
		if(head==null) 
			System.out.println("Nothing to delete"); 
		else if(temp.next!=null) { 
			while(temp.next.data!=data && temp.next!=null) 
				temp=temp.next; 
			if(temp.next!=null) 
				temp.next=temp.next.next; 
		} else
			head=null; 
	} 

	void delete_at_pos(int pos) { 
		Node temp=head; 
		if(head==null) 
			System.out.println("Nothing to delete"); 
		else if(temp.next!=null) { 
			for(int i=0;(i<pos-1&&temp.next!=null);i++) 
				temp=temp.next; 
			if(temp.next!=null) 
				temp.next=temp.next.next; 
		} else
			head=null; 
	} 

	void delete_at_head() { 
		if(head!=null) 
			head=head.next; 
		else
			System.out.println("Nothing to delete"); 
	} 


	void delete_at_tail() { 
		Node temp=head; 
		if(head==null) 
			System.out.println("Nothing to delete"); 
		else if(temp.next!=null) { 
			while(temp.next.next!=null) 
				temp=temp.next; 
			temp.next=null; 
		} else
			head=null; 
	} 

	void Search(int item) { 

		if(head==null) { 
			System.out.println("List is empty"); 
		} else{ 
			Node temp=head; 
			int count=0; 
			while(temp!=null) { 
				if(item==temp.data) 
					System.out.println(temp.data+" is at position "+count); 
				temp=temp.next; 
				count++; 
			} 
		} 
	} 

} 





