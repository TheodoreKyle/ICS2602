import java.util.*; 
@SuppressWarnings("resource") 
public class November_29_2024_LongQuizPart2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int even = 0, odd = 0;
        int[][] A = new int[4][3]; 
        System.out.print("Enter 12 integers: "); 
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 3; b++) 
            A[a][b] = input.nextInt(); 
        }
        int[] E = new int[12]; 
        int[] O = new int[12]; 
        for (int a = 0; a < 4; a++) { 
            for (int b = 0; b < 3; b++) {
                if (A[a][b] % 2 == 0) {
                    E[even] = A[a][b]; 
                    even++; 
                }
                else {
                    O[odd] = A[a][b]; 
                    odd++; 
                }
            }
        }
        for (int a = 0; a < even; a++) { 
            for (int b = a + 1; b < even; b++) { 
                if (E[a] > E[b]) {
                    int tmp = E[a];
                    E[a] = E[b]; 
                    E[b] = tmp; 
                }
            }
        }
        System.out.println();
        System.out.println("Arranging even integers in ascending order:");
        for (int c = 0; c < even; c++) 
        System.out.print(E[c] + "\t"); 
    }
}