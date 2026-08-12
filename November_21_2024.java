import java.util.*; 
@SuppressWarnings("resource")
public class November_21_2024 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int[] F = new int[10];
        int i; 

        System.out.println("Load into array F the factorial of the first 10 integers.\n"); 
        F[0] = 1;
        System.out.println(F[0]);
        for (i = 1; i < F.length; i++) {
            F[i] = F[i - 1] * i; 
            System.out.println(F[i]); 
        }

        System.out.println();
        int[] A = new int[5]; 
        int ii, j, tmp; 

        System.out.println("Sorting integers in ascending order.");
        System.out.print("Enter 5 integers: "); 
        for (ii = 0; ii < A.length; ii++)
        A[ii] = input.nextInt(); 
        
        for (ii = 0; ii < A.length - 1; ii++) { // Sorting occurs here if true
            for (j = ii + 1; j < A.length; j++) {
                if (A[ii] > A[j]) { // Use '<' to sort in descending order
                    tmp = A[ii]; // Ascending / Descending if true
                    A[ii] = A[j];
                    A[j] = tmp;
                }
            }
        }

        for (ii = 0; ii < A.length; ii++) 
        System.out.print(A[ii] + "\t"); 
    }
}