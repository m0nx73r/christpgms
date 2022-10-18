package prac13;


class table4 extends Thread{
	
	synchronized void tableof4(){
		for(int i = 4; i <= 40; i++) {
			if(i%4==0) {
				System.out.println("Table of 4 : " + i);
			}
		}
	}

	public void run() {
		tableof4();
	}
}

class table5 extends Thread{
	
	synchronized void tableof5(){
		for(int i = 5; i <= 50; i++) {
			if(i%5==0) {
				System.out.println("Table of 5 : " + i);
			}
		}
	}
	
	public void run() {
		tableof5();
	}
}

class table6 extends Thread{
	
	synchronized void tableof6(){
		for(int i = 6; i <= 60; i++) {
			if(i%6==0) {
				System.out.println("Table of 6 : " + i);
			}
		}
	}
	
	public void run() {
		tableof6();
	}
}


public class pgm4 {

	public static void main(String[] args) {
		table4 t = new table4();
		table5 t1 = new table5();
		table6 t2 = new table6();
		t.start();
		t1.start();
		t2.start();
	}
}
