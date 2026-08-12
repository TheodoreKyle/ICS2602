import java.util.*;
public class CHOA_LAB4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double side_square, base_triangle, side_a, side_b;
        float radius_circle, height_triangle, height_trapezoid;
        System.out.print("Enter the side of the square: ");
        side_square = in.nextDouble();
        System.out.print("Enter the radius of the circle: ");
        radius_circle = in.nextFloat();
        System.out.print("Enter the base and height of the triangle: ");
        base_triangle = in.nextDouble();
        height_triangle = in.nextFloat();
        System.out.print("Enter the bases of the trapezoid: ");
        side_a = in.nextDouble();
        side_b = in.nextDouble();
        System.out.print("Enter the height of the trapezoid: ");
        height_trapezoid = in.nextFloat();
        double square_area = AREA(side_square);
        double circle_area = AREA(radius_circle);
        double triangle_area = AREA(base_triangle, height_triangle);
        double trapezoid_area = AREA(side_a, side_b, height_trapezoid);
        System.out.printf("\nThe area of the sqaure is: %.4f", square_area);
        System.out.printf("\nThe area of the circle is: %.4f", circle_area);
        System.out.printf("\nThe area of the triangle is: %.4f", triangle_area);
        System.out.printf("\nThe area of the trapezoid is: %.4f", trapezoid_area);
        in.close();
        }
        public static double AREA(double side_square) {
            return Math.pow(side_square, 2);
        }
        public static double AREA(float radius_circle){
            return (Math.PI * Math.pow(radius_circle, 2));
        }
        public static double AREA(double base_triangle, float height_triangle) {
            return (base_triangle * height_triangle) / 2;
        }
        public static double AREA(double side_a, double side_b, float height_trapezoid) {
            return (side_a + side_b) / 2 * height_trapezoid;
        }
}