package MenuDriven;

import java.util.Scanner;

class Single {
	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;

		}

		public Node(int val) {
			super();
			this.data = val;
			this.next = null;

		}

	}

	private Node head;

	public Single() {
		super();
		this.head = null;
	}

	void Display() {
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println(" ");
	}

	void AddFirst(int val) {
		// new node
		Node newnode = new Node(val);
		// head transfer into new node addr.
		newnode.next = head;
		// make newnode as head
		head = newnode;

	}

	void AddLast(int val) {
		// new node
		Node newnode = new Node(val);
		// check linklist empty or not
		if (head == null) {
			// if empty create this one as a new
			head = newnode;
		} else {
			// start from begin node
			Node trav = head;
			while (trav.next != null) {
				// chec till last node

				trav = trav.next;

			}
			// if found then add last node
			trav.next = newnode;

		}

	}

	void AddPos(int val, int pos) {
		// check rextra condn
		if (head == null || pos <= 1) {
			AddFirst(val);

		} else {
			// new node init
			Node newnode = new Node(val);
			// take 2nd last node i.e pos-1
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			// takethe last node ref. in newnode

			newnode.next = trav.next;
			// take the newnode ref in pos-1 node
			trav.next = newnode;
		}
	}

	void DelFirst() {
		if (head == null)
			throw new RuntimeException("linklist is empty");

		head = head.next;
	}

	void DelLast() {
		if (head == null)
			throw new RuntimeException("linklist is empty");
		Node trav = head;
		trav.next = null;

	}

	void DelPos(int pos) {
		if (pos == 1) {
			DelFirst();
		}
		if (head == null)
			throw new RuntimeException("linklist  is empty");
		Node temp = null, trav = head;
		for (int i = 1; i < pos; i++) {
			temp = trav;
			trav = trav.next;

		}
		temp.next = trav.next;
	}

	void DelAll() {
		head = null;
	}

}

public class Singly1 {

	public static void main(String[] args) {
		Single list = new Single();
		int choice;
		int val;
		int pos;
		int pos1 = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Display 2.AddFirst  3.AddLast  4.AddPos  5.DelFirst  6.DelLast 7.Delpos  8.DelAll");

			System.out.println("Enter your Choice ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				list.Display();
				break;
			case 2:
				System.out.println("Take the no. from user :");
				val = sc.nextInt();
				list.AddFirst(val);
				break;
			case 3:
				System.out.println("Take the no. from user :");
				val = sc.nextInt();
				list.AddLast(val);
				break;
			case 4:
				System.out.println("enter value from user:");
				val = sc.nextInt();
				System.out.println("enter position  from user:");
				pos = sc.nextInt();
				list.AddPos(val, pos);
				break;
			case 5:
				list.DelFirst();
				break;
			case 6:
				list.DelLast();
				break;
			case 7:
				System.out.println("enter the position");
				pos = sc.nextInt();
				list.DelPos(pos);
				break;
			case 8:
				list.DelAll();
				break;

			default:
				System.out.println("You have enter wrong choice ");
				System.out.println("plz try again later ");
				break;
			}
		} while (choice != 0);
		System.out.println("program terminated ");
	}
}