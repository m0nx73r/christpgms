package prac8;

class human{
	final static void reading() {
		System.out.println("Reading...");
	}
	
	static void eating() {
		System.out.println("Eating...");
	}
}

public class pgm5 extends human{

	public static void main(String[] args) {
		
		reading();
		eating();
	}
}
