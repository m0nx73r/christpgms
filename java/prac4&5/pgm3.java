package pgm4_5;


class Area{
	
	public float square(float side) {
		return side*side;
	}
	
	public float triangle(float base, float height) {
		return 0.5f * base * height;
	}
	
	public float reactangle(float length, float breadth) {
		return length*breadth;
	}
	
}

public class pgm3 {

	public static void main(String[] args) {
		Area areaCalc = new Area();
		
		float squareArea = areaCalc.square(5.5f);
		float triangleArea = areaCalc.triangle(6.2f, 7.9f);
		float rectangleArea = areaCalc.reactangle(2.5f, 5.0f);
		
		System.out.println("Area of square is : " + squareArea);
		System.out.println("Area of triangle is : " + triangleArea);
		System.out.println("Area of rectangle is : " + rectangleArea);
		

	}

}
