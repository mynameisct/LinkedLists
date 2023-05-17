// Write a Java program to insert the specified element at the specified position in the linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList5 {

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<>();
		ll.add("10");
		ll.add("30");
		ll.add("40");
		ll.add("50");
		ll.add("60");
		ll.add("70");
		
		System.out.println("Original ArrayList: " + ll);
		
		ll.add(1,"20");
		
		System.out.println("ArrayList now: "+ ll);
	}

}
