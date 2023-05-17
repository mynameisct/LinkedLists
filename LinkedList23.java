// Write a Java program to convert a linked list to array list.

package com.collection.linked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList23 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("My");
		ll.add("Name");
		ll.add("is");
		ll.add("Nikhil");
		ll.add("Kulkarni");
		
		List<String> al = new ArrayList<>();
		
		for(String element : ll) {
			System.out.println(element);
		}

	}

}
