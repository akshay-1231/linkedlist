package linkedlist;

public class LinkedListClass {
	Node root; // linked list ususe containeres
	// create list

	void create_list() {
		root = null;
	}
	// insert left

	void insert_left(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n; // n is 1st root
		} else {
			n.next = root;
			root = n;

		}
		System.out.println(root.data + "insert node");
	}

	// delete left
	void delete_left() {
		if (root == null) {
			System.out.println("emptylist");

		} else {
			Node t;
			t = root;
			root = root.next;

			System.out.println(t.data + "deletee");
		}
	}

	void insert_right(int data) {
		Node n = new Node(data);
		if (root == null)
			root = n;// n becomes 1st so root= else
		{
			Node t = root;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
		System.out.println(root.data + " inserted");

	}

	void delete_right() {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node t, t2;
			t = t2 = root;// 1 while(t.next!=null)
			{
				t2 = t;
				t = t.next;
			}
			if (t == root)// single node root=null;//reset root as only node left else
				t2.next = null;
			System.out.println(t.data + " deleted");
		}
	}

	void print_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Node t = root;
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}

	void search_list(int data) {
		if (root == null)
			System.out.println("List Empty");
		else {
			Node t = root;
			while (t != null) {
				if (t.data == data)// match found 
					{
					System.out.println(t.data + " found in list");
				break;
			}
			t = t.next;
		}
	  
	
		if (t == null)// not found
		System.out.println(data + " not found in list");
	}

}
    void delete_element(int data)
    {
        if (root == null)
            System.out.println("List Empty");
        else
        {
            Node t, t2;
            t2 = t = root;
            while (t != null)
            {
                if (t.data == data)//match found
                {
                    System.out.println(t.data + " found in list");
                    if (t == root)//case 1
                        root = root.next;
                    else if (t.next == null)//case 2
                        t2.next = null;
                    else//case 3: in between
                        t2.next = t.next;
                    System.out.println(t.data + " deleted");
                    break;//stop the loop
                }
                t2=t;
                t = t.next;
            }
            if (t == null)//not found
                System.out.println(data + " not found in list");
        }
    }
    void insert_after(int key,int new_data) {
        Node n = new Node(new_data);
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
            while (t != null) {
                if (t.data == key)//match found
                {
                    System.out.println(t.data + " found in list");
                    n.next = t.next;//1
                    t.next = n;
                    System.out.println(new_data + " inserted in list");
                    break;
                }
                t = t.next;
            }
            if (t == null)//not found
                System.out.println(key + " not found in list");

        }
    }
    void insert_before(int key,int new_data) {
    	   Node n = new Node(new_data);
           if (root == null)
               System.out.println("List Empty");
           else {
               Node t = root;
               Node t2=root;
               while (t != null)
               {
                   if (t.data == key)//match found
                   {
                       if(t==root)
                       {
                           n.next=root;
                           root=n;
                           System.out.println(new_data + " inserted in list before root");
                       }
                       else {
                           System.out.println(t.data + " found in list");
                           n.next = t;//1
                           t2.next = n;
                           System.out.println(new_data + " inserted in list");
                       }
                          break;
                   }
                   t2=t;
                   t = t.next;
               }
               if (t == null)//not found
                   System.out.println(key + " not found in list");

           }
}
}
