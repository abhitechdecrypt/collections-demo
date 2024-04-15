package com.wipro.concurrencyThred;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TransactionProcessor {

	private static final int NUM_THREADS = 4; // Number of threads in the thread pool

	// Simulates processing a transaction
	private static void processTransaction(int transactionId) {
		System.out
				.println("Processing transaction " + transactionId + " on thread " + Thread.currentThread().getName());
		try {
			// Simulate time taken to process a transaction
			Thread.sleep((long) (Math.random() * 1000));
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); // set the interrupt flag
			System.out.println("Failed to complete transaction " + transactionId + " due to interruption");
		}
	}

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
		AtomicInteger transactionCount = new AtomicInteger(1); // Atomic integer to keep track of transaction IDs

		// Submitting 10 transactions to be processed by the pool
		for (int i = 0; i < 10; i++) {
			executor.submit(() -> {
				int transactionId = transactionCount.getAndIncrement(); // Safely increment transaction ID
				processTransaction(transactionId);
			});
		}

		executor.shutdown(); // Disallow new tasks to be submitted

		try {
			// Wait for all tasks to finish or timeout after 60 seconds
			if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
				executor.shutdownNow(); // Force shutdown if tasks exceed timeout
				if (!executor.awaitTermination(60, TimeUnit.SECONDS))
					System.err.println("Executor did not terminate");
			}
		} catch (InterruptedException ie) {
			executor.shutdownNow();
			Thread.currentThread().interrupt(); // Preserve interrupt status
		}

		System.out.println("All transactions processed.");
	}
}
