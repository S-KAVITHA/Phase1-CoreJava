package multithreading;

public class ThreadWithAnomymousClass2 {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread ABC is Running ..");
				}

			}
		});
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread XYZ is Running ..");
				}

			}
		});
		thread2.start();
	}

}
