package pgm1;
import java.util.Scanner;

public class pgm2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, subject, grade;
		int age;
		float marks;
		
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("\nEnter subject : ");
		subject = sc.nextLine();
		System.out.print("\nEnter class : ");
		grade = sc.nextLine();	
		System.out.print("\nEnter age : ");
		age = sc.nextInt();
		System.out.print("\nEnter marks : ");
		marks = sc.nextFloat();
		sc.close();
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Class : " + grade);
		System.out.println("Subject : " + subject);
		System.out.println("Marks : " + marks);
		
	}
}
