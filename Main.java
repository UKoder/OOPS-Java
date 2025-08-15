package Assignment_1;

public class Main {
	
	public static void main(String [] args) {
		
		/*Square square = new Square();
		square.getColor("Red").getArea(50.0);*/
		new Square().dispColor("Red").dispArea(50);
		new Rectangle().dispColor("Blue").dispArea(20, 50);
		
	}
}