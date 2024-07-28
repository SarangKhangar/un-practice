package com.DSA;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int size;
	
	public DoublyLinkedList() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	
	class Node{
		Node pre;
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.pre=null;
			this.next=null;
		}
		
	}
	
	public void add(int data) {
		
		//object creation of member inner class when the method is non static
//		DoublyLinkedList dList = new DoublyLinkedList();
//		DoublyLinkedList.Node inClass = dList.new Node(data);
				
		Node newNode = new Node(data);
		
		if(head==null) {
			head=tail=newNode;
			size++;
		}
		else {
			tail.next=newNode;
			newNode.pre=tail;
			tail=newNode;
			size++;
		}
		
				
	}
	
	
	public static void main(String[] args) {
		
	}

}
