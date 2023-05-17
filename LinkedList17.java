// Write a Java program to join two linked lists.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList17 {

	public static void main(String[] args) {
		
	LinkedList<String> ll1 = new LinkedList<>();
	ll1.add("My Name is: ");
	System.out.println("ll1 is: " + ll1);
	
	LinkedList<String> ll2 = new LinkedList<>();
	ll2.add("Chaitanya Dnyaneshwar Tribhuwan");
	System.out.println("ll2 is: " + ll2);
	
	LinkedList<String> ll = new LinkedList<>();
	ll.addAll(ll1);
	ll.addAll(ll2);
	System.out.println("After Joining ll1 and ll2 : " + ll);
	
	}

}
