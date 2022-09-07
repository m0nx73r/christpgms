package prac8;

final class pen{
	void ink() {
		System.out.println("This is ink method.");
	}
	
	void nib() {
		System.out.println("This is nib method.");
	}
}

public class pgm4 {

	public static void main(String[] args) {
		pen p = new pen();
		p.ink();
		p.nib();
	}
}
