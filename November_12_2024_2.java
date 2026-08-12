import java.util.*; 
@SuppressWarnings("resource")
public class November_12_2024_2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);  
        int integer, sum = 0, ctr = 0; 
        int[] positiveIntegers = new int[999]; 
        System.out.print("Enter any positive integer: "); 
        integer = input.nextInt();
        while (integer != 0) {
            if (integer > 0) {
                positiveIntegers[ctr] = integer; 
                sum += integer; 
                ctr++;
            }
            else
            System.out.println("ERROR. Type another value.");
            System.out.print("Enter another positive integer: ");
            integer = input.nextInt(); 
        }
        if (ctr == 0)
        System.out.println("NO AVERAGE");
        else 
        System.out.printf("Average of the positive integers is: %.2f", sum * 1.0 / ctr);  
    }
} 