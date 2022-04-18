package multithreading;

public class ThreadWithAnomymousClass {

	public static void main(String[] args) {

		Runnable obj1 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread ABC is Running ..");
				}

			}
		};

		Runnable obj2 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread XYZ is Running ..");
				}

			}
		};
		
		Thread thread1 = new Thread(obj1);
		thread1.start();
		
		Thread thread2 = new Thread(obj2);
		thread2.start();
	}
}
