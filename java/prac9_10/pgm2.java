package prac9_10;

public class pgm2 {
    public static void main(String[] args){
        String s = "apple";
        System.out.println("Last index : " + s.lastIndexOf('l'));
        System.out.println("Index of : " + s.indexOf(s));
        System.out.println("Char at : " + s.charAt(2));
        System.out.println("Repeat : " + s.repeat(2));
        System.out.println("Contains : " + s.contains("app"));
    }
}
