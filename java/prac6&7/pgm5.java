package prac6_7;


class university{
	university(){}

}

class christ extends university{
	String course;
	int exp;
	
	christ(){
		super();
	}
	
	
	christ(String course){
		System.out.println(course);
	}
	
	christ(int exp){
		System.out.println(exp);
	}
	
	christ(String course, int exp){
		System.out.println(course + exp);
	}
	
}

public class pgm5 {

	public static void main(String[] args) {
		
		new christ(5);
	}
}
