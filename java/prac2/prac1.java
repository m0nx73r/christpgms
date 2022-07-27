package pgm2;
import java.util.Scanner;
//java program to find grade of a student using if else ladder according to the
//percentage of marks obtained.

public class prac1 {
	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks : ");
		marks = sc.nextInt();
		sc.close();
		
		if(marks >= 90) {
			System.out.println("Excellent");
		}
		else if(90 > marks && marks >= 80) {
			System.out.println("Very Good");
		}
		else if(80 > marks && marks >= 70) {
			System.out.println("Good");
		}
		else if(70 > marks && marks >= 60) {
			System.out.println("Satisfactory");
		}
		else if(60 > marks && marks >= 50) {
			System.out.println("Work Hard");
		}
		else if(50 > marks && marks >= 40) {
			System.out.println("Just Passed");
		}
		else if(marks < 40) {
			System.out.println("Failed");
		}
	}
}
