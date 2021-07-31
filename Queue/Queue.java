
import java.util.Scanner;
import java.util.ArrayList;
public class Queue {

	int Queue[];
	int front;
	int rear;
	String s = " ";
	Queue(int size)
	{
		Queue=new int[size];
		front=-1;
		rear=-1;
		
	}

	boolean IsEmpty()
	{
		if(front==-1&&rear==-1)
			return true;
		else
			return false;
	}


	void enqueue(int item)
	{
		if(rear== Queue.length-1)
		{

		}
		else if(IsEmpty())
		{
			front=rear=0;

			Queue[rear]=item;
		}
		else
		{
			rear=rear+1;
			Queue[rear]=item;
		}
	}



	int getfront()
	{
		if(IsEmpty())
			return -1;
		else
			return  Queue[front];
	}

	void dequeue()
	{
		if(IsEmpty())
		{
			System.out.print("empty queue");
		}
		else
			if(rear==front)
			{
				rear=-1;
				front=-1;
			}
			else {
				front=front+1;
			}
	}
	void show()
	{	

		if(IsEmpty()) {return;}
		else {
			s = "   ";
			for(int i=front;i<=rear;i++)
			{

				String k =Queue[i]+" ";
				s = s.concat(k);	

			}
			System.out.println(" ");
			

		}


	}
}

