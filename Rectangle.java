public class Rectangle implements Shape {
	private int length;
	private int width;  
	
	public Rectangle(int length, int width) {
		this.length = length; 
		this.width = width; 
	}
	
	public double getPerimeter() {
		return (2 * length) + (2 * width);  
	}
	
	public double getArea() {
		return length * width;  
	}
	
	public void getDetails() {
		System.out.println("Type: Rectangle");
		System.out.println("Length: " + length);
		System.out.println("Width: " + width); 
		System.out.println("Perimeter: " + getPerimeter());
		System.out.println("Area: " + getArea()); 
	}
}