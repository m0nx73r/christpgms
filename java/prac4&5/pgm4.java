package pgm4_5;

class Room{
	float length, height, wallArea, breadth, floorArea;
	
	Room(float len, float height, float wallArea, float breadth, float floorArea){
		this.length = len;
		this.height = height;
		this.wallArea = wallArea;
		this.breadth = breadth;
		this.floorArea = floorArea;
	}
	
	void displayValues() {
		System.out.println("The length of room is : " + this.length);
		System.out.println("The breadth of room is : " + this.breadth);
		System.out.println("The height of room is : " + this.height);
		System.out.println("The floor area of room is : " + this.floorArea);
		System.out.println("The wall area of room is : " + this.wallArea);
	}
}

public class pgm4 {
	public static void main(String[] args) {
		Room room = new Room(55.0f, 47.0f, 250.0f, 66.0f, 200f);
		room.displayValues();
	}
}
