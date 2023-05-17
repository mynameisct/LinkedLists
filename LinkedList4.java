// Write a Java program to iterate the linked list in reverse order

package com.collection.linked;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("White");
		ll.add("Blue");
		ll.add("Grey");
		ll.add("Purple");
		ll.add("Sky Blue");
		
		Iterator<String> p = ll.descendingIterator();
		
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}
}
