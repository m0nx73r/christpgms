package pgm4_5;


class company{
	private String comp_name;
	private String comp_type;
	
	
	public String getComp_name() {
		return comp_name;
	}


	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}


	public String getComp_type() {
		return comp_type;
	}


	public void setComp_type(String comp_type) {
		this.comp_type = comp_type;
	}


	company(String name, String type){
		this.comp_name = name;
		this.comp_type = type;
	}
}

public class pgm2 {	
	
	public static void main(String[] args) {
		company c1 = new company("TCS", "IT");
		company c2 = new company("Arcesium", "Finance");
		company c3 = new company("Colgate", "HealthCare");
		company c4 = new company("BMW", "Automobiles");
		company c5 = new company("Amazon", "Online Selling");
		
		System.out.println(c1.getComp_name() + " " + c1.getComp_type());
		System.out.println(c2.getComp_name() + " " + c2.getComp_type());
		System.out.println(c3.getComp_name() + " " + c3.getComp_type());
		System.out.println(c4.getComp_name() + " " + c4.getComp_type());
		System.out.println(c5.getComp_name() + " " + c5.getComp_type());
	}
}
