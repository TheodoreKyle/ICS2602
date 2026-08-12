import java.util.*;
public class Three_Integers {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a >= b && a >= c) {
            System.out.println("The greatest is: " + a);
        }
        else if (b >= a && b >= c) {
            System.out.println("The greatest is: " + b);
        }
        else {
            System.out.println("The greatest is: " + c);
        }
        if (a <= b && a <= c) {
            System.out.println("The smallest is: " + a);
        }
        else if (b <= a && b <= c) {
            System.out.println("The smallest is: " + b);
        }
        else {
            System.out.println("The smallest is: " + c);
        }
        System.out.printf("The average of the 3 numbers is: %.2f", (a + b + c) / 3.0);
        in.close(); 
    }
}