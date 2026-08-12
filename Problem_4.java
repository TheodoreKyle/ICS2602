import java.util.*;
public class Problem_4 {
    static void numbers(int a, int b, int c){
        int sum = a + b + c;
        int product = a * b * c;
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.printf("The average is: %.3f", (sum) / 3.0);
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 integers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        numbers (a, b, c);
        in.close(); 
    }
}