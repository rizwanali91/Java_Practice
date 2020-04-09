package com.riz.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapUsage {
	
	public static void main(String args[]) {
		
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		Map<Integer, String> hashtable = new Hashtable<Integer, String>();
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		for(int i=67; i>54;i--) {
			hashMap.put(i, "sample"+i);
			hashtable.put(i, "sample"+i);
			linkedHashMap.put(i, "sample"+i);
			treeMap.put(i, "sample"+i);
		}
		
		System.out.println("Printing HashMap");
		hashMap.forEach((key,value) -> {
			System.out.println("Key: "+key+" Value: "+value);
		});
		
		System.out.println("Printing HashMap");
		hashtable.forEach((key,value) -> {
			System.out.println("Key: "+key+" Value: "+value);
		});
		
		System.out.println("Printing HashMap");
		linkedHashMap.forEach((key,value) -> {
			System.out.println("Key: "+key+" Value: "+value);
		});
		
		System.out.println("Printing HashMap");
		treeMap.forEach((key,value) -> {
			System.out.println("Key: "+key+" Value: "+value);
		});
	}

}
