// Write a Java program to insert some elements at the specified position into a linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList9 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Blue");
		ll.add("Black");
		ll.add("Purple");
		ll.add("White");
		ll.add("Yellow");
		
		System.out.println("Original LinkedList: " + ll);
		
		LinkedList<String> nll = new LinkedList<>();
		nll.add("My");
		nll.add("Colours");
		
		ll.addAll(0, nll);
		
		System.out.println("New LinkedList: " + ll);

	}

}
