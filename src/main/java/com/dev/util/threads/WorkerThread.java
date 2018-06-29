package com.dev.util.threads;

/***
 * 
 * dummy reference worker thread
 * @author shashank
 *
 */
public class WorkerThread extends AbstractWorkerThread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hi ");
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
