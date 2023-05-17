// Write a Java program to insert the specified element at the front of a linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList7 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Name");
		ll.add("is");
		ll.add("Chaitanya");
		ll.add("Dnyaneshwar");
		
		System.out.println("Before:" + ll);
		
		ll.offerFirst("Note:");
		
		System.out.println("Now: " +  ll);

	}

}
