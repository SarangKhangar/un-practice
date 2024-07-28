package com.DSA;

// class linkeddin
public class LinkeddList {

	Node head;
	Node tail;
	int size;

	public LinkeddList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// inner class node
	class Node {

		int data;
		Node next;

		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	// to print the list
	public void printList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	// to insert the element
	public void add(int d) {

		Node newNode = new Node(d);

		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	// to remove the element
	public void remove() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			head = head.next;
			size--;
		}
	}
	
	//add element from last
	public void addlast(int data) {
		Node n = new Node(data);
		tail.next=n;
		tail=n;
		size++;
		
	}
	
	//remove element from last
	public void removeLast(Node tail) {
		if(tail.next==null) {
			tail=null;
			size--;
		}
	}
	
	//insert at nth position
	public void insertAtNth(int data, int position, Node head) {
		Node n = new Node(data);
		for(int i=0; i<=position-1; i++) {
			if(position==0) {
				
			}
			if(i==position-1) {
				head=n;
			}
			head=head.next;
			
		}
	}

//	public static Node revrseList(Node head) {
//		Node prv = null;
//		Node current = head;
//		
//		while(current!=null) {
//			Node tempNode = current.next;
//			current.next=prv;
//			prv=current;
//			current=tempNode;
//		}
//		return prv;	
//	}
	
	public static Node revrseList(Node head) {
		Node prv = null;
		Node current = head;
		
		//if(head==null || head.next==null) return;
		
		while(current!=null) {
			Node tempNode = current.next;
			current.next=prv;
			prv=current;
			current=tempNode;
			//System.out.println(prv.data);
		}
		return prv;
	}
	
	public static void printReverseList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkeddList ll = new LinkeddList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);

		//ll.removeLast(ll.tail);
		//ll.remove();

		
		Node nodeFromReverse = ll.revrseList(ll.head);
		printReverseList(nodeFromReverse);
		//ll.printList(ll.head);
	}

}
