public class Square implements Shape {
	private int side; 
	
	public Square(int side) {
		this.side = side; 
	}
	
	public double getPerimeter() {
		return 4 * side;  
	}
	
	public double getArea() {
		return side * side;
	}
	
	public void getDetails() {
		System.out.println("Type: Square");
		System.out.println("Side: " + side);
		System.out.println("Perimeter: " + getPerimeter()); 
		System.out.println("Area: " + getArea()); 
	}
}