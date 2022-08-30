package prac6_7;

public class pgm1 {
	
	static class Student{
		int age;
		String name;
		
		void print(String str) {
			System.out.println(str);
		}
		
		Student(int age, String name){
			this.age = age;
			this.name = name;
		}	
		
		void displayValues() {
			print(this.age + this.name);
		}
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student(22, "Mahajan");
		s1.displayValues();

	}

}
