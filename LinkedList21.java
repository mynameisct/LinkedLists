// // Write a Java program to retrieve but does not remove the last element of a linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList21 {

	public static void main(String[] args) {
		
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Green");
		ll.add("Pink");
		ll.add("Blue");
		ll.add("Purple");
		ll.add("White");
		
		System.out.println("Original : " + ll);
		
		String x = ll.peekLast();
		
		System.out.println("Current : " + ll);

	}

}
