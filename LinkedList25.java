// Write a Java program to test an linked list is empty or not.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList25 {

	public static void main(String[] args) {
	
	LinkedList<String> ll = new LinkedList<>();
	ll.add("Hello");
	ll.add("World");
	
	boolean x = ll.isEmpty();

	System.out.println(x);
	}

}
