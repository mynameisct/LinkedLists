// Write a Java program to insert the specified element at the end of a linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList8 {

	public static void main(String[] args) {
		

		LinkedList<String> ll = new LinkedList<>();
		ll.add("Name");
		ll.add("is");
		ll.add("Chaitanya");
		ll.add("Dnyaneshwar");
		
		System.out.println("Before:" + ll);
		
		ll.offerLast("Done!");
		
		System.out.println("Now: " +  ll);
	}
}
