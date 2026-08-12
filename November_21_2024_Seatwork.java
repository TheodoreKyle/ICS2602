import java.util.*;
@SuppressWarnings("resource")
public class November_21_2024_Seatwork {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, tmp1, quiz1, quiz2, quiz3, quiz4;
        double tmp2; 
        int[] S = new int[10]; 
        double[] A = new double[10];

        for (a = 0; a < 10; a++) {
            System.out.print("Enter student number: "); 
            S[a] = input.nextInt(); 
            System.out.print("Enter score of 4 quizzes: "); 
            quiz1 = input.nextInt(); 
            quiz2 = input.nextInt();
            quiz3 = input.nextInt();
            quiz4 = input.nextInt();
            A[a] = (quiz1 + quiz2 + quiz3 + quiz4) / 4.0; 
            System.out.println();
        }

        for (a = 0; a < A.length - 1; a++) {
            for (b = a + 1; b < A.length; b++) {
                if (A[a] < A[b]) {
                    tmp2 = A[a]; 
                    A[a] = A[b]; 
                    A[b] = tmp2;
                    
                    tmp1 = S[a];
                    S[a] = S[b];
                    S[b] = tmp1; 
                }
            }
        }
        System.out.println(); 
        System.out.println("\tTOP FIVE STUDENTS");
        System.out.println("Student Number\t\t  Average");
        for (a = 0; a < 5; a++)
        System.out.println(S[a] + "\t\t\t  " + A[a]); 
    }
}