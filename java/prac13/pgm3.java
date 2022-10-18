package prac13;


class test extends Thread{
	public void run(){
		System.out.println("Thread is running");
	}
	
}
public class pgm3 {
	

	public static void main(String[] args) {
		test t = new test();
		t.setPriority(t.MAX_PRIORITY);
		System.out.println(t.getPriority());
		t.setPriority(t.MIN_PRIORITY);
		System.out.println(t.getPriority());
		t.setPriority(t.NORM_PRIORITY);
		System.out.println(t.getPriority());

	}

}
