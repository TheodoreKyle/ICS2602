import java.util.*;
public class Asynchronous_October_17_2024 { //2 Formative Practices from Ma'am 
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int N, sum1, ctr1, a, integers, integers_25, b, sum2, ctr2; //ctr1 = number  of even numbers divisible by 5, ctr2 = number of odd numbers
        sum1 = 0; 
        sum2 = 0;
        ctr1 = 0; 
        ctr2 = 0;
        a = 1;
        b = 1;
        System.out.print("1. Enter the number of integers to be computed: ");   
        N = input.nextInt();
        System.out.print("Enter the integers: ");
        while (a <= N) {
            integers = input.nextInt();  
            a++;
        if (integers % 2 == 0 && integers % 5 == 0){
            sum1 += integers;
            ctr1++; 
        }
        }
        if (ctr1 > 0) {
            System.out.println("The average of the even numbers divisible by 5 is: " + sum1 * 1.0 / ctr1);
        } 
        else {
            System.out.println("No even numbers divisible by 5 were entered.");
        }
        System.out.print("\n2. Enter 25 integers: ");
        while (b <= 25) {
            integers_25 = input.nextInt();
            b++; 
        if (integers_25 % 2 == 1) {
            sum2 += integers_25;
            ctr2++; 
        }
        }
        if (ctr2 > 0) {
            System.out.println("The sum of the odd numbers is: " + sum2);
        } 
        else {
            System.out.println("There is no odd number entered.");
        }
    input.close(); 
    } 
}