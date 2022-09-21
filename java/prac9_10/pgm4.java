package prac9_10;

class NoSuchEmployeeException extends Exception{
    public String toString(){
        return "Exception caught";
    }
}

public class pgm4 extends NoSuchEmployeeException{
    public static void main(String[] args){
        String s = "Students";

        if (s != "Students" || s != "Faculty" || s != "Staff"){
            try {
                throw new NoSuchEmployeeException ();
            } catch (NoSuchEmployeeException e) {
                e.printStackTrace();
            }
        }
    }
}