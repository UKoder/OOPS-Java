package Assignment_1;

public class Rectangle {
	String color;
	double length;
	double width;
	
	Rectangle dispColor(String color) {
		this.color = color;
		System.out.println("The color of the square is: "+color);
		return this;
	}
	
	Rectangle dispArea(double length,double width) {
		this.length = length;
		this.width =width;
		System.out.println("The area of the square is: "+(this.length*this.width));
		return this;
	}
}
