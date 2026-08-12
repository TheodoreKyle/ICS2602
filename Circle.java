public class Circle implements Shape {
	private float PI = 3.14f;
	private int radius; 
	
	public Circle(float PI, int radius) {
		this.PI = PI; 
		this.radius = radius; 
	}
	
	public double getPerimeter() {
		return 2 * PI * radius; 
	}
	
	public double getArea() {
		return PI * radius * radius; 
	}
	
	public void getDetails() {
		System.out.println("Type: Circle");
		System.out.println("Radius: " + radius);
		System.out.println("Perimeter: " + getPerimeter()); 
		System.out.println("Area: " + getArea()); 		
	}
}
