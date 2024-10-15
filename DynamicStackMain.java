package linkedlist;

import java.util.Scanner;

public class DynamicStackMain {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	DynamicStackClass	 obj = new DynamicStackClass();// object created 
	

	 obj.create_stack(size);

      int ch, e;
	do {
		System.out.println("Stack Menu");
		System.out.println("-----------");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Peek");
		System.out.println("4.Print all elements");
		System.out.println("0.Exit");
		System.out.println("-----------");
		System.out.println("Choice:");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			
				System.out.println("Enter a number:");
				e = sc.nextInt();
				obj.push(e);
			

			break;
		case 2:
		  obj.pop();
		  

			break;
		case 3:
			obj.peek();
			break;
		case 4:
				System.out.println("Elements in stack are\n");
				obj.print_stack();
			
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

