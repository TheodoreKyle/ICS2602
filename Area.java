import java.util.*;
public class Area{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int l, w;
		System.out.print("Enter the length of the rectangle: ");
		l = input.nextInt();
		System.out.print("Enter the width of the rectangle: ");
		w = input.nextInt();
		System.out.println("The perimeter of the rectangle is " + 2 * (l + w) + "m.");
		System.out.println("The perimeter of the rectangle is " + l * w + "m^2.");
		input.close();
	}
}