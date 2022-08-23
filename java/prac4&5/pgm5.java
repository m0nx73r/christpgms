package pgm4_5;


class Outer{
	protected class inner{
		void fact(int n) {
			int fact = 1;
			for(int i = 1; i <= n; i++) {
				fact *= i;
			}
			System.out.println(String.format("The factorial of %d is %d", n, fact));
		}
		
		void fib(int n) {
			int firstTerm = 0, secondTerm = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstTerm + " ");
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		}
	}
}
public class pgm5 {

	public static void main(String[] args) {
		Outer outerClass = new Outer();
		Outer.inner calcFibFact = outerClass.new inner();
		calcFibFact.fact(5);
		calcFibFact.fib(15);
	}

}
