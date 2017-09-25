package main.com.fNet.solutions.solution3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ListSeparateTest {
	private ListSeparate listSeparate = new ListSeparate();

	@Test
	public void separatePossibleTest() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(6);
		assertTrue(listSeparate.separate(list, 3));
	}

	@Test
	public void separateNotPossibleTest() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(5);
		list.add(6);
		assertFalse(listSeparate.separate(list, 3));
	}

}
