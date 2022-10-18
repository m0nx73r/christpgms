package prac12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class pgm1{
  public static void main(String[] args) {
    try {
      FileInputStream file = new FileInputStream("A:\\EclipseIDE\\prac12\\src\\prac12\\file.txt");
      BufferedInputStream input = new BufferedInputStream(file);
      int i = input .read();

      while (i != -1) {
        System.out.print((char) i);
        i = input.read();
      }
      input.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
  }
}
