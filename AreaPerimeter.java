import java.util.*;
public class AreaPerimeter {
    static double perimeter (int n, double s){
        return s * n;
    }
    static double area (double r, double perimeter){
        return r * perimeter / 2;
    }
    static void display(double perimeter, double area){
        System.out.printf("The perimeter of the polygon is: %.3f", perimeter);
        System.out.println();
        System.out.printf("The area of the polygon is: %.3f", area);
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        double r, s;
        System.out.println("Enter the length of the side of the polygon: ");
        s = input.nextDouble();
        System.out.println("Enter the number of sides: ");
        n = input.nextInt();
        System.out.println("Enter the apothem length: ");
        r = input.nextDouble();
        double perimeter = perimeter(n, s);
        double area = area(r, perimeter);
        display(perimeter, area);
        input.close(); 
    }
}