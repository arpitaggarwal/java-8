package com.arpit.java8.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
	/**
	 * https://javasampleapproach.com/java/java-8/java-8-completablefuture-
	 * handle-exception
	 * 
	 * @param args
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		CompletableFutureExample obj = new CompletableFutureExample();
		obj.createCompletableFuture();
	}

	public void createCompletableFuture() throws InterruptedException,
			ExecutionException {
		CompletableFuture.runAsync(new Task()).get();
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello Task");

	}

}
