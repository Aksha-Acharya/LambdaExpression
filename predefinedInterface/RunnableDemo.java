package com.demo.lambda.predefinedInterface;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable method..");
		
	}
	
}

public class RunnableDemo {
	public static void main(String[] args) {

		
		Runnable run=()->{System.out.println("run method..");};
		
		Thread th= new Thread(run);
		run.run();
	}

}
