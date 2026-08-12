import java.util.*;
public class CHOA_LabAct_7a1 {
    public static void Sum_Average (int a, int b) {
        int sum, ctr;
        sum = 0;
        ctr = 0; 
        double average;
        do {
            if (a % 2 ==1) {
                sum += a;
                ctr++;
            }
        a++;
        }
        while (a <= b); 
        average = sum * 1.0 / ctr;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
    }
    public static void main (String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        a = in.nextInt();
        b = in.nextInt();
        Sum_Average(a, b);
        in.close();
    }
}