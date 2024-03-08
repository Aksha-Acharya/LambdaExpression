package com.demo.lambda;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is running...");
		
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) {
		
		Thread th= new Thread(new ThreadDemo());
		th.run();
		
//		Runnable run=()->System.out.println("run method...");
//		Thread th= new Thread(run);
//		run.run();
	}

}
