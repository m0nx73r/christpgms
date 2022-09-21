package prac9_10;

public class pgm3 {
    public static void main(String[] args){
        String s = "apple";
        System.out.println("Legth : " + s.length());
        System.out.println("Trim : " + " apple".trim());
        System.out.println("Split : " + s.split("l")[0]);
        System.out.println("Equals : " + s.equals("applee"));
        System.out.println("Contains : " + s.contains("app"));
    }
}
