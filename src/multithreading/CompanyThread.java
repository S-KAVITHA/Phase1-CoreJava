package multithreading;

public class CompanyThread {

	public static void main(String[] args) {
		
		Bob bob = new Bob();
		Thread thread1 =  new Thread(bob);
		thread1.start();
		
		Mark mark = new Mark();
		Thread thread2 =  new Thread(mark);
		thread2.start();

	}

}

class Work {
	public void updateWork() {}
}

class Bob extends Work implements Runnable {

	@Override
	public void run() {
		System.out.println("Runing Bob.. ");
		
	}
	
}

class Mark extends Work implements Runnable {

	@Override
	public void run() {
		System.out.println("Runing Mark.. ");
		
	}
	
}