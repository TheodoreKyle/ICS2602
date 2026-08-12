import java.util.*;
public class AreaTriangle {
    static double hypotenuse (double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    static double area (double a, double b){
        return a * b / 2;
    }
    static void display(double hypotenuse, double area){
        System.out.printf("The hypotenuse of the triangle is: %.3f", hypotenuse);
        System.out.println();
        System.out.printf("The area of the right triangle is: %.3f", area);
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double a, b;
        System.out.println("Enter the leg (a) of the triangle: ");
        a = in.nextDouble();
        System.out.println("Enter the base (b) of the triangle: ");
        b = in.nextDouble();
        double hypotenuse = hypotenuse(a, b);
        double area = area(a, b);
        display(hypotenuse, area);
        in.close();       
    }
}