
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		BST b = new BST();

		boolean j=true;

		System.out.println("Choose your operation\n1.Add Data\n2.Add data from file\n3.Search a contact\n4.Display the contacts\n5.First contact\n5.Last contact\n7.Exit\n");

		while(j==true) {

			Scanner in = new Scanner(System.in);

			System.out.print("-->");

			int i = in.next().charAt(0);

			in.nextLine();

			switch(i) {

			case '1':

				System.out.print("Insert data seperating by space :");

				String[] x = in.nextLine().split(" ");

				try {

					if(!b.duplicate(x[0],Long.parseLong(x[1]),x[2])) {
						
						long k = Long.parseLong(x[1]);

						b.insert(x[0],k,x[2]);

						System.out.println("Contact : "+ x[0]+" "+k+" "+x[2]+" "+" Saved");
					}
				}
				catch(NumberFormatException e) {

					System.out.println("check the format");

				}
				break;
			case '2':
				

				System.out.print("Enter the file location :");
			//	/Users/yashwanthkiran/Downloads/phonenos.txt
				String y = in.nextLine();
				System.out.println("");
				b.fileadd(y);
				break;
			case '3':
				System.out.print("Type the Contact Name :");
				String s = in.nextLine();
				b.search(s);
				break;
			case '4':
				b.Display();
				break;
			case '5':
				System.out.println("The first contact :"+b.Display_first());
				break;
			case '6':
				System.out.println("The last contact :"+b.Display_last());
				break;
			case '7':
				j=false;
				System.out.print("Program stopped!!");
				return;
			default:
				System.out.println("Wrong Option!!!");
			}
		}
	}
}

