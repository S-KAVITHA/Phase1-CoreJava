package multithreading;

public class ThreadWithSleep {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()->{
			System.out.println("Thread t1 working!");
		} );
		
		Thread t2 = new Thread(()->{
			System.out.println("Thread t2 working!");
		} );
		
		Thread t3 = new Thread(()->{
			System.out.println("Thread t3 working!");
		} );
		
		t1.start();
		
		Thread.sleep(5000);
		
		t2.start();
		Thread.sleep(5000);
		
		t3.start();
	}
}