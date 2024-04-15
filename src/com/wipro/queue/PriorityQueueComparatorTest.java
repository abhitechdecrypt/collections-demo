package com.wipro.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.wipro.entity.Customer;

public class PriorityQueueComparatorTest {
	public static void main(String[] args) {
		Comparator<Customer> nameComparator = Comparator.comparing(Customer::getCusMobile);
		// Create a priority queue with a Comparator
		Queue<Customer> pq = new PriorityQueue<>(nameComparator);
		pq.add(new Customer("1", "Abhishek", "New Delhi", "Male", "77827634872"));
		pq.add(new Customer("2", "Sandeep", "New Delhi", "Male", "345"));
		pq.add(new Customer("3", "Nath", "New Delhi", "Male", "93874583"));
		pq.add(new Customer("4", "Yuvraj", "New Delhi", "Male", "345"));
		pq.add(new Customer("5", "Rahul", "New Delhi", "Male", "34556"));
		System.out.println("Priority queue: " + pq);
		while (pq.peek() != null) {
			System.out.println("Head Element: " + pq.peek());
			pq.remove();
			System.out.println("Removed one element from Queue");
			System.out.println("Priority queue: " + pq);
		}
	}

}