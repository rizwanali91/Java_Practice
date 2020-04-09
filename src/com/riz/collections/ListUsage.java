package com.riz.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListUsage {
	
	public static void main(String args[]) {
		
		//Ordered collection and can have duplicates
		//traversal is faster
		List<Integer> arrayList = new ArrayList<Integer>();
		
		//Add or remove is faster
		List<Integer> linkedList = new LinkedList<Integer>();
		
		//Thread-safe, creates a copy for every update, costly updates
		List<Integer> copylist =  new CopyOnWriteArrayList<Integer>();
		
		for(int i=43; i>12; i--) {
			arrayList.add(i);
			linkedList.add(i);
			copylist.add(i);
		}
		
		System.out.println("Printing arraylist elements -- faster traversal");
		arrayList.forEach(element ->{
			System.out.println(element);
		});
		
		System.out.println("Printing linkedlist elements -- faster updates");
		arrayList.forEach(element ->{
			System.out.println(element);
		});

		System.out.println("Printing copyonwritearraylist elements -- thread safe");
		arrayList.forEach(element ->{
			System.out.println(element);
		});
	}

}
