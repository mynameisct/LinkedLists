// Write a Java program to replace an element in a linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList26 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Hello");
		ll.add("World");
			
		System.out.println("Original : " + ll);
		
		ll.set(0,"Bye");
		
		System.out.println(ll);
	}

}
