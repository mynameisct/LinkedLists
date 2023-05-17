// Write a Java program to remove all the elements from a linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList14 {

	public static void main(String[] args) {
	
	LinkedList<String> ll = new LinkedList<>();
	ll.add("23");
	ll.add("55");
	ll.add("76");
	ll.add("98");
	
	System.out.println("Before: " + ll);
	
	ll.removeAll(ll);
	
	System.out.println("Now: " + ll);

	}

}
