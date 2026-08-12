import java.util.*;
public class LongQuizReviewer {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int a = 15;
        double b = a;
        double c = 15.69;
        byte d = (byte) c;

        System.out.println("\nData Types");
        System.out.println("\nWidening Casting");
        System.out.println(a); //Output 15
        System.out.println(b); //Output 15.0 due to double
        System.out.println("\nNarrowing Casting");
        System.out.println(c); //Output 15.69
        System.out.println(d); //Output 15 due to byte
        System.out.println("\nWidening Casting: byte -> short -> char -> int -> long -> float -> double");
        System.out.println("Narrowing Casting: double -> float -> long -> int -> char -> short -> byte");

        String school1 = "University of Santo Tomas";
        String school2 = "university of santo tomas";
        String message = "          I love";  
        String test;

        System.out.println("\nStrings");
        System.out.println("1. " + school1); 
        System.out.println("2. " + school2);
        System.out.println("3. " + message);
        System.out.println("4. " + school1.charAt(0)); //Outputs the first letter of school1
        System.out.println("5. " + school1.length()); //Counts all of text in school1 (Start with 1)
        System.out.println("6. " + school1.equals(school2)); //Displays true or false depending on the value of school1 and school2
        System.out.println("7. " + school1.equalsIgnoreCase(school2)); //Displays true or false depending on the value of school1 and school2, ignores case
        System.out.println("8. " + message.concat(school1)); //Concatenates message to school1
        System.out.print("Type any text to compare with school1: ");
        test = input.nextLine(); //Accepts user input for String
        System.out.println("9. " + test.equals(school1)); //Displays true or false depending on the value of school1 and test
        System.out.println("10. " + school2.toUpperCase());
        System.out.println("11. " + school1.toUpperCase()); //All caps
        System.out.println("12. " + school2.substring(school2.length()-1)); //Outputs the last letter of school2
        System.out.println("13. " + message.charAt(0)); //Outputs the letter found at Position 0
        System.out.println("14. " + school2.length()); //Counts all of text in school2 (Start with 1)
        System.out.println("15. " + school2.replace('i', '!')); //Replaces the value of the left on the right
        System.out.println("16. " + school1.substring(14)); //Outputs the value starting Position 14
        System.out.println("17. " + message.trim()); //Removes white spaces
        System.out.println("18. " + message.length()); //Counts all of text in message (Start with 1)
        System.out.println("19. " + school1.compareTo(school2)); //compareTo method 
        System.out.println("20. " + message.substring(12, 16)); //Positioned in 12 and displays to the right

        int e = 2;
        int f = e++;
        int g = 78;
        int h = 8, i = 1, j = 0, m = 15, n = 5, o = 1, p = 4;
        int k = i--;
        int l = (e==15) ? 25 : 30;
        double ui = 5.67;

        System.out.println("\nOperators");
        System.out.println(e); // f outputs 2 because e has not been incremented
        System.out.println(f); // e outputs 3 because it already has been incremented
        System.out.println(g++); // g outputs 78 because it has not been incremented, but the value of g is now 79
        System.out.println("j = " + --j);
        System.out.println("j = " + j--);
        System.out.println("j = " + j);
        System.out.println(h);
        System.out.println(i);
        System.out.println(m);
        System.out.println(k);
        System.out.println(l); // false, therefore displays the value on the right (30)
        System.out.println(--ui); // 5.67 - 1 
        System.out.println(243 % 100 / 5); // 243 % 100 = 43; 43 / 5 = 8 
        System.out.println(!(n <= 2) && o >= p && p - 2 != 4); 
        System.out.println(n != 2 && o != p || n + 5 * o > 2 - 5 * o / 4);
        System.out.println(!(a <= 2) && b >= c && c - 2 != 4);
        System.out.println("\nOrder of Precedence: Increments, Multiplication, Division, Addition, Subtraction, Shift Operatirs, Comparison, Equality");
        System.out.println("AND, OR, Ternary");

        double side_square, base_triangle, side_a, side_b;
        float radius_circle, height_triangle, height_trapezoid;
        double r, s;

        System.out.println("\nMethods");

        System.out.print("Enter the side of the square: ");
        side_square = input.nextDouble();
        System.out.print("Enter the radius of the circle: ");
        radius_circle = input.nextFloat();
        System.out.print("Enter the base and height of the triangle: ");
        base_triangle = input.nextDouble();
        height_triangle = input.nextFloat();
        System.out.print("Enter the bases of the trapezoid: ");
        side_a = input.nextDouble();
        side_b = input.nextDouble();
        System.out.print("Enter the height of the trapezoid: ");
        height_trapezoid = input.nextFloat();
        double square_area = AREA(side_square);
        double circle_area = AREA(radius_circle);
        double triangle_area = AREA(base_triangle, height_triangle);
        double trapezoid_area = AREA(side_a, side_b, height_trapezoid);
        System.out.printf("\nThe area of the sqaure is: %.4f", square_area);
        System.out.printf("\nThe area of the circle is: %.4f", circle_area);
        System.out.printf("\nThe area of the triangle is: %.4f", triangle_area);
        System.out.printf("\nThe area of the trapezoid is: %.4f", trapezoid_area);
        System.out.println("\nEnter the length of the side of the polygon: ");
        s = input.nextDouble();
        System.out.println("Enter the number of sides: ");
        input.nextInt(); 
        System.out.println("Enter the apothem length: ");
        r = input.nextDouble();
        double perimeter = perimeter(n, s);
        double area = area(r, perimeter);
        display(perimeter, area);

        System.out.println("\nConditonal Statements");
        int num1, num2;
        System.out.println("Enter the value of num1: ");
        num1 = input.nextInt();
        System.out.println("Enter the value of num2: ");
        num2 = input.nextInt();
        if (num1 > num2)
            System.out.printf("X = %.3f", Math.pow(num1, 2) + Math.pow(num2, 2));
        else if (num2 > num1)
            System.out.printf("Y = %.3f", Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2)));
        else 
            System.out.println("The numbers are equal.");
        input.close();        
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
    static double perimeter (int q, double s){
        return s * q;
        }
    static double area (double r, double perimeter){
        return r * perimeter / 2;
        }
    static void display(double perimeter, double area){
        System.out.printf("The perimeter of the polygon is: %.3f", perimeter);
        System.out.println();
        System.out.printf("The area of the polygon is: %.3f", area);
        }
}