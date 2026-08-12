import java.util.*;
public class FormattingExample { 
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in); 
        double numerator, denominator; 
        try {
            System.out.print("Enter first number (numerator): "); 
            numerator = in.nextDouble();
            System.out.print("Enter second number (denominator): "); 
            denominator = in.nextDouble();
            System.out.println("\n1. Raw double: " + numerator / denominator);
            System.out.println(String.format("2. Two decimal places: %.2f", numerator / denominator)); 
            System.out.println(String.format("%6.2f", numerator / denominator)); 
            System.out.printf("%6.2f", numerator / denominator);
            System.out.println(String.format("%n%o", 99));
        }   
        catch (Exception ime) {
            System.out.println("Please enter numbers only.");
        } 
        in.close(); 
    }
}