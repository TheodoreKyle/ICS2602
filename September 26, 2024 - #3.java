import java.util.*;
class Square_SquareRoot_AbsoluteValue {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double num;
        char choice;
        System.out.print("Enter any number: ");
        num = in.nextDouble();
        System.out.print("CHOICES: \n A - Square \n B - Square Root \n C - Absolute Value \nEnter choice: ");
        choice = in.next().charAt(0);
        if (choice == 'a' || choice == 'A')
            System.out.printf("%.3f", Math.pow(num, 2));
        else if (choice == 'b' || choice == 'B')
            System.out.printf("%.3f", Math.sqrt(Math.abs(num)));
        else if (choice == 'c' || choice == 'C')
            System.out.println(Math.abs(num)); 
        else
            System.out.println("Invalid choice.");
    }
}