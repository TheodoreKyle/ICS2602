import java.util.*;
public class October_17_2024 {  
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int i, sum, number, ii, sum2, number2, ctr1, factorial,  product, iii; 
        sum = 0;
        sum2 = 0;
        i = 1; 
        ii = 1;
        iii = 1;
        ctr1 = 0;
        product = 1;

        System.out.print("Enter a number to find the sum from 1 to input number: "); 
        number = input.nextInt(); 
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
        System.out.print("\nEnter a number to find all the numbers within it divisible by 3: "); 
        number2 = input.nextInt();
        while (ii <= number2) {
            if (ii % 3 == 0) {
                System.out.println(ii); 
                sum2 += ii;
                ctr1++;
            }
            ii++; 
        }
        System.out.println("Sum = " + sum2);
        System.out.println("The average is = " + sum2 * 1.0 / ctr1);
        System.out.print("\nEnter a number to find its factorial: ");
        factorial = input.nextInt();
        while (iii <= factorial) {
            product *= iii;
            iii++;
        }
        System.out.println("The factorial is: " + product);
        input.close();
    }
}