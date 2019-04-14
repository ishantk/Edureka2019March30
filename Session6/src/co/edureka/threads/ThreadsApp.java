package co.edureka.threads;

/*class MyTask{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("## MyTask "+i);
		}
	}
}*/

// We can create threads by simply extending java's Thread class which is a built in class for us
class MyTask extends Thread{ // IS-A Relation
	// Write job in the run method of thread by overriding it !!
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("## MyTask "+i);
		}
	}
}

class CA{
	
}

//class YourTask extends CA, Thread{ // error: Multiple Inheritance is not supported in Java
class YourTask extends CA implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("@@ YourTask "+i);
		}
	}
}

public class ThreadsApp {

	// main method represents main thread.
	// whatever you write in main shall be executed by main thread in a sequence one by one
	public static void main(String[] args) {
		// Job1
		System.out.println(">> App Started");

		// Job2
		MyTask mRef = new MyTask();
		//mRef.executeTask();
		
		System.out.println(">> State1: "+mRef.getState());
		
		Runnable r = new YourTask();
		Thread yRef = new Thread(r);
		
		mRef.setName("John");
		yRef.setName("Fionna");
		Thread.currentThread().setName("Kia");
		
		mRef.setPriority(Thread.MAX_PRIORITY); 						// 10
		yRef.setPriority(Thread.MIN_PRIORITY); 						// 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); 	// 5
		
		//mRef.setDaemon(true); // will be running in memory till process is running
		
		mRef.start(); // start method shall internally execute the run method of thread
		System.out.println(">> State2: "+mRef.getState());
		try {
			mRef.join(); // immediately after start we have put join
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		yRef.start();
		
		// Job3
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Main Thread "+i);
		}
		// Job3 and Job4 shall be executed after Job2
		// If Job2 is a time consuming job than below jobs shall be blocked
		
		System.out.println("mRef Name is: "+mRef.getName()+" and Priority is: "+mRef.getPriority());
		System.out.println("yRef Name is: "+yRef.getName()+" and Priority is: "+yRef.getPriority());
		System.out.println("main Name is: "+Thread.currentThread().getName()+" and Priority is: "+Thread.currentThread().getPriority());
		
		System.out.println(">> State3: "+mRef.getState());
		
		// Job4
		System.out.println(">> App Finished");
	}

}
