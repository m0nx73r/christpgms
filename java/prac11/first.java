package pkg2;

public class first {
	public static void fib(int n) {
		 int i = 1, firstTerm = 0, secondTerm = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    while (i <= n) {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;

		      i++;
		    }
	}
	public static void main(String[] args) {

	}
}
