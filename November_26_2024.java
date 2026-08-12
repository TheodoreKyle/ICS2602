import java.util.*; 
public class November_26_2024 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int tmp, i, j; 
        int[][] A = new int[5][5];
        System.out.println("Input 25 integers: "); 

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++)
            A[i][j] = input.nextInt();
        }

        for (i = 0; i < 5; i++) { 
            for (j = 0; j < 5; j++)
            System.out.print(A[i][j] + "\t"); 
            System.out.println(); 
        }
        System.out.println("Interchange the elements of the 1st and 4th row.");
        for (i = 0; i < 5; i++) {
            tmp = A[0][i]; 
            A[0][i] = A[3][i];
            A[3][i] = tmp; 
        } 
         
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++)  
            System.out.print(A[i][j] + "\t");
            System.out.println(); 
        }
    }
}