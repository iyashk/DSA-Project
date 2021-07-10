import java.util.ArrayList;
import java.util.Scanner;

public class Driver{
    public static void main(String[]args) { 

		QueueLL s1=new  QueueLL();

		Scanner scan = new Scanner(System.in);
		ArrayList<String> attempts = new ArrayList<String>();

		System.out.println("Choose your operation\n1.Enqueue \n2.Dequeue \n3.Peek element \n4.Print the queue \n0.EXIT!!\n");


		boolean j = true;

		while(j) {

			int i = scan.nextInt();
			// multiple new lines to clear screen

			if(i>0&&i<5) {

				switch(i) {	
				case 0:{
					break;	
				}
				case 1:{

					int val = scan.nextInt();
					s1.enqueue(val);

					String attemptOutput =  i + " " + val ;
					attempts.add(attemptOutput);
					System.out.println("\n\n\n\n\n\n\n\n");
					for (String line : attempts)
						System.out.println(line);
					break;
				}
				case 2:{
					if(!s1.IsEmpty()) {
						String attemptOutput =  i + " " + s1.getfront() ;
						//System.out.println(q.getfront());
						s1.dequeue();
						attempts.add(attemptOutput);

						System.out.println("\n\n\n\n\n\n\n\n");
						for (String line : attempts)
							System.out.println(line);

					}else {	

						System.out.println("empty queue");
					}
					break;
				}
				case 3:{
					if(!s1.IsEmpty()) {
						String attemptOutput =  i + " " + s1.getfront() ;
						attempts.add(attemptOutput);
						System.out.println("\n\n\n\n\n\n\n\n");
						for (String line : attempts)
							System.out.println(line);

					}else {	

						System.out.println("empty queue");
					}
					break;

				}
				case 4:{
					if(!s1.IsEmpty()) {
						s1.show();
						attempts.add(i+ s1.s);
						System.out.println("\n\n\n\n\n\n\n\n");
						for (String line : attempts)
							System.out.println(line);

					}else {
						System.out.println("EMPTY");
					}
					break;
				}

				}
			}else if(i ==0) {

				System.out.println("Programme Stopped!!!");
				j = false;
			}else {
				System.out.println("check the input no");

			}


		}
	}
}