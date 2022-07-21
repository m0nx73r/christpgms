package pgm1;
import java.util.Scanner;

class Employee{
	String name;
	int hoursWorked, wagePerHour;
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee name : ");
		this.name = sc.nextLine();
		
		System.out.print("Enter number of hours " + this.name + " worked : ");
		this.hoursWorked = sc.nextInt();
		
		System.out.print("Enter wage per hour of " + this.name + " : ");
		this.wagePerHour = sc.nextInt();
		sc.close();
		
	}
	
	public void display() {
		System.out.println("Employee name : " + this.name);
		System.out.println("Number of hours worked per day : " + this.hoursWorked);
		System.out.println("Wage per hour : " + this.wagePerHour);
	}
	
	public float calcwg() {
		float wage = this.hoursWorked * this.wagePerHour;
		if (wage < 200) {
			return wage += 150;
		}
		else {
			return wage += 50;
		}
	}
	
	public void totalWage() {
		System.out.println("Total wage : " + this.calcwg());
	}
}

public class pgm3 {
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		System.out.println("Enter employee information");
		emp.read();
		System.out.println("Displaying employee information : ");
		emp.display();
		emp.totalWage();
		
	}		
}
