import java.util.*; 
@SuppressWarnings("resource")
public class November_5_2024_2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); 
        final int SENTINEL = 0; 
        int s, ctr;
        System.out.print("Enter the first positive integer: ");
        for (s = 0, ctr = 0, s = input.nextInt(); s > SENTINEL; s = input.nextInt()) { 
            ctr++;
            System.out.print("Enter the next positive integer. Input 0 or any negative integer to stop counting: "); 
        }
        System.out.println("Number of positive integers = " + ctr);
    }
}