// Write a Java program to iterate through all elements in a linked list starting at the specified position.

package com.collection.linked;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Pink");
		ll.add("White");
		ll.add("Black");
		ll.add("Violet");
		ll.add("Orange");
		ll.add("Green");
		
		Iterator<String> p = ll.listIterator(0);
		
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}
}
