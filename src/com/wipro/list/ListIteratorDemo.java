package com.wipro.list;

import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = List.of("Abhishek", "Ram", "Riyan", "Jim");
		System.out.println("List: " + list);
		// Get the list iterator
		ListIterator<String> iterator = list.listIterator();
		
		System.out.println("List Iterator in the forward direction:");

		while (iterator.hasNext()) {
			int index = iterator.nextIndex();
			String element = iterator.next();
			System.out.printf("list[%d] = %s%n", index, element);
		}
		System.out.println("\nList Iterator in the backward direction:");
		/**
		 * Iterating the list from the end of the list 
		 */
		while (iterator.hasPrevious()) {
			int index = iterator.previousIndex();
			String element = iterator.previous();
			System.out.printf("list[%d] = %s%n", index, element);
		}
	}
}
