// Write a Java program to check if a particular element exists in a linked list.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList22 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("My");
		ll.add("Name");
		ll.add("is");
		ll.add("Nikhil");
		ll.add("Kulkarni");
		
		boolean x =	ll.contains("Chaitanya");
		
		System.out.println(x);
		

	}

}
