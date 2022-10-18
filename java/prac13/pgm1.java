package prac13;
import java.lang.Thread;

class odd extends Thread{
	int range;
	public void run() {
		for (int i = 1; i<= range; i++) {
			if (i%2!=0) {
				System.out.println("Odd " + i);
			}
		}
	}
}

class even extends Thread{
	int range;
	public void run() {
		for (int i = 1; i<= range; i++) {
			if (i%2==0) {
				System.out.println("Even " + i);
			}
		}
	}
}

public class pgm1 extends Thread{
	public static void main(String[] args) {
		odd o = new odd();
		even e = new even();
		e.range = 10;
		o.range = 5;
		o.start();
		e.start();
	}

}
