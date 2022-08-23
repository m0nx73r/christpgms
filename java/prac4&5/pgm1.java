package pgm4_5;

public class pgm1 {
	int roll;
	String name;
	String course;
	String address;
	long phoneNum;
	
	pgm1(){
//		System.out.println("This is default constructor");
	}
	
	pgm1(int r, String n, String c, String a, long p){
//		System.out.println("This is parameterized constructor");
		roll = r;
		name = n;
		course = c;
		address = a;
		phoneNum = p;
	}	
	
	public static void main(String[] args) {
		pgm1 s1 = new pgm1(45, "Aditya", "BCA", "Marium Nagar", 790905890);	
		pgm1 s2 = new pgm1(46, "Anish", "BCA", "Marium Nagar", 790905891);	
		pgm1 s3 = new pgm1(47, "Arin", "BCA", "Marium Nagar", 790905892);	
		pgm1 s4 = new pgm1(48, "Ansh", "BCA", "Marium Nagar", 790905893);	

		System.out.println("Parameterized Constructor values : ");  
		System.out.println(s1.roll + " " + s1.name + " " + s1.course + " " +s1.address + " " +s1.phoneNum);
		System.out.println(s2.roll + " " + s2.name + " " + s2.course + " " +s2.address + " " +s2.phoneNum);
		System.out.println(s3.roll + " " + s3.name + " " + s3.course + " " +s3.address + " " +s3.phoneNum);
		System.out.println(s4.roll + " " + s4.name + " " + s4.course + " " +s4.address + " " +s4.phoneNum);
	}
}
