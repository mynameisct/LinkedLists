// Write a java program to iterate through all elements in linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.add("F");
		
		for(String element : ll) {
			System.out.println(element);
		}
	}
}
