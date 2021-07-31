import java.util.ArrayList;
import java.util.Scanner;


public class Driver{
    	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> attempts = new ArrayList<String>();


		System.out.print("Enter the size of queue (0<j<100): ");

		int j = scan.nextInt();
		attempts.add("Enter the size of queue (0<j<100): "+j);
		System.out.println("Choose your operation\n1.Enqueue \n2.Dequeue \n3.Peek element \n4.Print the queue \n0.EXIT!!\n");
		Queue q = new Queue(j);
		attempts.add("Choose your operation\n1.Enqueue \n2.Dequeue \n3.Peek element \n4.Print the queue \n0.EXIT!!\n");
		while(j>0&&j<100) {

			int i = scan.nextInt();
			// multiple new lines to clear screen
			if(i>0&&i<5) {

				switch(i) {	
				case 0:{
					break;	
				}
				case 1:{
					if(q.rear== q.Queue.length-1) {
						String attemptOutput = "Overflow!!"  ;
						attempts.add(attemptOutput);
						System.out.println("\n\n\n\n\n\n\n\n");
						for (String line : attempts)
							System.out.println(line);}

					int val = scan.nextInt();
					q.enqueue(val);

					String attemptOutput =  i + " " + val ;
					attempts.add(attemptOutput);
					System.out.println("\n\n\n\n\n\n\n\n");
					for (String line : attempts)
						System.out.println(line);
					break;
				}
				case 2:{
					if(!q.IsEmpty()) {
						String attemptOutput =  i + " " + q.getfront() ;
						//System.out.println(q.getfront());
						q.dequeue();
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
					if(!q.IsEmpty()) {
						String attemptOutput =  i + " " + q.getfront() ;
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
					if(!q.IsEmpty()) {
						q.show();
						attempts.add(i+ q.s);
						System.out.println("\n\n\n\n\n\n\n\n");
						for (String line : attempts)
							System.out.println(line);

					}else {
						System.out.println("EMPTY");
					}
					break;
				}

				}
			}else if(i == 0) {

				System.out.println("Programme Stopped!!!");
				j = -1;
			}else {
				System.out.println("check the input no");

			}


		}



	}	
}