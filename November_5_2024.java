import java.util.*; 
@SuppressWarnings("resource") 
public class November_5_2024 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); 
        final int SENTINEL = -99;
        int score, sum, ctr;
        System.out.print("Enter the first score: ");
        for (sum = 0, score = 0, ctr = 0, score = input.nextInt(); score != SENTINEL; score = input.nextInt()) {
            sum += score;
            ctr++; 
            System.out.print("Enter the next score: ");
        }
        input.close(); 
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum * 1.0 / ctr);
    }
}