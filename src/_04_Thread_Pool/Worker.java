package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	Task t;
	ConcurrentLinkedQueue<Task> taskQueue;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!taskQueue.isEmpty()) {
			
			t =taskQueue.remove();
			t.perform();
			
		}
	}
	Worker(ConcurrentLinkedQueue<Task> taskQueue){
		
		
		this.taskQueue = taskQueue; 
	}

}
