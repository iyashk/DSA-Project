
import java.io.*;
import java.util.*;
public class BST 
{
	BSTNode root;
	int c;
	int turn ;
	ArrayList<String> attempts = new ArrayList<String>();

	public void insert(String name,long number,String email)
	{
		if(root==null)
			root=new BSTNode(number,email,name);
		else
			root.insert(number,email,name);
	}
	public boolean search(String name)
	{
		if(root==null)
			return false;
		return root.search(name.toLowerCase());
	}
	public void Display()
	{
		if(root == null) {
			return;
		}
		else {
		turn = 1;
		attempts.clear();
		attempts.add("\ns.no  name\t\tnumber\t\temail\n");
		Display(root);
		for (String line : attempts)
			System.out.println(line);}
	}
	private void Display(BSTNode p) 
	{

		if (p != null) 
		{	

			Display(p.left);
			String attemptOutput = turn + "    " +p.name   + "\t\t" + p.number[c]   + "\t\t" + p.email[c];
			turn++;
			attempts.add(attemptOutput);
			Display(p.right);

		}
	}
	
	public String Display_first()
	{
		BSTNode temp=root;
		if(temp==null)
			return "";
		while(temp.left!=null)
			temp=temp.left;
		return temp.name+"\t"+temp.number[0]+"\t"+temp.email[0];
	}
	public String Display_last()
	{
		BSTNode temp=root;
		if(temp==null)
			return "";
		while(temp.right!=null)
			temp=temp.right;
		return temp.name+"\t"+temp.number[temp.count-1]+"\t"+temp.email[temp.count-1];
	}
	public boolean duplicate(String k,long n,String e)
	{
		if(root==null)
			return false;
		return root.duplicate(k,n,e);
	}
	public void fileadd(String filepath)
	{
		File filein=new File(filepath);
		try {
			Scanner in=new Scanner(filein);
			while(in.hasNext()) {
				long j=0;
				String[] i=in.nextLine().split(" ");
				try {
					j=Long.parseLong(i[1]);

					if(i.length>=3)
						if(!this.duplicate(i[0],j,i[2]))
							this.insert(i[0],j,i[2]);	
				}
				catch(NumberFormatException e) {}			
			}
			in.close();
		}
		catch(FileNotFoundException e) {}
		
		try
		{
			BufferedReader bb = new BufferedReader(new FileReader(filepath));
			String line;
			String[][] matrix = new String[1000][1000];
			int ax=0, ay=0;

			while ((line = bb.readLine()) != null)	//file reading
			{
				String[] values = line.split(" ");
				System.out.print("Contact : ");
				for (String str : values)
				{	
					matrix[ax][ay]=str;
					System.out.print(matrix[ax][ay] + " ");
					ay=ay+1; 
				}
				ax=ax+1; 
				System.out.print("saved"+"\n");
			}
		}catch( IOException ioException ){}
		
	}

}