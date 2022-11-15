package ese4;

class Human{
	final void reading() {
		System.out.println("is reading");
	}
	
	void eating() {
		System.out.println("is eating");
	}
}

class Student extends Human{
	void study(){
		System.out.println("is studying");
	}
}

public class pgm2 {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.reading();
		s.eating();
		s.study();
	}
}
