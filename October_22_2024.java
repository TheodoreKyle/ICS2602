import java.util.*;
public class October_22_2024 {
    public static void main (String[] args) { 
        Scanner input = new Scanner(System.in);
        int i, integers, sum, ctr1, ctr2;
        long product;
        i = 1;
        sum = 0;
        product = 1;
        ctr1 = 0;
        ctr2 = 0; 
        System.out.print("Enter 25 integers: ");
        do {
            integers = input.nextInt();
            i++; 
            if (integers % 2 == 1 || integers % 2 == -1) {
                sum += integers; 
                ctr1++;
            }
             else { 
                product *= integers;
                ctr2++; 
            }
        }
        while (i <= 25);
        if (ctr1 > 0 && ctr2 > 0) {
            System.out.println("The sum of all odd numbers is: " + sum); 
            System.out.println("The product of all even numbers is: " + product);
        }
        else if (ctr1 == 0) 
            System.out.println("NO ODD NUMBER.");
        else 
            System.out.println("NO EVEN NUMBER.");
        input.close(); 
    }
}