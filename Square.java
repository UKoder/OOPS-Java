package Assignment_1;

public class Square {
	
	String color;
	double side;
	
	Square dispColor(String color) {
		this.color = color;
		System.out.println("The color of the square is: "+this.color);
		return this;
	}
	
	Square dispArea(double side) {
		this.side = side;
		System.out.println("The area of the square is: "+(this.side*this.side));
		return this;
	}
	
}
