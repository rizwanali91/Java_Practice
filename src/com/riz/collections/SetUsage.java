package com.riz.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUsage {
	
	public static void main(String args[]) {
		
		//can't have duplicates
		
		//No ordering of elements
		Set<Integer> hashSet = new HashSet<Integer>();
		
		//sorted based on value of elements
		Set<Integer> treeSet =  new TreeSet<Integer>();
		
		//Sorted by order of insertion
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
				
		
		for(int i=55; i>20; i--)
		{
			hashSet.add(i);
			treeSet.add(i);
			linkedHashSet.add(i);
		}
		
		hashSet.remove(30);
		treeSet.remove(30);
		linkedHashSet.remove(30);
		
		System.out.println("Printing Hashset elements -- no particular orderning");
		hashSet.forEach(element ->{
			System.out.println(element);
		});

		System.out.println("Printing TreeSet elements -- ordered by value");
		treeSet.forEach(element ->{
			System.out.println(element);
		});

		System.out.println("Printing LinkedHashSet elements -- order of insertion");
		linkedHashSet.forEach(element ->{
			System.out.println(element);
		});
		
	}

}
