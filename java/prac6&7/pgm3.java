package prac6_7;


class parent{
	String color, habits;
	float height;
}


public class pgm3 extends parent{
	int age;
	public static void main(String[] args) {
		
		pgm3 child = new pgm3();
		child.color = "Brown";
		child.habits = "Playing";
		child.height = 180;
		child.age = 10;
		
		System.out.println(child.color);
		System.out.println(child.habits);
		System.out.println(child.height);
		System.out.println(child.age);
	}
}
