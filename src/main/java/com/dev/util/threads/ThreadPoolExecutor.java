package com.dev.util.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor {
/*
	public static void main(String[] args) {
		List<AbstractWorkerThread> abstractWorkerThreadList= new ArrayList<>();
		abstractWorkerThreadList.add(new WorkerThread());
		abstractWorkerThreadList.add(new WorkerThread());
		abstractWorkerThreadList.add(new WorkerThread());
		abstractWorkerThreadList.add(new WorkerThread());
		abstractWorkerThreadList.add(new WorkerThread());
		abstractWorkerThreadList.add(new WorkerThread());
		abstractWorkerThreadList.add(new WorkerThread());
		
		new ThreadPoolExecutor().executor(abstractWorkerThreadList);

	}
*/
	public void executor(List<AbstractWorkerThread> abstractWorkerThreadList) {

		int deafult_threads = 5;
		if (System.getProperty("thread.count") != null) {
			deafult_threads = Integer.parseInt(System.getProperty("thread.count"));
		}
		ExecutorService executor = Executors.newFixedThreadPool(deafult_threads);
		for (int i = 0; i < abstractWorkerThreadList.size(); i++) {
			executor.execute(abstractWorkerThreadList.get(i));
			//System.out.println("Executing "+Thread.currentThread().getId()+" "+System.currentTimeMillis());
		}
		

		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads execution ");
	}

}