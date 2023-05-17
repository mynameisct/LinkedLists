// Write a Java program to insert elements into the linked list at the first and last position.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList6 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Name");
		ll.add("is");
		ll.add("Chaitanya");
		ll.add("Dnyaneshwar");
		
		System.out.println("Before : " + ll);
		
		ll.addFirst("My");
		ll.addLast("Tribhuwan");
		
		System.out.println("Now : " + ll);
	}

}
