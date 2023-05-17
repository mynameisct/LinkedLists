// Write a Java program to remove a specified element from a linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList12 {

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Abhishek");
		ll.add("Pratik");
		ll.add("Anurag");
		ll.add("Nikhil");
		ll.add("Varad");
		
		System.out.println("Original LinkedList: " + ll);
		
		ll.remove(4);
		
		System.out.println("Current LinkedList: " + ll);

	}

}
