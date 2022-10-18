package prac13;

public class pgm2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		Runnable r1 = new pgm2();
		Thread t1 = new Thread(r1, "Thread 1");
		t1.start();

	}
}
