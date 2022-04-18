package multithreading;

public class OrganizationThread {

	// main thread
	public static void main(String[] args) {

		// create a new thread
		John thread1 = new John();
		thread1.start();

		// create a new thread sam
		Sam thread2 = new Sam();
		thread2.start();

		// create a new thread sam
		Azhar thread3 = new Azhar();
		thread3.start();

	}

}

class Task {
	public void updateWork() {}
}

class John extends Thread {

	@Override
	public void run() {
		// thread processing logic.
		System.out.println(" John Thread is running ...");
	}
}

class Sam extends Thread {

	@Override
	public void run() {
		// thread processing logic.
		System.out.println(" Sam Thread is running ...");
	}
}

class Azhar extends Thread {

	@Override
	public void run() {
		// thread processing logic.
		System.out.println(" Azhar Thread is running ...");
	}
}