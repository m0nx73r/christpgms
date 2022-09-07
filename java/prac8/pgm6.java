package prac8;

abstract class Plan{
	int rate;
	
	abstract float getRate(float unitsConsumed);
}

class CommercialPlan extends Plan{
	
	float perUnit = 7.80f;
	
	@Override
	float getRate(float unitsConsumed) {
		return perUnit * unitsConsumed;
	}
	
}

class DomesticPlan extends Plan{

	float perUnit = 3.60f;
	
	@Override
	float getRate(float unitsConsumed) {
		return perUnit * unitsConsumed;
	}
}


public class pgm6 {
	public static void main(String[] args) {
		CommercialPlan cp = new CommercialPlan();
		DomesticPlan dp = new DomesticPlan();
		System.out.println("Commerical bill for 532.3 units : " + cp.getRate(532.3f));
		System.out.println("Domestic bill for 532.3 units : " + dp.getRate(532.3f));
	}
}
