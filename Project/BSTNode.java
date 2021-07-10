

import java.io.*;
import java.util.Scanner;

public class BSTNode 
{
	long[] number = new long[10];
	String name;
	String[] email=new String[10];
	BSTNode left;
	BSTNode right;
	int count;
	int turn = 1;
	BST b = new BST();
	public BSTNode() { };
	public BSTNode(long d,String e,String n)
	{
		count=1;
		number[0]=d;
		email[0]=e;
		name=n;
	}
	public void insert(long key,String e,String n)
	{
		if(n.compareToIgnoreCase(name)<0)
		{
			if(left==null)
				left=new BSTNode(key,e,n);
			else
				left.insert(key,e,n);
		}
		else
		{
			if(right==null)
				right=new BSTNode(key,e,n);
			else
				right.insert(key,e,n);
		}
	}
	public boolean search(String n)
	{
		if(name.equalsIgnoreCase(n))
		{
			for(int i=0;i<count;i++)
				System.out.println(name+"\t"+number[i]+"\t"+email[i]);
			return true;
		}
		else if(n.compareToIgnoreCase(name)<0 && left!=null)
			left.search(n.toLowerCase());
		else if(n.compareToIgnoreCase(name)>0 && right!=null)
			right.search(n.toLowerCase());
		return false;
	}
	
	public boolean duplicate(String comp,long n,String e)
	{
		if(comp.equalsIgnoreCase(name))
		{
			this.email[this.count]=e;
			this.number[this.count++]=n;
			return true;
		}
		else if(comp.compareToIgnoreCase(name)<0 && left!=null)
			left.duplicate(comp,n,e);
		else if(comp.compareToIgnoreCase(name)>0 && right!=null)
			right.duplicate(comp,n,e);
		return false;
	}
}
