package com.wipro.map;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
	public static void main(String[] args) {
		// Create a sorted map sorted on string keys alphabetically
		NavigableMap<String, String> nMap = new TreeMap<>();
		nMap.put("Abhishek", "77650732342");
		nMap.put("Sandeep", "98234234234");
		nMap.put("Yuvraj", "087564803256");
		nMap.put("nath", "873958354534");
		
		System.out.println("Navigable Map:" + nMap);
		// Get the closest lower and higher matches for Ken
		Entry<String, String> lowerKen = nMap.lowerEntry("nath");
		Entry<String, String> floorKen = nMap.floorEntry("nath");
		Entry<String, String> higherKen = nMap.higherEntry("nath");
		Entry<String, String> ceilingKen = nMap.ceilingEntry("nath");
		System.out.println("Lower Ken: " + lowerKen);
		System.out.println("Floor Ken: " + floorKen);
		System.out.println("Higher Ken: " + higherKen);
		System.out.println("Ceiling Ken: " + ceilingKen);
		// Get the reverse order view of the map
		NavigableMap<String, String> reverseMap = nMap.descendingMap();
		System.out.println("Navigable Map(Reverse Order):" + reverseMap);
	}
}
