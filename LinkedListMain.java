package linkedlist;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				Node n=new Node(10);
				
				LinkedListClass	 obj = new 	LinkedListClass();
						//object created 
						System.out.println("Enter size of liked list:");
				int size = sc.nextInt();
				obj.create_list();
				int ch, e;
				do {
					System.out.println("queue Menu");
					System.out.println("-----------");
					System.out.println("1.insert left");
					System.out.println("2.delete left");
					System.out.println("3.insert rigth");
					System.out.println("4.delete rigth");
					System.out.println("5.print all elements");
					System.out.println("6.search ");
					System.out.println("5.print all elements");
					System.out.println("0.Exit");
					System.out.println("-----------");
					System.out.println("Choice:");
					ch = sc.nextInt();
					switch (ch) {
					case 1:
					
						
							System.out.println("Enter a number:");
							e = sc.nextInt();
							obj.insert_left(e);
							break;
					
					case 2:
						obj.delete_left();
	                    break;
						
				
					case 3:
	                    System.out.print("Enter a number: ");
	                    e = sc.nextInt();
	                    obj.insert_right(e);
	                    break;
					case 4:
						  obj.delete_right();
		                    break;
					case 5:
						  obj.print_list();
		                    break;
					case 6:
						
						
						System.out.println("search a number:");
						e = sc.nextInt();
						obj.search_list(e);
						break; 
	               case 7:
						
						
						System.out.println("entre element :");
						e = sc.nextInt();
						obj.delete_element(e);
						break; 
						
	               case 8:
	                    System.out.println("Enter element to insert after:");
	                    e = sc.nextInt();
	                    System.out.println("Enter element to search:");
	                    int key = sc.nextInt();
	                    obj.insert_after(key,e);
	                    System.out.println("Element Inserted");
	                    break;
	                    
	             
	                case 9:
	                    System.out.println("Enter element to insert before:");
	                    e = sc.nextInt();
	                    System.out.println("Enter element to search:");
	                    key = sc.nextInt();
	                    obj.insert_before(key,e);
	                    System.out.println("Element Inserted");
	                    break;
	                case 0:
	                    System.out.println("Exiting....");
	                    break;

	                default:
	                    System.out.println("Wrong option selected");
	                    break;
	             
				
					}
				} while (ch != 0);
			}
			
	}


