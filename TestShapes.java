public class TestShapes {
	public static void main (String[] args) {
		try {
			if (args.length == 0) 
				throw new IllegalArgumentException("Pass one to three values via command line."); 
			if (args.length > 3)
				throw new IllegalArgumentException("Limit your arguments to a maximum of 3 values."); 
				
			int[] values = new int[args.length];
        	for (int i = 0; i < args.length; i++) { 
            	values[i] = Integer.parseInt(args[i]);
            	if (values[i] < 0) 
                	throw new IllegalArgumentException("A negative value was passed.");
			}	

			if (args.length == 1) {
				int radius = Integer.parseInt(args[0]); 
				Shape circle = new Circle(3.14f, radius);  
				circle.getDetails();   
			}
			else if (args.length == 2) {
				int length = Integer.parseInt(args[0]);
				int width = Integer.parseInt(args[1]); 
				if (length < width) {
					int tmp = length; 
					length = width;
					width = tmp; 
					Shape rectangle = new Rectangle(length, width);
					rectangle.getDetails();
				} 
				else if (length > width) {
					Shape rectangle = new Rectangle(length, width);
					rectangle.getDetails();
				} 
				else if (length == width) {
					int side = length; 
					Shape square = new Square(side);
					square.getDetails(); 
				}
			}
			else if (args.length == 3) {
				int side1 = Integer.parseInt(args[0]);
				int side2 = Integer.parseInt(args[1]);
				int side3 = Integer.parseInt(args[2]);
				Shape triangle = new Triangle(side1, side2, side3);  
				triangle.getDetails(); 
			}
		}
		catch (NumberFormatException nfe) {
			System.err.println("An argument contains a String value."); 
			System.err.println("A NumberFormatException is caught.");
		}
		catch (IllegalArgumentException iae){
			System.err.println(iae.getMessage());
			System.err.println("An IllegalArgumentException is caught."); 
		}
	}
}