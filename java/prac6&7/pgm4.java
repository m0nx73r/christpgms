package prac6_7;

class volBox{
	float l,b,h;
	float volume(){
		return l*b*h;
	}
}

class volBoxW extends volBox{
	float w;
}

class volBoxWShip extends volBoxW{
	String shipmentDetails;
}

public class pgm4 {

	public static void main(String[] args) {
		volBoxWShip box = new volBoxWShip();
		box.l = 50;
		box.b = 70;
		box.h = 90;
		System.out.println("Volume of the box is : " + box.volume());
		box.w = 35;
		box.shipmentDetails = "Udaipur";
		System.out.println(box.shipmentDetails);
	}
}
