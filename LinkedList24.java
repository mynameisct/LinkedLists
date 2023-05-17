// Write a Java program to compare two linked lists.

package com.collection.linked;

import java.util.LinkedList;

public class LinkedList24 {

	public static void main(String[] args) {
		
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("My");
		ll1.add("Name");
		ll1.add("is");
		
		System.out.println("First : " + ll1);
		
		LinkedList<String> ll2 = new LinkedList<>();
		ll2.add("Chaitanya");
		ll2.add("Dnyaneshwar");
		ll2.add("is");
		
		System.out.println("Second : " + ll2);
		
		LinkedList<String> ll = new LinkedList<>();
		
		for (String e : ll1)
		{
			ll.add(ll2.contains(e) ? "Yes" : "No");
         	System.out.println(ll);         
		}
	}
}
