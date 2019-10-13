package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] n;
	ConcurrentLinkedQueue<Task> taskQueue;
	
	
	public ThreadPool(int totalThreads){
		taskQueue= new ConcurrentLinkedQueue<Task>();
		n =new Thread[totalThreads];
		for (int i =0; i<totalThreads;i++) {
			n[i]= new Thread( new Worker(taskQueue));
		}
		
	}
	
	
	
	
	

	
	



	public void start() {
		// TODO Auto-generated method stub
		for (int i =0; i<n.length;i++) {
			n[i].start();
			try {
				n[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}


	public void addTask(Task task) {
		// TODO Auto-generated method stub
		taskQueue.add(task);
	}
}