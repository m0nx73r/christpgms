package prac8;

abstract class government_policies{
	abstract void return_file();
	abstract void pay_tax();
}

class business_class extends government_policies{

	@Override
	void return_file() {
		System.out.println("Returning File");
	}

	@Override
	void pay_tax() {
		System.out.println("Paying tax");	
	}
	
	void bs() {
		System.out.println("This is business class");
	}
}

class service_class extends government_policies{

	@Override
	void return_file() {
		System.out.println("Returning File");
	}

	@Override
	void pay_tax() {
		System.out.println("Paying tax");	
	}
	
	void sc() {
		System.out.println("This is service class");
	}
}


public class pgm2 {
	public static void main(String[] args) {
		business_class bc = new business_class();
		service_class sc = new service_class();
		
		bc.bs();
		bc.pay_tax();
		bc.return_file();
		
		sc.sc();
		sc.pay_tax();
		sc.return_file();
	}
}
