import java.util.*;
public class Distance {
    static double distance(double x1, double x2, double y1, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2; 
        System.out.println("Enter the value of x1 and y1: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Enter the value of x2 and y2: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        System.out.printf("The distance betweeen (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is %.3f", distance(x1, x2, y1, y2));
        input.close(); 
    }
}