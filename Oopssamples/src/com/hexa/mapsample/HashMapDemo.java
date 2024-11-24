package com.hexa.mapsample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, String>myMap=new HashMap();
		myMap.put("India", "New Delhi");
		myMap.put("Japan", "Tokyo");
		myMap.put("Pakistan", "Islamabad");
		
		for(Entry<String, String> myEntry:myMap.entrySet()) {
			System.out.println(myEntry.getKey()+": "+myEntry.getValue());
		}
		
	}
}
