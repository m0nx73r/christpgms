package prac8;

abstract class university{
	abstract void academic();
	abstract void exam();
	
}

class college extends university{
	void activities() {
		System.out.println("Activities");
	}

	void academic() {
		System.out.println("Academic");		
	}

	@Override
	void exam() {
		System.out.println("Exam");
		
	}
}


public class pgm1 {

	public static void main(String[] args) {
		college c = new college();
		c.academic();
		c.activities();
		c.exam();
	}

}
