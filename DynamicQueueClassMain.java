package linkedlist;

import java.util.Scanner;

public class DynamicQueueClassMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 DynamicQueueClass	 obj = new  DynamicQueueClass();// object created 
		

               obj.create_Queue();

	      int ch, e;
		do {
			
			System.out.println("queue Menu");
			System.out.println("-----------");
			System.out.println("1. Enqueue");
			System.out.println("2.Dequeue");
			//System.out.println("3.Peek");
			System.out.println("4.Print all elements");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				
					System.out.println("Enter a number:");
					e = sc.nextInt();
					obj. Enqueue(e);
				

				break;
			case 2:
			  obj.Dequeue();
			  

				break;
		//	case 3:
		//		obj.peek();
			//	break;
			case 4:
					System.out.println("Elements in queue are\n");
					obj.print_queue();
				
				break;
			case 0:
				System.out.println("Thanks for using code , coded by amartechnavigator");
				break;
			default:
				System.out.println("Wrong option selsected:");
				break;

			}
		} while (ch != 0);

	}
	

	}


