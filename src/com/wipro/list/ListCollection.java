package com.wipro.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		/**
		 * @author Abhishek Kumar
		 * 
		 */
		List<String> names = new ArrayList<>();
		names.add("Abhishek Kumar");
		names.add("Sujit Kumar");
		names.add("Sandeep Roy");
		names.add("Yuvraj Gupta");
		names.add(3, "At Third Pos.");
		System.out.println("List Item :=> " + names);
		
		Collections.sort(names, (name1, name2) -> name1.compareTo(name2));
		names.forEach(System.out::println);
		
		List<Integer> age = new ArrayList<Integer>();
		age.add(12);
		age.add(22);
		age.add(15);
		age.add(62);
		age.add(23);
		age.add(45);
		
		age.forEach(System.out::println);
		
		List<String> company = List.of("wipro", "TCS", "IBM", "Infosys", "HCL", "Tech M");
		System.out.println("List using List.of() method: " + company);
	}

}
