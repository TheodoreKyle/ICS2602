public class Triangle implements Shape { 
	private int side1;  
	private int side2; 
	private int side3;  
	
	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1; 
		this.side2 = side2; 
		this.side3 = side3;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public double getHalf() {
		return (side1 + side2 + side3) / 2.0;  
	}
	
	public double getArea() {
		double half = getHalf(); 
		return Math.sqrt(half * (half - side1) * (half - side2) * (half - side3)); 
	}
	
	public void getDetails() {
		System.out.println("Type: Triangle");
		System.out.println("Side1: " + side1);
		System.out.println("Side2: " + side2);
		System.out.println("Side3: " + side3);
		System.out.println("Perimeter: " + getPerimeter());
		System.out.println("Area: " + getArea()); 
	}
}
