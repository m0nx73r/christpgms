package prac12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pgm3 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader =new BufferedReader(new FileReader("A:\\EclipseIDE\\prac12\\src\\prac12\\pgm3.txt"));

        String Int_line;
        int r = 0;

        while ((Int_line = reader.readLine()) != null) {
            int marks = Integer.parseInt(Int_line);
            r += marks;
        }
        System.out.println("Total marks = " + r);
        reader.close();
    }
}