package prac3;

public class prac5 {

	public static void main(String[] args) {
		int org[]={20,30,40,50,60};
		System.out.println("Printing original array:");
		
		for(int i:org)
			System.out.println(i);

		System.out.println("Printing clone of the array:");

		int copy[]=org.clone();

		for(int i:copy)
			System.out.println(i);

		System.out.print("Are both equal? ");
		System.out.print(org==copy);
	}
}
