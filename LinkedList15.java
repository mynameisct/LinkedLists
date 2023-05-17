// Write a Java program of swap two elements in a linked list.

package com.collection.linked;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList15 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("My");
		ll.add("is");
		ll.add("Name");
		ll.add("Chaitanya");
		
		System.out.println("Original : " + ll);
		
		Collections.swap(ll, 1, 2);
		
		System.out.println("After Swapping: " + ll);

	}

}
