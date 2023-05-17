// Write a Java program to shuffle the elements in a linked list.

package com.collection.linked;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList16 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("My");
		ll.add("is");
		ll.add("Name");
		ll.add("Chaitanya");
		
		System.out.println("Before Shuffle: " + ll);
		
		Collections.shuffle(ll);
		
		System.out.println("After Shuffle: " + ll);
		

	}

}
