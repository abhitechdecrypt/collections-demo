package com.wipro.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.wipro.entity.Customer;

public class MapTest {
	public static void main(String[] args) {
		// Create a map and add some key-value pairs
		// WeakHashMap
		Map<String, String> map = new HashMap<>();
		map.put("Abhishek", "77605987322");
		map.put("Sandeep", "3459830583");
		map.put("Donna", "(205)678-9823");
		map.put("Ken", "(205)678-9823");
		//Display the details 
		printDetails(map);
		
		map.clear(); // clearing the map

		System.out.printf("%nRemoved all entries from the map.%n%n");
		// Print the details
		printDetails(map);

		Map<String, List<Customer>> persons = new HashMap<>();
		// unmodifiable -- immutable
		Map<String, List<Customer>> unmodifiableMap = Collections.unmodifiableMap(persons);

		Map.of("name", "Krishna");

	}

	public static void printDetails(Map<String, String> map) {
		// Get the value for the "Donna" key
		String donnaPhone = map.get("Donna");

		// Print details
		System.out.println("Map: " + map);
		System.out.println("Map Size: " + map.size());
		System.out.println("Map is empty: " + map.isEmpty());
		System.out.println("Map contains Donna key: " + map.containsKey("Donna"));
		System.out.println("Donna Phone: " + donnaPhone);

		Set<String> keys = map.keySet();
		System.out.println("Printing the keys...");
		keys.forEach(System.out::println);

		Set<Entry<String, String>> entries = map.entrySet();
		System.out.println("Print all key-value pairs using the forEach()");
		entries.forEach(entry -> {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key=" + key + ", value=" + value);
		});
		System.out.println("Print all key-value pairs using the Map forEach with BiConsumer");
		map.forEach((key, value) -> System.out.println("key=" + key + ", value=" + value));
		System.out.println("Donna key is removed: " + map.remove("Donna"));
	}

}