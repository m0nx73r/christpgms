package prac9_10;

import java.util.Scanner;

public class pgm1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] strArray = str.toCharArray();
		
		for(int i = 0; i < strArray.length; i++) {
			if(i%2==0) {
				strArray[i] = Character.toUpperCase(strArray[i]);
			}
		}
		
		System.out.println(new String(strArray));
		sc.close();
		
	}
}
