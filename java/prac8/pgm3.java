package prac8;

abstract class Shape{
	
	abstract float RectangleArea(float l, float b);
	abstract float SquareArea(float side);
	abstract float CircleArea(float r);
}

class Area extends Shape{

	@Override
	float RectangleArea(float l, float b) {
		return l*b;
	}

	@Override
	float SquareArea(float side) {
		return side*side;
	}

	@Override
	float CircleArea(float r) {
		return 22/7*r*r;
	}
}

public class pgm3 {
	public static void main(String[] args) {
		Area areaCalc =  new Area();
		System.out.println("Area of rectangle with length 5 and breadth 7.6 : " + areaCalc.RectangleArea(5f, 7.6f));
		System.out.println("Area of sqaure with side 10.5: " + areaCalc.SquareArea(10.5f));
		System.out.println("Area of circle with radius 4.5 : " + areaCalc.CircleArea(4.5f));
	}
}
