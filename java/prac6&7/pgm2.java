package prac6_7;

class Emp{
	int id;
	String name, designation, domain;
	float salary;
	
	Emp(int id, String name, String designation, String domain, float salary){
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.domain = domain;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(String.format("%d %s %s %s %f", this.id,this.name,this.designation,this.domain,this.salary));
	}

}

public class pgm2 {
	
	public static void main(String[] args) {
		Emp emp = new Emp(1, "Aditya", "CEO", "IT", 5100000000f);
		emp.display();
	}
}
