package main.com.fNet.solutions.solution1;

/*
 * Problem1: Write a method to Reverse a Singly LinkedList
 * Solution:
 * Time Complexity: O(N) N being the elements in the liked list
 * Space Complexity: O(1)
 * */
public class LinkedList {

	private Node head;
	private int size;

	public LinkedList() {
		head = null;
		size = 0;
	}

	public void addNode(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
		size++;
	}

	public Node reverse(Node head) {
		if (head == null || head.getNext() == null)
			return head;
		else {
			Node previousCurrent = null;
			Node temp = null;
			Node current = head;

			while (current.getNext() != null) {
				temp = current.getNext();
				current.setNext(previousCurrent); // Point current node to
													// previous node
				previousCurrent = current; // Point previous current to current
											// node
				current = temp;
			}
			current.setNext(previousCurrent);
			head = current;
			this.head = head;
			return this.head;
		}
	}

	public void printList() {
		if (this.head == null)
			System.out.println("The head is null");
		Node current = this.head;
		while (current != null) {
			System.out.print(current.getValue() + " ");
			current = current.getNext();
		}
		System.out.println();

	}

	public int getSize() {
		return this.size;
	}

	public Node getHead() {
		return this.head;
	}

}
