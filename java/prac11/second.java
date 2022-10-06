package prac11;
import pkg2.first;
import java.util.Scanner;


public class second {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		first.fib(n);
		sc.close();
	}
}