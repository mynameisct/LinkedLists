// Write a Java program to remove first and last element from a linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList13 {

	public static void main(String[] args) {
		
	LinkedList<String> ll = new LinkedList<>();
	ll.add("My");
	ll.add("Name");
	ll.add("is");
	ll.add("Chaitanya");
	ll.add("Dnyaneshwar");
	ll.add("Tribhuwan");
	ll.add("Remember");
	
	System.out.println("Original : " + ll);
	
	ll.removeFirst();
	ll.removeLast();
	
	System.out.println("Current: " + ll);
	}

}
