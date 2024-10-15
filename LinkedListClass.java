package linkedlist;

public class LinkedListClass {
	Node root;  //linked list ususe containeres
	//create list
	void create_list() {
		root=null; 
	}
	//insert left
	
	void insert_left(int data) {
		Node n =new Node(data);
		if(root==null) {
			root=n; //n is 1st root
		}
		else {
			n.next=root;
			root=n;
			
		}System.out.println(root.data+"insert node");
	}
	
	//delete left
	void delete_left(int data) {
		if(root==null) {
			System.out.println("emptylist");
			
		}else
		{
			Node t;
			t=root;
			root=root.next;
			
		System.out.println(t.data+"deletee");
		}
	}
	
	//insert rigth
	//insert at position
	//delete left
	//delete rigth
	//delete element
	//search element
	//print list
	
}
