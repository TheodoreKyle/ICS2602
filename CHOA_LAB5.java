import java.util.*;
public class CHOA_LAB5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        final double z = 2.5;
        int x, y;
		final double V;
        System.out.print("Enter the value for integer x: ");
        x = input.nextInt();
        System.out.print("Enter the value for integer y: ");
        y = input.nextInt();
        switch (x) {
            case 1:
                if (1 < y && y < 5) {
				V = x * y * z;
				System.out.println("V = " + x + " * " + y + " * " + z + " = " + V);
                }
                else {
                    V = x + y / z;
                    System.out.println("V = " + x + " + " + y + " / " + z + " = " + V);
                }
            break;
            case 2:
                if (y <= 5) {
				V = Math.abs((x - y) / z);
                System.out.println("V = " + "|(" + x + " - " + y + ")" + "/" + z + "| = " + V);
                }
                else {
                    V = x - Math.sqrt(y) + z;
                    System.out.printf("V = " + x + " - √" + y + " + " + z + " = %.3f", V);
                }
            break;
            default:
			    V = x + y + z;
                System.out.println("V = " + x + " + " + y + " + " + z + " = " + V);
        }
        input.close(); 
    }
}