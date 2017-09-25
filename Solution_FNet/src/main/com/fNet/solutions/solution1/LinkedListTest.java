package main.com.fNet.solutions.solution1;

import static org.junit.Assert.*;
import main.com.fNet.solutions.solution1.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListTest {
	private static LinkedList list1 = new LinkedList();

	@BeforeClass
	public static void setup() {
		for (int i = 1; i < 11; i++) {
			list1.addNode(i);
		}
	}

	@Test
	public void testLinkedListSize() {
		assertEquals(10, list1.getSize());
	}

	@Test
	public void testListReverse() {
		list1.reverse(list1.getHead());
		list1.printList();
		LinkedList list2 = new LinkedList();
		for (int i = 10; i >= 1; i--) {
			list2.addNode(i);
		}
		list2.printList();
		Node current1 = list1.getHead();
		Node current2 = list2.getHead();
		while (current1 != null && current2 != null) {
			if (current1.getValue() != current2.getValue())
				assertFalse(true);
			current1 = current1.getNext();
			current2 = current2.getNext();
		}

	}

}
