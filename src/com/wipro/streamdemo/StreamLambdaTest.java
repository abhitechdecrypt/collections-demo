package com.wipro.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamLambdaTest {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of even numbers: " + sum);

		// filtering the array based name start with J
		List<String> names = Arrays.asList("John", "Jane", "Mary", "Arthur", "Jimmy");
		List<String> filteredNames = names.stream().filter(name -> name.startsWith("J"))
//	    .peek(System.out::println)
				.sorted().peek(System.out::println).collect(Collectors.toList());
		System.out.println("Filterled Name :: " + filteredNames);

		// Finding the square of the number
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squares = numbers1.stream().map(n -> n * n) // Square each number
//		    .peek(System.out::println)
				.collect(Collectors.toList());

		System.out.println(squares);

		List<String> words = Arrays.asList("apple", "bat", "banana", "cat", "dog");
		long count = words.stream().filter(word -> word.length() > 3).count();

		System.out.println("Number of words longer than 3 characters: " + count);

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
		int sum2 = values.stream().reduce(0, (a, b) -> a + b); // Sum the numbers

		System.out.println("Sum: " + sum2);

		// Finding the max number
		List<Integer> Maxnumbers = Arrays.asList(1, 3, 5, 7, 9);
		int max = Maxnumbers.stream().max(Integer::compare).orElse(-1);

		System.out.println("Maximum number: " + max);

		// Grouping the name based on the first latter
		List<String> AdvanceExam = Arrays.asList("Alice", "Bob", "Annie", "Brian");
		Map<Character, List<String>> groupedByFirstLetter = AdvanceExam.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0)));

		System.out.println(groupedByFirstLetter);

		// Concatenating the string
		List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript");
		String result = strings.stream().map(String::toUpperCase).collect(Collectors.joining(", ")); // Join all strings
																										// separated by
																										// a comma and a
																										// space

		System.out.println("Concatenated String: " + result);

	}

}
