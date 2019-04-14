package co.edureka.threads;

class Printer{
	//void printDocuments(String docName, int copies){
	//synchronized void printDocuments(String docName, int copies){
	void printDocuments(String docName, int copies){
		for(int i=1;i<=copies;i++){
			System.out.println(">> Printing "+docName+" Copy#"+i);
		}
	}
}

class Computer extends Thread{
	Printer pRef;
	Computer(Printer p){
		pRef = p;
	}
	public void run() {
		// synchronized block : till block is not finished no one can access printer object pointed by pRef
		synchronized (pRef) {
			
			try {
				pRef.wait(); // if Computer Thread will start it will now wait !!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			pRef.printDocuments(" *JohnsProfile.pdf* ", 10);
		}
	}	
}

class MobilePhone extends Thread{
	Printer pRef;
	MobilePhone(Printer p){
		pRef = p;
	}
	public void run() {
		synchronized (pRef) {
			pRef.printDocuments(" =ProgrammingWithJava.pdf= ", 10);
			pRef.notify(); // Any Thread waiting on Object of Printer pointed by pRef shall be notified
			//pRef.notifyAll(); In Case many threads are waiting !!
		}
	}	
}

public class Synchronization {

	public static void main(String[] args) {
		
		// We have created just a single Printer Object
		Printer printer = new Printer(); 
		
		// Computer and MobilePhone are working on same single object of Printer
		// When multiple threads are going to access same object we must synchronize them
		Computer cRef = new Computer(printer);
		MobilePhone mRef = new MobilePhone(printer);
		
		cRef.start();
		mRef.start();

	}

}
