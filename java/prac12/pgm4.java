package prac12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pgm4 {
	public static void main(String[] args) {
		long lines = 0;
	      try (BufferedReader reader = new BufferedReader(new FileReader("A:\\EclipseIDE\\prac12\\src\\prac12\\pgm3.txt"))) {
	          while (reader.readLine() != null) lines++;
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	      System.out.println(lines);
	}
}
