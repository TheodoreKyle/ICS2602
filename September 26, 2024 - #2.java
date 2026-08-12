import java.util.*;
class Squaring_and_SqareRoot_of_2_Integers{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the value of num1: ");
        num1 = in.nextInt();
        System.out.println("Enter the value of num2: ");
        num2 = in.nextInt();
        if (num1 > num2)
            System.out.printf("X = %.3f", Math.pow(num1, 2) + Math.pow(num2, 2));
        else if (num2 > num1)
            System.out.printf("Y = %.3f", Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2)));
        else 
            System.out.println("The numbers are equal.");
        in.close();
    }
}