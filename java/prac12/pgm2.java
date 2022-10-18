package prac12;

import java.io.FileWriter;

public class pgm2 {
  public static void main(String args[]) {

    String emp = "Ram 5000\nSohan 7000\nKrish 8000\nJohn 5000\nMark 8000";
     try {
       FileWriter output = new FileWriter("A:\\EclipseIDE\\prac12\\src\\prac12\\pgm2.txt");
       output.write(emp);
       System.out.println("Data is written to the file.");
       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }
  }
}