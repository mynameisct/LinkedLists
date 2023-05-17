// Write a Java program to get the first and last occurrence of the specified element in a linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList10 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("23");
		ll.add("43");
		ll.add("98");
		ll.add("45");
		ll.add("12");
		ll.add("53");
		
		
		System.out.println(ll.getFirst() + " " + ll.getLast());

	}

}
